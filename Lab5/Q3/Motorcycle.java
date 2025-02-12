package Exp5;

class Motorcycle extends Vehicle{
    double engineCapacity;
    String type;
    Motorcycle(String brand,String model,long price,double engineCapacity,String type)
    {
        super(brand,model,price);
        this.engineCapacity=engineCapacity;
        this.type=type;
    }
    
    void display()
    {
        System.out.println("Brand : "+super.brand);
        System.out.println("Model : "+super.model);
        System.out.println("Price : "+super.price);
        System.out.println("engineCapacity : "+engineCapacity);
        System.out.println("Type : "+type);
        System.out.println();
    }
}