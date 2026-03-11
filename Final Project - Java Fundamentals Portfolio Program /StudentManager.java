import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private final ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (findStudentById(student.getStudentId()) != null) {
            return false;
        }
        students.add(student);
        return true;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student findStudentById(int id) {
        return findStudentByIdRecursive(id, 0);
    }

    // Recursion is used here to demonstrate a clean linear search with a base case.
    private Student findStudentByIdRecursive(int id, int index) {
        if (index >= students.size()) {
            return null;
        }

        Student current = students.get(index);
        if (current.getStudentId() == id) {
            return current;
        }

        return findStudentByIdRecursive(id, index + 1);
    }

    public List<Student> searchByLastName(String lastName) {
        ArrayList<Student> matches = new ArrayList<>();
        for (Student student : students) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                matches.add(student);
            }
        }
        return matches;
    }

    public boolean updateStudent(int id, String firstName, String lastName, double score) {
        Student student = findStudentById(id);
        if (student == null) {
            return false;
        }

        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setScore(score);
        return true;
    }

    public boolean removeStudent(int id) {
        Student student = findStudentById(id);
        if (student == null) {
            return false;
        }
        return students.remove(student);
    }

    public void sortById() {
        students.sort(Comparator.comparingInt(Student::getStudentId));
    }

    public void sortByLastNameThenFirstName() {
        students.sort(Comparator
                .comparing(Student::getLastName, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Student::getFirstName, String.CASE_INSENSITIVE_ORDER)
                .thenComparingInt(Student::getStudentId));
    }

    public double averageScore() {
        if (students.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Student student : students) {
            total += student.getScore();
        }
        return total / students.size();
    }

    public Student highestScoreStudent() {
        if (students.isEmpty()) {
            return null;
        }

        Student highest = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getScore() > highest.getScore()) {
                highest = students.get(i);
            }
        }
        return highest;
    }

    public int countAboveThreshold(double threshold) {
        return countAboveThresholdRecursive(threshold, 0);
    }

    // Recursively counts students above threshold, with index as the shrinking problem.
    private int countAboveThresholdRecursive(double threshold, int index) {
        if (index >= students.size()) {
            return 0;
        }

        int addOne = students.get(index).getScore() > threshold ? 1 : 0;
        return addOne + countAboveThresholdRecursive(threshold, index + 1);
    }
}
