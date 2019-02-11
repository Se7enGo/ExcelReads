package day0130;

import day0130.entity.Coffee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(BlockJUnit4ClassRunner.class)
public class MainTest {

    @Test
    public void test01(){

        Map<Coffee, List<? extends Coffee>> map = new HashMap<>();
        System.out.println(map.getClass().getName());

        Type type =  map.getClass().getGenericSuperclass();
        Type[] types = ((ParameterizedType)type).getActualTypeArguments();

        Arrays.asList(types).stream()
                .forEach(System.out::println);

    }
}
