package by.academy.homework7;

import by.academy.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcSubtractionTest2 {
    @Test
    public void testSum(){
        assertEquals(4, Calculator.subtraction(6,2));
    }
}
