package day0211;

import day0125.Parent;
import day0125.Son;
import day0130.fibonacci.Fibonacci;

public class TestMain {


    public static void main(String[] args) {

        Parent parent = new Son<String>(){
            @Override
            public void neibuleijiekou(){
                System.out.println("我就是个内部类接口，用于创建内部类对象的");
            }
        };

        System.out.println(parent.getClass().getName());
    }
}
