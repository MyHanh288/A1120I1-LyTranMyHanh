package _b8_clean_code_refactoring.thuc_hanh.doi_ten_bien_tach_hang;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public static final char Addition = '+';
    public static final char Subtraction = '-';
    public static final char Mutilplication = '*';
    public static final char Division = '/';


    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = Addition;
        int expected = 2;

        int result = Caculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = Subtraction;
        int expected = 1;

        int result = Caculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = Mutilplication;
        int expected = 4;

        int result = Caculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char operator = Division;
        int expected = 2;

        int result = Caculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = CalculatorTest.Division;

        assertThrows(RuntimeException.class,
                ()-> {Caculator.calculate(firstOperand, secondOperand, operator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {Caculator.calculate(firstOperand, secondOperand, operator);});
    }
}