package day0211;

public class Insect {

    private int i = 9;
    protected  int j;


    Insect(){
        System.out.println("{" +
                "i=" + i +
                ", j=" + j +
                '}');
        j = 39;
    }

    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s ){
        System.out.println( s );
        return 47;
    }
}

class Bettle extends Insect{

    private int k = printInit("Bettle.k initialized");
    public Bettle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static  Bettle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Bettle constructor");
        Bettle b = new Bettle();
    }

    // 父类static 成员变量 x1加载
    // 子类static 成员变量 x2加载
    // main 方法中的 打印
    // 首先会调用父类的构造方法
    // 打印 i = 9 j = 0 然后再个j赋值39
    // 调用子类的构造方法
    // 这个时候打印 Bettle.k initialized k = 47 懒加载？
    // 这个是否j 已经在父类的构造方法中赋值39 打印j = 39
}
