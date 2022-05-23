package Programming.devdojo.javacore.AclassesIntroduction.domain;

public class Calculator {

    public void sumArray (int [] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }
    public void sumMultArgs (int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }
}
