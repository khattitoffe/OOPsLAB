package Exp5;

public class SchoolManagement {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Student("Alice");
        people[1] = new Teacher("Mr. Smith");
        people[2] = new Student("Bob");
        people[3] = new Teacher("Mrs. Johnson");

       
        for (Person person : people) {
            person.performDuty(); 
        }
    }
}
