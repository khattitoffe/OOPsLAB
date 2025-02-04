import java.util.*;
class Exp2_Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape you want the area of");
        String shape=sc.nextLine();
        shape=shape.toLowerCase();
        Exp2_Q4 obj=new Exp2_Q4();
        
        switch(shape){
            case "circle":
                System.out.println("Enter radius of circle");
                double radius=sc.nextDouble();
                obj.area(radius);
                break;
            case "rectangle":
                System.out.println("Enter the length and breath");
                double l=sc.nextDouble(); double b=sc.nextDouble();
                obj.area(l,b);
                break;
            case "square":
                System.out.println("Enter the length of sQuare");
                int length=sc.nextInt();
                obj.area(length);
                break;
            case "triangle":
                System.out.println("Enter the length of sides of triangle");
                double s1=sc.nextDouble(),s2=sc.nextDouble(),s3=sc.nextDouble();
                obj.area(s1,s2,s3);
                break;
            default:
                System.out.println("Enter a valid choice");
        }
        
    }
    
    void area(double radius){
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("Area of circle = "+area);
    }
    void area(double length,double breath){
        double area=length*breath;
        System.out.println("Area of Rectangle = "+area);
    }
    void area(int length){
        double area=Math.pow(length,2);
        System.out.println("Area of square = "+area);
    }
    void area(double s1,double s2,double s3){
        double s=(s1+s2+s3)/2;
        double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("Area of triangle = "+area);
    }
    
}