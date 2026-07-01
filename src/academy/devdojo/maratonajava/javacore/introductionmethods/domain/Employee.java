package academy.devdojo.maratonajava.javacore.introductionmethods.domain;

public class Employee {
    public String nome = "Douglas";
    public int age = 20;
    public double[] salaries;

    public void printer() {
        System.out.println(this.nome);
        System.out.println(this.age);
        if (salaries == null) {
            return;
        }
        for (double salary : salaries) {
            System.out.print(salary + " ");
        }
        printAverageSalary();
    }

    public void printAverageSalary() {
        if (salaries == null) {
            return;
        }
        double media = 0;

        for (double salary : salaries) {
            media += salary;
        }
        media /= salaries.length;

        System.out.println("\nAverage Salary: " + media);
    }
}
