package Exp5;

abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void performDuty();
}
