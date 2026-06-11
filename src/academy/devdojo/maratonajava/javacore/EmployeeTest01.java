package academy.devdojo.maratonajava.javacore;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.nome = "Douglas";
        employee.age = 20;
        employee.salaries = new double[]{1200, 987.32, 2000};

        employee.imprimir();
    }
}
