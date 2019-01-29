package day0128;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@RunWith(BlockJUnit4ClassRunner.class)
public class GenericTypeTest {

    static class Test1 extends T<Person, Animal> {

    }

    static class Test2 implements I<Person, Animal>, I2<Fruit> {
    }

    static  class Test3<T5> extends T<T5,Object>{

        private T5 temp;


        public Test3(T5 temp){
            this.temp = temp;
        }
        public T5 getTemp() {
            return temp;
        }

        public void setTemp(T5 temp) {
            this.temp = temp;
        }
    }

    public static void main(String[] args) {
        //获取类定义上的泛型类型
        Test1 test1 = new Test1();
        Type types = test1.getClass().getGenericSuperclass();

        Type[] genericType = ((ParameterizedType) types).getActualTypeArguments();
        for (Type t : genericType) {
            System.out.println(t.getTypeName());
        }
        System.out.println("===============================================");

        //获取接口定义上的泛型类型
        Test2 test2 = new Test2();
        //一个类可能实现多个接口,每个接口上定义的泛型类型都可取到
        Type[] interfacesTypes = test2.getClass().getGenericInterfaces();
        for (Type t : interfacesTypes) {
            Type[] genericType2 = ((ParameterizedType) t).getActualTypeArguments();
            for (Type t2 : genericType2) {
                System.out.println(t2.getTypeName());
            }
        }

        System.out.println("===============================================");
        Test3<Integer> test3 = new Test3(6){

            public void printT(Integer integer, Object o) {
                System.out.println("int + " + integer + ",object + " + o.toString());
            }
        };
        //test3.setTemp("'2333");
        Type type = test3.getClass().getGenericSuperclass();
        Type[] types1 = ((ParameterizedType)type).getActualTypeArguments();
        System.out.println(((Class)types1[0]).getName());

        //System.out.println(test3.getTemp().getClass().getName());

    }


    @Test
    public void test01(){

    }
}

class T<T1, T2> {
    public void printT(T1 t1, T2 t2) {
        System.out.println(t1.getClass());
        System.out.println(t2.getClass());
    }
}

interface I<T1, T2> {
}

interface I2<K> {

}

class Person {
    @Override
    public String toString() {
        return "Person Type";
    }
}

class Animal {
    @Override
    public String toString() {
        return "Animal Type";
    }
}

class Fruit {
    @Override
    public String toString() {
        return "Fruit Type";
    }
}