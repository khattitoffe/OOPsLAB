class BankAccount{
    private double Balance=0;
    
    public void deposit(double amount)
    {
        Balance=amount;
        System.out.println("Amount deposited");
        System.out.println("Available balance : "+Balance);
    }
    
    protected void withdraw(double amount)
    {
        if(amount>Balance)
        { 
          System.out.println("Insufficient Funds");
          return;
        }
        
        Balance=Balance-amount;
        System.out.println("Funds Withdrawn \n Remaining Funds : Balance");
    }
    
    void checkBalance()
    {
        System.out.println("Your Balance : "+Balance);
    }
    
    public static void main(String[] args)
    {
        BankAccount obj=new BankAccount();
        System.out.println("Accessing Balance variable from within class : "+obj.Balance);
        
        System.out.println("Accessing deposit from Within class");
        obj.deposit(5000.0);
        
        System.out.println("Accessing withdraw from withing class");
        obj.withdraw(400.9);
        
        System.out.println("Accessing checkBalance from inside class");
        obj.checkBalance();
    }
}