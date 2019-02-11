package day0130;

public interface Generator<T> {
    //生成泛型指定类型的对象
    T next();
}
