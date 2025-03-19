package Exp7;

class Rectangle extends Shape{
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    
    @Override
    public double calculateArea(){
        return length*breadth;
    }
}