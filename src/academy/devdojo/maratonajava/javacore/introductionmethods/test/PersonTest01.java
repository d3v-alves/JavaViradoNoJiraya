package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Douglas");
        person.setAge(20);
        person.printer();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
