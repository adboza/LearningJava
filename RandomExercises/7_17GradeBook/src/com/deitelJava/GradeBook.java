package com.deitelJava;

public class GradeBook {
    private String courseName;
    private int [] [] grades;

    public GradeBook(String courseName, int [][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void processGrades(){
        //output grades array
        outputGrades();

        //call methods get minimum get maximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "lowest grade in the grade book is ", getMinimum(),
                "Highest grade in the rade book is ", getMaximum());
        //output grade distribution chart (havent done yet line 34)

    }
    //output barchart displaying overall grade (havent done yet, line89)

    public int getMinimum(){
        // assume first element of grades array is smallest
        int lowGrade = grades[0][0];

        //loop through rows of grades array
        for (int[] studentGrades : grades){
            //loop through columns of current row
            for (int grade : studentGrades){
                //if grade less than lowGrade, assign it to lowGrade
                if(grade<lowGrade){
                    lowGrade=grade;
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        //assume frist element of grades array is largest
        int highGrade = grades[0][0];
        //loop through rows of grades array
        for (int[] studentGrades : grades){
            //loop through columns of current row
            for( int grade : studentGrades){
                if(grade>highGrade){
                    highGrade=grade;
                }
            }
        }
        return highGrade;
    }

    public double getAverage (int [] setOfGrades){
        int total = 0;
        //sum grades for one student
        for(int grade:setOfGrades){
            total+=grade;
        }
        //return average of grades
        return (double) total / setOfGrades.length;
    }
    //output the contents of the grades array
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("             ");//align column heads
        //create a column heading for each of the tests
        for (int test = 0; test< grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }
        System.out.println("Average");//student average column heading
        //create rows/columns of text representing array grades
        for (int student=0;student< grades.length;student++) {
            System.out.printf("Student %2d", student+1);
            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }
            //call method getAverage to calculate student's average grade;
            //pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
