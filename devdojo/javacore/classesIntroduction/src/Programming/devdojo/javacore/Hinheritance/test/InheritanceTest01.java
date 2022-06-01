package Programming.devdojo.javacore.Hinheritance.test;

import Programming.devdojo.javacore.Hinheritance.domain.Address;
import Programming.devdojo.javacore.Hinheritance.domain.Employee;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address("12th Ave","12345");
//        address.setStreet("12th Ave");
//        address.setZipcode("12345");
        Employee employee = new Employee("Toyoshisa Shimazu");
        employee.setSalary(120000);
        employee.setAddress(address);
        employee.print();
        System.out.println("----------");
    }
}
