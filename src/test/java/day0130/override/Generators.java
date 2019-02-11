package day0130.override;

import day0130.Generator;
import day0130.entity.Coffee;
import day0130.impl.CoffeeGenerator;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Generators {


     public static <T> Collection<T> fill(Collection<T> col ,Generator<T> gen ,int n){
         for (int i = 0;i < n ;i ++){
             col.add(gen.next());
         }
         return  col;
     }

    public static <T> List<T> fill(List<T> col , Generator<T> gen , int n){
        for (int i = 0;i < n ;i ++){
            col.add(gen.next());
        }
        return  col;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> col , Generator<T> gen , int n){
        for (int i = 0;i < n ;i ++){
            col.add(gen.next());
        }
        return  col;
    }

    public static void main(String[] args) {
        LinkedList<Coffee> linkedList =  Generators.fill(new LinkedList<Coffee>(),new CoffeeGenerator(),2);
        linkedList.stream().forEach(System.out::println);
    }
}
