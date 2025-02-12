package Exp5;

class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }
     
    public void performDuty() {
        System.out.println(name + " is teaching a class.");
    }
}