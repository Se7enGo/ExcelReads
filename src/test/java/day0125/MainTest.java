package day0125;


import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 这个测试类 主要测试了 内名内部类是如何工作的  以及子类如何 修改父类函数的表现形式
 */
public class MainTest {


    public Parent get(Parent parent){
        System.out.println(" do nothing ");
        System.out.println(parent.getAge());
        //这里可以看出来实际传递进来的类 是什么  //输出上看是个匿名内部类，并非属于Parent 类型的
        System.out.println("我是个啥："+parent.getClass().getName());
        //重写父类的getName方法 在这里就有了不同的表现
        System.out.println("getName 的表现：" + parent.getName());

        return parent;
    };

    public static void main(String[] args) {

        MainTest test = new MainTest();
        Transmachine transmachine = new Transmachine();
        transmachine.setName("霸天虎");
        test.get(
                new Son<Transmachine>() {
                    @Override
                    protected void neibuleijiekou() {
                        //这里一般可以设计成 初始化 父类接口中的参数 什么的
                    }
                }.setToy(transmachine)
        );


        //这里的设计思路梳理一下
        //在父类中我规定了所有的方法 这个方法可以是已经写好实现的通用方法 这个方法也可以是被abstract修饰的抽象方法
        //子类在继承父类的时候也可以有自己的表现形式  具体的方法是拥有自己的成员 变量 和 成员方法
        //当然 在子类拥有自己的实现形式的时候也可以通过override来更改父类的表现形式。
        //在通用接口接收父类对象参数的时候可以传递子类对象 这个时候 就可以在通用接口中调用父类修饰的方法 但是却是子类的表现形式


        //优点：这样设计的优势是我可以通过java的特性 封装 继承 多态 来表现出更为灵活的设计方案，
        //可以在重构的过程中 更符合业务设计 满足更多业务需求的同时 又不更改原有的代码逻辑
        //缺点：这样设计会利用匿名内部类的形式来改变原有的表现形式，如果通过单纯的代码跟踪会无法找到实际运行时的表现

        //补充的知识点
        //1.抽象类也可以继承抽象类，同时不用实现父类中的抽象方法
    }
}
