import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static exercise.FibonacciClass.getSumOfEvenFibonacci;

public class FibonacciClassTest {

    @Test
    public void getSumOfEvenFibTest_0(){
        assertEquals(0, getSumOfEvenFibonacci(0));
    }

    @Test
    public void getSumOfEvenFibTest_1(){
        assertEquals(0, getSumOfEvenFibonacci(1));
    }

    @Test
    public void getSumOfEvenFibTest_3(){
        assertEquals(2, getSumOfEvenFibonacci(2));
    }

    @Test
    public void getSumOfEvenFibTest_10(){
        assertEquals(10, getSumOfEvenFibonacci(12));
    }

    @Test
    public void getSumOfEvenFibTest_20(){
        assertEquals(10, getSumOfEvenFibonacci(20));
    }

    @Test
    public void getSumOfEvenFibTest_4_000_000(){
        assertEquals(4613732, getSumOfEvenFibonacci(4_000_000));
    }
}