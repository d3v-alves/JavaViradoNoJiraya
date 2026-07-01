package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.domain.Student;
import academy.devdojo.maratonajava.javacore.introductionmethods.domain.StudentPrinter;

public class StudentTest02 {
    static void main() {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Ragnar";
        student01.age = 30;
        student01.sex = 'M';

        student02.name = "Loki";
        student02.age = 30;
        student02.sex = 'M';

        student01.print();
        student02.print();
    }
}
