package com.deitelJava;

public class GradeBook2 {
//    instantiate
    public String courseName;
    public int [] [] grades;
    //constructor
    public GradeBook2 (String courseName, int [] [] grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    //set
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //get
    public String getCourseName(){
        return courseName;
    }


    //methods
    public void processGrades(){
        outputGrades();
    }
    //Average
    public double getAverage(int [] setOfGrades){
        int total=0;
        for (int grade : setOfGrades){
            total+=grade;
//            System.out.printf( %d, %d",grade,setOfGrades,total);
        }
        return (double) total / setOfGrades.length;
    }

    public void outputGrades(){
        System.out.println("The grades are:");
        System.out.print("               ");
        //create headings
        for (int test=0; test< grades[0].length; test++){
            System.out.printf("Test %d ", test+1);
        }
        System.out.println(" Average");

        for (int student=0; student< grades.length;student++){
            System.out.printf("Student %2d:",student+1);
            //Print grades for each student and each test
            for (int test : grades[student]){
                System.out.printf("%8d",test);
            }



            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n",average);
        }


    }
}
