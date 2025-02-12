package Exp5;

public class WorkerTest {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Alice", 100); 
        Worker salariedWorker = new SalariedWorker("Bob", 20); 

        System.out.println(dailyWorker.name + "'s Weekly Pay: $" + dailyWorker.computePay(48));
        System.out.println(salariedWorker.name + "'s Weekly Pay: $" + salariedWorker.computePay(45)); 
    }
}