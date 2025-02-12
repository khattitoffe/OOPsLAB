package Exp5;

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int hours) {
        int daysWorked = hours / 8; 
        return daysWorked * salaryRate;
    }
}