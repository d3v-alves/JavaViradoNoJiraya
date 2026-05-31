package academy.devdojo.maratonajava;

public class RepetitionStructure {
    public static void main(String[] args) {
        // while do while for
        int count = 0;
        int count1 = 0;
        while (count < 10 || count1 < 10) {
            if (count < 10) {
                System.out.print(" " + ++count);
            } else {
                if (count1 == 0) {
                    System.out.println();
                }
                System.out.print(" " + count1);
                count1++;
            }
        }

        count = 0;
        System.out.println();
        do {
            System.out.println(" Inside the do while loop " + ++count);
        } while (count < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.print(" For" + i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();

        for (int j = 0; j <= 50; j++) {
            if (j > 10) {
                break;
            }
            System.out.print(" i=" + j + " ");
        }
        System.out.println();

        double totalAmountBreak = 30000;
        for (int installmentBreak = 1; installmentBreak <= totalAmountBreak; installmentBreak++) {
            double installmentAmountBreak = totalAmountBreak / installmentBreak;
            if (installmentAmountBreak < 1000) {
                break;
            }
            System.out.println(" Installment amount using break= " + installmentBreak + " R$ " + installmentAmountBreak);
        }

        double totalAmountContinue = 30000;
        for (int installmentContinue = (int) totalAmountContinue; installmentContinue >= 1; installmentContinue--) {
            double installmentAmountContinue = totalAmountContinue / installmentContinue;
            if (installmentAmountContinue < 1000) {
                continue;
            }
            System.out.println(" Installment amount using continue  = " + installmentContinue + " R$ " + installmentAmountContinue);
        }
    }
}
