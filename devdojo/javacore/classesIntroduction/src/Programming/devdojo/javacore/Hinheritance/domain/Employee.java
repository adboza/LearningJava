package Programming.devdojo.javacore.Hinheritance.domain;

public class Employee {
    protected String name;
    protected int secNumber;
    protected Address address;
    protected double salary;

    public Employee(String name){
        super();
        this.name=name;
    }

    public Employee(String name, int secNumber) {
        this(name);
        this.secNumber = secNumber;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.secNumber);
        System.out.println(this.salary);
        System.out.println(this.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecNumber() {
        return secNumber;
    }

    public void setSecNumber(int secNumber) {
        this.secNumber = secNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
