package day0130.fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestForFibonacci {

    @Test
    public void test01(){

        for(Integer i : new FibonacciIterator(18)){

            System.out.println(i);

        }
    }
}
