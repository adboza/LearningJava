package Programming.devdojo.javacore.AclassesIntroduction.test;

import Programming.devdojo.javacore.AclassesIntroduction.domain.Employees;

public class EmployeeTest01 {
    private static Employees employees;

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.name = "Vegeta";
        employees.age= 23;
        employees.wage = new double[]{1200,987.32,2000};

        //Employees.printThing();
    }
}
