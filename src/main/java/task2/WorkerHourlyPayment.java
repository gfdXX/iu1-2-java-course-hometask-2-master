package task2;

public class WorkerHourlyPayment extends Worker{
    private double paymentPerHour;

    public WorkerHourlyPayment(String name, double paymentPerHour){
        super(name);
        this.paymentPerHour = paymentPerHour;
    }
    @Override
    double salary() {
        return 20.8 * 8 * paymentPerHour;
    }
}
