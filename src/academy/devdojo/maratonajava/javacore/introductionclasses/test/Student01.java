package academy.devdojo.maratonajava.javacore.introductionclasses.test;

import academy.devdojo.maratonajava.javacore.introductionclasses.domain.Student;

public class Student01 {
    static void main() {
        Student student= new Student();
        student.name = "Douglas";
        student.age = 18;
        student.sexo = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sexo);
    }
}
