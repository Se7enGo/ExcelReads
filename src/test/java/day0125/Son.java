package day0125;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public abstract class Son<T> extends Parent<T>{

    private String skill;

    private T toy;

    public Son() {
        Type sType = getClass().getGenericSuperclass();
        Type[] generics = ((ParameterizedType) sType).getActualTypeArguments();
        Class<T>  mTClass =  (Class<T>) (generics[0]);
        try {
            toy = mTClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        Method[] methods = toy.getClass().getMethods();
        Arrays.asList(methods).stream().forEach(
                method -> {

                    System.out.println(method.getName());

                    if(method.getName().contains("getName")){

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

                }
        );
        return toy.getClass().getName();
    }

    public T getToy() {
        return toy;
    }

    public Son setToy(T toy) {
        this.toy = toy;
        return  this;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }


}
