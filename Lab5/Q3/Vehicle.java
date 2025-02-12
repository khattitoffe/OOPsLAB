package Exp5;

class Vehicle{
    String brand;
    String model;
    long price;
    
    Vehicle(String brand,String model,long price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    
    void display()
    {
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}