package day0328;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMain {

    @Test
    public void testForThreeNum(){
        //这个方法旨在输出

    }

    //输出所有 不重复的 几位数组合
    @Test
    public void testForNoRepeatCollection(){

        Integer [] ints = {1,2,3,4,5,6/*,7,8,9,10*/};
        List<Integer> integers = Arrays.asList(ints);

        Set<Integer> set = new LinkedHashSet();
        set.addAll(integers);


        List<List> result = new ArrayList<>();

        int num = 3;
        for(int i = 1;i<= num;i++){
            int ii = i;
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(integers.get(i-1));
             while(ii++ > i && ii <= num){

             }
        }

    }


}
