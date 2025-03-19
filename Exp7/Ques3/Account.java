package Exp7.Ques3;

class Account implements Bank{
    private double Balance;
    Account()
    {
        Balance=0.0;
    }
    Account(double Balance)
    {
        this.Balance=Balance;
    }
    @Override
    public void deposit(double amount)
    {
        Balance+=amount;
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount>Balance)
        {  
           System.out.println("Not enough Balance");
           return;
        }
        Balance-=amount;
    }
    
    public double getBalance()
    {
        return Balance;
    }
}
