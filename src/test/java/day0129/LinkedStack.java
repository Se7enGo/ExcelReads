package day0129;

import java.util.Arrays;

/**
 * 创建一个堆栈
 *  这个堆栈要满足一下功能
 *  可以存储任何类型的节点
 *  每次都放在栈顶
 *  每次取出都取栈顶的对象
 *  可以判断是否已经取完了
 * @param <T>
 */
public class LinkedStack<T> {

    private static class Node<U>{

        U item;
        Node<U> next;
        Node(){ item = null;next = null;}
        Node(U item,Node<U> next){
            this.item = item;
            this.next = next;
        }
        boolean isEnd(){
            return  item == null && next == null;
        }


        public static void main(String[] args) {
            LinkedStack<String> stack = new LinkedStack<>();
            Arrays.asList("Give me five".split(" "))
                    .stream().forEach(s -> {
                stack.push(s);
            });

            do{
                System.out.println(stack.pop());
            }while (!stack.isEnd());
        }

    }
    private Node<T> top = new Node<T>();
    public void push(T item){
        top = new Node<>(item,top);
    }

    public T pop(){
        T item = top.item;
        if(!top.isEnd()){
            top = top.next;
        }
        return  item;
    }

    public boolean isEnd (){

        return top.item == null && top.next == null;
    }


}
