package task2;

public class WorkerFixedPayment extends Worker{
    private double paymentPerMonth;

    public WorkerFixedPayment(String name, double paymentPerMonth){
        super(name);
        this.paymentPerMonth = paymentPerMonth;
    }

    @Override
    double salary() {
        return paymentPerMonth;
    }
}
