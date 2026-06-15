package academy.devdojo.maratonajava.javacore.introductionclasses.test;

import academy.devdojo.maratonajava.javacore.introductionclasses.domain.Student;

public class Student02 {
    static void main() {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Douglas";
        System.out.println(student01.name);
        System.out.println("----------------------------");

        student02.name = "Alves";
        System.out.println(student02.name);
    }
}
