public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private double score;

    public Student(int studentId, String firstName, String lastName, double score) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s %s | Score: %.2f", studentId, firstName, lastName, score);
    }
}
