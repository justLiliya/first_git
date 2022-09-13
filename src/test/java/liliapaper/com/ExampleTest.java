package liliapaper.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    public void someTest(){
        Assertions.assertTrue(new Random().nextInt() >1);
    }

    @Test
    public void someTest2(){
        Assertions.assertTrue(10>2);
    }
}
