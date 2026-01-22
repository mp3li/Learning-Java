public class Student {

    // These are the "data" pieces that every Student object will carry around
    // private = other classes can't mess with these directly
    // you have to go through the constructor or methods instead
    private String name;   // the student's name
    private int id;        // the student's ID number (like their unique identifier)
    private double gpa;   // the student's GPA (decimals, so double makes sense)

    // This runs when you make a new Student object
    // Example: new Student("Jane", 1, 4.0)
    public Student(String name, int id, double gpa) {
        // "this.name" means the name field that belongs to THIS object
        // "name" (without this) is the parameter coming into the constructor
        this.name = name;
        this.id = id;

        // GPA shouldn't be negative, so if someone tries that,
        // we just force it to be 0 instead
        if (gpa < 0.0) {
            this.gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }

    // This controls what prints when you do:
    // System.out.println(studentObject);
    // Instead of showing a memory address, it shows something human-readable
    @Override
    public String toString() {
        return "Student[name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
    }

    // This controls how TWO Student objects are compared
    // Instead of checking if they're literally the same object in memory,
    // we decide they are "the same student" if their IDs match
    @Override
    public boolean equals(Object obj) {

        // If both variables point to the exact same object in memory,
        // they're obviously equal
        if (this == obj) {
            return true;
        }

        // If the other thing is null OR not even a Student,
        // then there's no way they can be equal
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Now we safely "cast" the Object into a Student
        // so we can access its fields
        Student other = (Student) obj;

        // The real comparison:
        // If the IDs match, we say it's the same real student
        return this.id == other.id;
    }

    // This is just here so you can RUN this file and see everything working
    // It's not required for the class itself, it's basically a test zone
    public static void main(String[] args) {

        // Make a student named Jane with a perfect GPA
        Student s1 = new Student("Jane", 1, 4.0);

        // Make another student with the SAME ID but different GPA
        // According to our equals() rules, these should count as "the same student"
        Student s2 = new Student("Jane", 1, 3.5);

        // This will use the toString() method automatically
        System.out.println(s1);

        // This will test our equals() logic
        System.out.println("s1 equals s2? " + s1.equals(s2));
    }
}
