package academy.devdojo.maratonajava.introduction.arrays;

public class ArraysLesson {
    static void main() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] ages = new int[10];
        int[] numbers2 = {1, 2, 3, 4, 5};
        for (int age = 0; age < ages.length; age++) {
            ages[age] = age * 2;
            System.out.print(ages[age]);
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();

        String[] strings = {"a", "b", "c"};
        for (int i = 0; i < 3; i++) {
            System.out.print(strings[i]);
        }
        System.out.println();

        for (int num : numbers2) {
            System.out.print(num);
        }
    }
}
