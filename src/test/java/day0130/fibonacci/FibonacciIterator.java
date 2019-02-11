package day0130.fibonacci;

import java.util.Iterator;

public class FibonacciIterator  implements  Iterable<Integer> {

    private int count = 0;
    private int end ;
    public FibonacciIterator(int end ){
        this.end = end;
    }

    private Fibonacci fibonacci = new Fibonacci();

    @Override
    public Iterator<Integer> iterator() {
        return new FibIterator();
    }

    class FibIterator implements  Iterator<Integer>{

        @Override
        public boolean hasNext() {
            count ++ ;
            return end > 0?count < end : -1 > 0;
        }

        @Override
        public Integer next() {
            fibonacci.setCount(count);
            return fibonacci.next();
        }
    }
}
