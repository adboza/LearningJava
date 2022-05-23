package Programming.devdojo.javacore.AclassesIntroduction.test;

import Programming.devdojo.javacore.AclassesIntroduction.domain.Calculator;

public class CalcTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int [] numbers = {1,2,3,4,5};
        calculator.sumArray(numbers);
        calculator.sumMultArgs(1,2,2,7,6);
    }
}
