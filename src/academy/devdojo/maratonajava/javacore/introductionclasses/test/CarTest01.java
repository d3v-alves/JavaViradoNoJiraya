package academy.devdojo.maratonajava.javacore.introductionclasses.test;

import academy.devdojo.maratonajava.javacore.introductionclasses.domain.Car;

public class CarTest01 {
    static void main() {
        Car car = new Car();
        car.name = "Corvette C2";
        car.model = "Chevrolet";
        car.year = 1963;

        System.out.println("Name " + car.name + "\n" + "Model " + car.model + "\n" + "Year " + car.year);
    }
}
