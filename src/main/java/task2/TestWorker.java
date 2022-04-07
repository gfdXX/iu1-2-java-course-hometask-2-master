package task2;

public class TestWorker {
    public static void main(String[] args) {
        Worker worker1 = new WorkerHourlyPayment("Bob", 200);
        System.out.println(worker1.salary());

        Worker worker2 = new WorkerFixedPayment("Bob", 30000);
        System.out.println(worker2.salary());
    }
}
