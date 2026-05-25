package academy.devdojo.maratonajava;

public class Operators {
    static void main() {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        System.out.println(num2 + num1);
        System.out.println(num2 - num1);
        System.out.println(num2 / num1);
        System.out.println(num2 * num1);
        System.out.println("Value is " + (num2 + num1));
        System.out.println("Value is " + num2 + num1);
        System.out.println(num2 + num1 + " Value " + num2 + num1);
        // %
        int resto = 21 % 5;
        int resto1 = 4 % 2;
        System.out.println(resto);
        System.out.println(resto1);
        // < > <= >= == !=
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;
        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 == num2;
        System.out.println(isGreater);
        System.out.println(isLess);
        System.out.println(isGreaterOrEqual);
        System.out.println(isLessOrEqual);
        System.out.println(isEqual);
        System.out.println(isNotEqual);
        //&& (and) || (or) ! (not)
        int age = 35;
        float salary = 3500f;
        boolean lawGreater = age >= 35 && salary >= 3500;
        boolean lawLess = age < 30 && salary >= 3381;
        System.out.println(lawGreater);
        System.out.println(lawLess);
        double totalValue = 200;
        double totalValue1 = 10000;
        float valuePs5 = 5000f;
        boolean canBuyPs5 =  totalValue >= valuePs5 || totalValue1 >= valuePs5;
        System.out.println(canBuyPs5);
        // = += -= *= /= %=
        double bonus = 1800;
        bonus +=  1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
        // ++ --
        int counter = 0;
        int counter2 = 0;
        System.out.println(++counter);
        System.out.println(counter2++);
        System.out.println(counter2);
    }
}

