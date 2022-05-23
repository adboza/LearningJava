package Programming.devdojo.javacore.AclassesIntroduction.test;

import Programming.devdojo.javacore.AclassesIntroduction.domain.Employees;



public class EmployeeTest01 {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.setName("Vegeta");
        employees.setAge(23);
        employees.setWage(new double[]{1200,987.32,2000});

        //Employees.printThing();
    }
}
