package Programming.devdojo.javacore.AclassesIntroduction.test;

import Programming.devdojo.javacore.AclassesIntroduction.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher professor = new Teacher();
        professor.name = "Master Kami";
        professor.age = 140;
        professor.gender = 'M';

        System.out.println(professor.name+", age:"+professor.age+", gender:"+professor.gender);
    }
}
