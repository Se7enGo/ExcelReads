package day0130.impl;

import day0130.Generator;
import day0130.entity.*;

import java.util.*;
import java.util.stream.Stream;

public class CoffeeGenerator implements Generator<Coffee> , Iterable<Coffee> {

    private Class<?>[] types = {Latte.class, Mocha.class, Americano.class, Breve.class,Cappuccino.class};

    private Random random = new Random(32);

    private int length ;

    public CoffeeGenerator(){}

    public CoffeeGenerator(int length){this.length = length ;}

    public void sa(String str ,int a ){

    }
    public Coffee sa(int a,String str){
        return  null;
    }

    /**
     * 泛型函数
     * @param s
     * @param t
     * @param <S>
     * @param <T>
     * @return
     */
    public static <S,T extends Generator,String> T saySomthing(S s,T t,int a,
                                                               String b){
        Map<Coffee, List<? extends Coffee>> map = new HashMap<>();
        return t;
    }

    class CoffeeIterator implements  Iterator<Coffee> {

        private int count = length;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count --;
            return CoffeeGenerator.this.next();
        }
    }

    @Override
    public Coffee next() {
        try {
            return  (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e)  {
            throw  new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
       CoffeeGenerator coffees = new CoffeeGenerator();
        for (int i = 0;i < 5;i ++ ){
            System.out.println(coffees.next());
        }

        for(Coffee c : new CoffeeGenerator(5)){
            System.out.println(c);
        }

    }

    //这个Generator 的模式练习  是为了生产某种类型的对象 得到的启示：
    //1.一个接口最好很简练  只负责一件事就好
    //2. Class.this 代表当前调用的对象 放在增强for循环中就是 实现了 Iterable接口的对象
    //3.
}
