package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest03 {
    static void main() {
        Calculator calc = new Calculator();
        double result = calc.divideTwoNumbers(10, 20);
        System.out.println(result);
    }
}
