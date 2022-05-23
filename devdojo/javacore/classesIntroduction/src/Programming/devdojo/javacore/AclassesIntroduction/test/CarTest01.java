package Programming.devdojo.javacore.AclassesIntroduction.test;

import Programming.devdojo.javacore.AclassesIntroduction.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.name = "Beetle";
        car1.model="Sport";
        car1.year=1969;

        car2.name = "Mustang";
        car2.model="GT 500";
        car2.year=1960;

        System.out.println(car1.name+" "+car1.model+" "+car1.year);
        System.out.println(car2.name+" "+car2.model+" "+car2.year);

        car1.printCar(car1.name, car1.model,car1.year);
        car3.printCar("Corsa", "Joy", 2008);
    }
}
