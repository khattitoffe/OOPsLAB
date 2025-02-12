package Exp5;

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void performDuty() {
        System.out.println(name + " is studying for exams.");
    }
}