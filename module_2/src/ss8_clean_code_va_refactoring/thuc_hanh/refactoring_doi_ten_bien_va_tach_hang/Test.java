package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_doi_ten_bien_va_tach_hang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    void testCalculateAdd() {
        int firstOperand  = 1;
        int secondOperand  = 1;
        char operator  = '+';

        int expected = 2;

        int resutl = Calculator.calculate(firstOperand , secondOperand , operator );
        assertEquals(expected, resutl);
    }

    void testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

   private void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    void testCalculateDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(a, b, o);
                });
    }

    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(a, b, o);
                });
    }
}
