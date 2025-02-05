class University {
    static String universityName = "Global University";
    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    void displayStudent() {
        System.out.println("Student: " + studentName);
    }

    public static void main(String[] args) {
        University.displayUniversity();

        University student1 = new University("Alice");
        University student2 = new University("Bob");
        University student3 = new University("Charlie");

        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();
    }
}