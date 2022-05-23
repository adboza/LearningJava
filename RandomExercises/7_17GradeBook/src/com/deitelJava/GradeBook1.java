package com.deitelJava;

public class GradeBook1 {
    private int [] [] grades;
    private String courseName;

    public GradeBook1(String courseName, int [] [] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void processGrades(){
        //output grades array
        outputGrades();
    }

    private double getAverage(int [] setOfGrades){
        int total = 0;
        for (int grade:setOfGrades){
            total+=grade;
        }
        return (double) total/ setOfGrades.length;
    }

    private void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("             ");//align column heads
        //create a column heading for each of the tests
        for (int test = 0; test<grades[0].length;test++){
            System.out.printf("Test %d  ", test+1);
        }

        System.out.println("Average");

        for (int student=0; student< grades.length;student++){
            System.out.printf("Student%2d", student+1);
            for (int test:grades[student]){
                System.out.printf("%8d", test);
            }
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
