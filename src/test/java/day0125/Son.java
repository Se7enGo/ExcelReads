package day0125;

import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class Son<T> extends Parent<T>  {

    private String skill;

    private T toy;

    public Son() {
        Type sType = getClass().getGenericSuperclass();
        Type[] generics = ((ParameterizedType) sType).getActualTypeArguments();
        Class<T> mTClass = null;
        if(generics[0] instanceof TypeVariableImpl){
            throw new RuntimeException("没有找到具体的类型，请使用匿名内部类的创建形式！");
        }else {
            mTClass = (Class<T>) (generics[0]);
        }

        try {
            toy = mTClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void neibuleijiekou() {

    }

    @Override
    public String getName() {
        Method[] methods = toy.getClass().getMethods();
        Arrays.asList(methods).stream().filter(method ->
                method.getName().contains("getName")
        ).forEach(
                method -> {
                    System.out.println("我要 getName 了");
                    try {
                        String name = (String) method.invoke(toy);
                        System.out.println("toy getName : 我的名字是" + name);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
        );
        return toy.getClass().getName();
    }

    public T getToy() {
        return toy;
    }

    public Son setToy(T toy) {
        this.toy = toy;
        return this;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }


}
