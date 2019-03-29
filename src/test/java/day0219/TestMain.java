package day0219;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMain {


    @Test
    public void test001(){
        String filePath = "\\file\\324124321.xls";
        System.out.println(filePath.contains("xls"));

    }

}
