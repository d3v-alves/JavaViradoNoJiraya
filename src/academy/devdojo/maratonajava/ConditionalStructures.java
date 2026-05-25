package academy.devdojo.maratonajava;

public class ConditionalStructures {
    static void main() {
        int age = 20;
        boolean authorizedToPurchaseAlcohol = age >= 18;
        if (authorizedToPurchaseAlcohol) {
            System.out.println("Alcohol Authorized to purchase");
        } else {
            System.out.println("Not Alcohol Authorized to purchase");
        }
        if (!authorizedToPurchaseAlcohol) {
            System.out.println("Not Alcohol Authorized to purchase");
        }

        int ageSoccer = 15;
        if (ageSoccer < 15) {
            System.out.println("Children's category");
        } else if (ageSoccer >= 15 && ageSoccer < 18) {
            System.out.println("Youth category category");
        } else {
            System.out.println("Adult category");
        }

        double salary = 6000;
        String Donate = "I will donate";
        String notDonate = "I will not donate";
        String result;
        if (salary > 5000) {
            result = Donate;
        } else {
            result = notDonate;
        }
        System.out.println(result);

        String result1 = salary > 6000 ? Donate : notDonate;
        System.out.println(result1);
        double annualSalary = 70000;
        double firstTrack = 9.70 / 100;
        double secundTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double taxAmount;
        if (annualSalary <= 34712) {
            taxAmount = annualSalary * firstTrack;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            taxAmount = annualSalary * secundTrack;
        } else {
            taxAmount = annualSalary * thirdTrack;
        }
        System.out.println(taxAmount);

        byte day = 5;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        byte day1 = 5;
        switch (day1) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        byte day2 = 10;
        switch (day2) {
            case 1, 7 -> System.out.println("Weekend");
            case 2, 3, 4, 5, 6 -> System.out.println("Business day");
            default -> System.out.println("Unexpected value");
        }
    }
}
