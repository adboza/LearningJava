package Programming.devdojo.javacore.Kenum.domain;

public class Customer {
    public enum PaymentType{
        DEBIT, CREDIT;
    }
    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType.getReportValue() +
                ", customerType=DatabaseValue=" + customerType.getDbValue() +
                ", paymentType=" + paymentType +
                '}';
    }
}
