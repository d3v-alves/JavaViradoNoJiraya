package academy.devdojo.maratonajava.javacore.introductionmethods.domain;

public class Calculator {

    public void addTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(10 - 20);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do changeTwoNumbers");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numbers) {
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numbers) {
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }
}
