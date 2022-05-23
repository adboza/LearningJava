package Programming.devdojo.javacore.Fstaticmodifier.test;

import Programming.devdojo.javacore.Fstaticmodifier.domain.Car;

public class CarTest02 {
    public static void main(String[] args) {
        System.out.println(Car.getSpeedLimit());//it is static and doesn't need the object to be initialized

        Car car1 = new Car ("BMW", 270);
        Car car2 = new Car ("Mercedes", 285);
        Car car3 = new Car ("Audi", 290);

        //car1.setSpeedLimit(180);//take a look on the print method of the class comment
        Car.setSpeedLimit(180);

        car1.print();
        car2.print();
        car3.print();
    }
}
