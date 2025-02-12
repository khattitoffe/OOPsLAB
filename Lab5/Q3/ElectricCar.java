package Exp5;

class ElectricCar extends Car{
    double batteryCapacity;
    double chargingTime;
    
    ElectricCar(String brand,String model,long price,int seatingCapacity,String fuelType,double batteryCapacity,double chargingTime)
    {
        super(brand,model,price,seatingCapacity,fuelType);
        this.batteryCapacity=batteryCapacity;
        this.chargingTime=chargingTime;
    }
    
    void display()
    {
        System.out.println("Brand : "+super.brand);
        System.out.println("Model : "+super.model);
        System.out.println("Price : "+super.price);
        System.out.println("Seating Capacity : "+super.seatingCapacity);
        System.out.println("Fuel Type : "+super.fuelType);
        System.out.println("Battery Capacity : "+batteryCapacity);
        System.out.println("Charging Time : "+chargingTime);
        System.out.println();
    }
}