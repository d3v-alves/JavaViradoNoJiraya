package academy.devdojo.maratonajava.introduction.arrays;

public class MultidimensionalArrays {
    static void main() {
        int[] array = {1, 2, 3, 4, 5, 6,};
        int[][] arrayInt02 = new int[3][];
        int[][] arrayInt01 = {{1, 2}, {1, 2, 3, 4}, {5, 6, 7, 8, 9, 10}};

        arrayInt02[2] = array;
        arrayInt02[0] = new int[8];
        arrayInt02[1] = new int[]{1, 2, 3, 4};

        for (int[] arrayBase01 : arrayInt02) {
            for (int num : arrayBase01) {
                System.out.print(num);
            }
            System.out.println();
        }

//        for (int[] arrayBase : arrayInt01) {
//            for (int num : arrayBase) {
//                System.out.print(num);
//            }
//        }
    }
}
