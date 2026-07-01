package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.nome = "Douglas";
        employee.age = 20;
        employee.salaries = new double[]{1200, 987.32, 2000};

        employee.printer();
    }
}
