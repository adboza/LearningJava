package Programming.devdojo.javacore.Kenum.test;

import Programming.devdojo.javacore.Kenum.domain.Customer;
import Programming.devdojo.javacore.Kenum.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa", CustomerType.COMPANY, Customer.PaymentType.DEBT);
        Customer customer2 = new Customer("Akira", CustomerType.INDIVIDUAL, Customer.PaymentType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);


    }
}
