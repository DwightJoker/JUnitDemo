package by.academy.homework7;

import by.academy.Calculator;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcAdditionTest1 {
    @Test
    public void testSum(){
        assertEquals(5, Calculator.addition(2,3));
    }


}
//1) создаем 3 класса-теста
//2) каждый из которых будет тестировать одну функцию калькулятора
//3) протестировать методы 3 наборами данных (используем Parametrize)
//4) написать 2 класса, в которых вы напишите тесты на Math библиотеку( любую функцию), объеденить их в Test Suite.
//5) добавить CalculatorTestListener, переопределить, метод который вызывается на успешное завершение теста и выводит на экран название нашего метода.