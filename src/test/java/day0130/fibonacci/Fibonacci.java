package day0130.fibonacci;

import day0130.Generator;

public class Fibonacci implements Generator<Integer> {

    private int count ;

    @Override
    public Integer next() {
        return fib(count);
    }

    public Integer fib(int n){

        if(n < 2){
            return 1;
        }
        return fib(n-1) + fib(n -2);
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
