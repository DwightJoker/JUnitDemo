package by.academy;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import  static  org.junit.Assert.*;


public class CalcTest {

    @Test
    public void testSum(){
        assertEquals(5, Calculator.addition(2,3));
    }
    @Test
    public void testSameStrings(){
        String a = "abc";
        assertSame("abc",a);
    }
    @Test
    public void testNotSameStrings(){
        String a = "abs";
        assertNotSame("abc",a);
    }
    @Test()
    public void testTrue(){
        assertTrue(true);
    }
    @Test(timeout = 1000)
    public void testTimeout(){
        while(true){
            break;
        }
    }
    @Test(expected = ArithmeticException.class)
    public void testExeption(){
        int number = 4 / 0;
    }


    @Test
    @Ignore
    public void testMult(){
        assertEquals(4, 3 * 2);
    }
}
