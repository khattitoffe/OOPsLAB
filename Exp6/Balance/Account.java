package Exp6.Balance;

public class Account
{
    private double Balance;
    
    public Account()
    {
        Balance=0.0;
    }
    
    public Account(double Balance)
    {
        this.Balance=Balance;
    }
    
    public void Display_Balance()
    {
        System.out.println("Balance : "+Balance);
    }
    
    public void setBalance(double Balance)
    {
        this.Balance=Balance;
    }
    
    public double getBalance()
    {
        return Balance;
    }
}
