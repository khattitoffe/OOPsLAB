package Exp5;

class Player{
    String name;
    int age;
    String position;
        
    public static void main(String args[])
    {
        
    }
    
    Player(String name,int age,String position)
    {
        this.name=name;
        this.age=age;
        this.position=position;
    }
    
    void play()
    {
        System.out.println("Player "+name+" is playing at the position "+position+" at the age of "+ age);
    }
    
    void train()
    {
        System.out.println(name+" is training");
    }
}