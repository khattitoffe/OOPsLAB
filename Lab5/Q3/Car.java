package Exp5;
class Car extends Vehicle{
    int seatingCapacity;
    String fuelType;
    Car(String brand,String model,long price,int seatingCapacity,String fuelType)
    {
        super(brand,model,price);
        this.seatingCapacity=seatingCapacity;
        this.fuelType=fuelType;
    }
    
    void display()
    {
        System.out.println("Brand : "+super.brand);
        System.out.println("Model : "+super.model);
        System.out.println("Price : "+super.price);
        System.out.println("Seating Capacity : "+seatingCapacity);
        System.out.println("Fuel Type : "+fuelType);
        
        System.out.println();
    }
}