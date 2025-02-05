class BankAccountOutside{
     public static void main(String[] args)
    {
        BankAccount obj=new BankAccount();
        System.out.println("Accessing Balance variable from outside class : "+obj.Balance);
        
        System.out.println("Accessing deposit from outside class");
        obj.deposit(5000.0);
        
        System.out.println("Accessing withdraw from outside class");
        obj.withdraw(400.9);
        
        System.out.println("Accessing checkBalance from outside class");
        obj.checkBalance();
    }
}