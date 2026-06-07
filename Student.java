public class Student {

    // Properties
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String[] courses;

    // Constructor
    public Student(String name, int age, String email, String phoneNumber, String[] courses) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.courses = courses;
    }

    // Method printing student information
    public void printMe() {
        System.out.println("Student Information: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Courses: ");
        for (String course : courses) {
            System.out.println(" - " + course);
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Student #1
        String[] courses1 = {"Math", "English", "History"};
        Student s1 = new Student ("Adam", 22, "adam@email.com","574-505-3112", courses1);

        // Student #2
        String[] courses2 = {"Chemistry", "Physics", "Biology"};
        Student s2 = new Student ("Ben", 20, "ben@email.com", "574-123-5505", courses2);

        // Student #3
        String[] courses3 = {"Art", "Economy", "Spanish"};
        Student s3 = new Student ("Briana", 23, "briana@email.com", "574-331-5432", courses3);

        // Print all students
        s1.printMe();
        s2.printMe();
        s3.printMe();
    }
}
