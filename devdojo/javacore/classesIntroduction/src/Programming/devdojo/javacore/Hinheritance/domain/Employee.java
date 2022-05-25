package Programming.devdojo.javacore.Hinheritance.domain;

public class Employee {
    private String name;
    private int secNumber;

    public Employee(String name, int secNumber) {
        this.name = name;
        this.secNumber = secNumber;
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
}
