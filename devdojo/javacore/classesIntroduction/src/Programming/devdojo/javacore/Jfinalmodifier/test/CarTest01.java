package Programming.devdojo.javacore.Jfinalmodifier.test;

import Programming.devdojo.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);
    }
}
