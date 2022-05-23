package Programming.devdojo.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double speedLimit= 250.0;
    //line below was changed above for CarTest2
    //public static double speedLimit= 250.0;//saying it belongs to Car class and not the objects

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public void print(){
        System.out.println("-----------");
        System.out.println("Name "+this.name);
        System.out.println("Max speed: "+this.maxSpeed);
        System.out.println("Speed Limit: "+Car.speedLimit);//if you want that to be the Class attribute do not use this.speedLimit
    }

    public static void setSpeedLimit(double speedLimit){ //the getters and setters for static!!!
        Car.speedLimit = speedLimit;
    }
    public static double getSpeedLimit(){
        return Car.speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
//
//    public double getSpeedLimit() {// pretend set and get were deleted
//        return speedLimit;
//    }
//
//    public void setSpeedLimit(double spreedLimit) {
//        this.speedLimit = spreedLimit;
//    }
}
