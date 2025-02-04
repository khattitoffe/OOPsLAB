import java.util.*;
class Exp2_Q3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int day=sc.nextInt();
        
        Exp2_Q3 obj=new Exp2_Q3();
        obj.weekDay(day);
    }
    void weekDay(int day)
    {
        switch(day){
            case 1: 
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number corresponding to a week day");
        }
    }
}