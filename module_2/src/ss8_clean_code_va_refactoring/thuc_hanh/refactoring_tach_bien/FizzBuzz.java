package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_tach_bien;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 3 == 0;
        if (isFizz && isBuzz) {
            System.out.println("FizzBuzz");
        }
        if (isFizz) {
            System.out.println("Fizz");
        }
        if (isBuzz) {
            System.out.println("Buzz");
        }
        return number + "";
    }
    //test Fizz Buzz
    class FizzBuzzTest {
        void testFizz3() {
            int number = 3;
            String expected = "Fizz";
            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }

        private void assertEquals(String expected, String result) {
        }

        void testFizz6() {
            int number = 6;
            String expected = "Fizz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }

        void testBuzz5() {
            int number = 5;
            String expected = "Buzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }

        void testBuzz10() {
            int number = 10;
            String expected = "Buzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }

        void testFizzBuzz15() {
            int number = 15;
            String expected = "FizzBuzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }

        void testFizzBuzz30() {
            int number = 30;
            String expected = "FizzBuzz";

            String result = FizzBuzz.fizzBuzz(number);
            assertEquals(expected, result);
        }
    }
}
