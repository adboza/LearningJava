package Programming.devdojo.javacore.AclassesIntroduction.test;

import Programming.devdojo.javacore.AclassesIntroduction.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tomoyo");
        person.setAge(10);
        person.inPrint();

    }

}
