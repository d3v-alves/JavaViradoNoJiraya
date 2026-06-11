package academy.devdojo.maratonajava.javacore;

public class Employee {
    public String nome = "Douglas";
    public int age = 20;
    public double[] salaries;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.age);
        for (double salary : salaries) {
            System.out.println(salary + " ");
        }
    }
    public void imprimirMediaSalarioal() {
        double media = 0;
        for (double salary : salaries) {
            media += salary;
        }
        media /= salaries.length;
        System.out.println("\nMedia salarial: " + media);
    }
}
