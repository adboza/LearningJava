package Programming.devdojo.javacore.AclassesIntroduction.domain;

public class Employees {

    private String name;
    private int age;
    private double [] wage;

    public void printThing(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(wage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getWage() {
        return wage;
    }

    public void setWage(double[] wage) {
        this.wage = wage;
    }
}
