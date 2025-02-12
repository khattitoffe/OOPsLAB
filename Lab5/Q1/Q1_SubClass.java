package Exp5;
class Q1_SubClass extends Q1_ParentClass{
    private String className="Q1_SubClass";
    public static void main(String[] args){
        Q1_SubClass obj=new Q1_SubClass();
        obj.display();
    }
    public void display()
    {
        System.out.println("Class name of Sub class = "+ className);
        System.out.println("Class name of super class = "+ super.className);
       
    }
    public void displayNew()
    {
        System.out.println("Class name of Sub class = "+ className);
        System.out.println("Class name of super class by Object = "+ new Q1_ParentClass() .className); 
    }
}
