package Exp5;

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Fixed weekly salary for 40 hours, regardless of hours worked
    @Override
    public double computePay(int hours) {
        return salaryRate * 40; 
    }
}
