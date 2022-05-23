package com.deitelJava;
/*This exercise is based on Deitels' book Java how to program, this is  an
* example of composition, a class with references to objects of other classes as members*/
public class Main {
//creates two date objects to represent an Employee's birthday and hire date...
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        System.out.println(employee);
	// write your code here
    }
}
