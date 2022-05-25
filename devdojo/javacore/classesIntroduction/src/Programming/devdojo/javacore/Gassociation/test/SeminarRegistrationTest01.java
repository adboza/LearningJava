package Programming.devdojo.javacore.Gassociation.test;

import Programming.devdojo.javacore.Gassociation.domain.Place;
import Programming.devdojo.javacore.Gassociation.domain.Professor;
import Programming.devdojo.javacore.Gassociation.domain.Seminar;
import Programming.devdojo.javacore.Gassociation.domain.Student;

/*Create a small system that will manage seminars refistration
* 1 student : 1 seminar
* 1 seminar: zero or several students
*  1 professor: minister one or several seminars
*  1 seminar must have one place */
public class SeminarRegistrationTest01 {
    public static void main(String[] args) {
        Place place = new Place("UFPR");
        Student student = new Student("Luffy", 22);
        Student[] seminarStudents = {student};
        Seminar seminar = new Seminar("Finding one piece", seminarStudents, place);
        Seminar[] availableSeminars = {seminar};
        Professor professor = new Professor("White Beard","Pirates", availableSeminars);

        professor.print();
    }
}
