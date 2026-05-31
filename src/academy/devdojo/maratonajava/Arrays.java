package academy.devdojo.maratonajava;

public class Arrays {
    static void main() {
        int[] ages = new int[10];
        for (int age = 0; age < ages.length; age++) {
            ages[age] = age * 2;
            System.out.println(ages[age]);
        }

        String[] strings = {"a", "b", "c"};
        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);

        }


    }
}
