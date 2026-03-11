import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final StudentManager MANAGER = new StudentManager();

    public static void main(String[] args) {
        seedExampleRecords();
        runMenuLoop();
        SCANNER.close();
    }

    private static void runMenuLoop() {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readIntInRange("Choose an option: ", 1, 9);

            switch (choice) {
                case 1:
                    addStudentFlow();
                    break;
                case 2:
                    listStudentsFlow();
                    break;
                case 3:
                    searchByIdFlow();
                    break;
                case 4:
                    searchByLastNameFlow();
                    break;
                case 5:
                    updateStudentFlow();
                    break;
                case 6:
                    removeStudentFlow();
                    break;
                case 7:
                    sortStudentsFlow();
                    break;
                case 8:
                    statisticsFlow();
                    break;
                case 9:
                    running = false;
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n=== Student Records Manager ===");
        System.out.println("1. Add student");
        System.out.println("2. List all students");
        System.out.println("3. Search by student ID");
        System.out.println("4. Search by last name");
        System.out.println("5. Update student");
        System.out.println("6. Remove student");
        System.out.println("7. Sort students");
        System.out.println("8. Compute statistics");
        System.out.println("9. Quit");
    }

    private static void addStudentFlow() {
        System.out.println("\n--- Add Student ---");
        int id = readPositiveInt("Student ID: ");

        if (MANAGER.findStudentById(id) != null) {
            System.out.println("A student with that ID already exists. Add canceled.");
            return;
        }

        String firstName = readNonEmptyString("First name: ");
        String lastName = readNonEmptyString("Last name: ");
        double score = readScore("Score (0-100): ");

        boolean added = MANAGER.addStudent(new Student(id, firstName, lastName, score));
        if (added) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Could not add student.");
        }
    }

    private static void listStudentsFlow() {
        System.out.println("\n--- All Students ---");
        List<Student> students = MANAGER.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchByIdFlow() {
        System.out.println("\n--- Search by ID ---");
        int id = readPositiveInt("Enter student ID: ");
        Student student = MANAGER.findStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Found: " + student);
        }
    }

    private static void searchByLastNameFlow() {
        System.out.println("\n--- Search by Last Name ---");
        String lastName = readNonEmptyString("Enter last name: ");
        List<Student> matches = MANAGER.searchByLastName(lastName);

        if (matches.isEmpty()) {
            System.out.println("No students found with that last name.");
            return;
        }

        System.out.println("Matches:");
        for (Student student : matches) {
            System.out.println(student);
        }
    }

    private static void updateStudentFlow() {
        System.out.println("\n--- Update Student ---");
        int id = readPositiveInt("Enter student ID to update: ");

        Student existing = MANAGER.findStudentById(id);
        if (existing == null) {
            System.out.println("Student not found.");
            return;
        }

        String firstName = readNonEmptyString("New first name: ");
        String lastName = readNonEmptyString("New last name: ");
        double score = readScore("New score (0-100): ");

        boolean updated = MANAGER.updateStudent(id, firstName, lastName, score);
        if (updated) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Update failed.");
        }
    }

    private static void removeStudentFlow() {
        System.out.println("\n--- Remove Student ---");
        int id = readPositiveInt("Enter student ID to remove: ");

        boolean removed = MANAGER.removeStudent(id);
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void sortStudentsFlow() {
        System.out.println("\n--- Sort Students ---");
        System.out.println("1. Sort by ID");
        System.out.println("2. Sort by last name");
        int choice = readIntInRange("Choose sort option: ", 1, 2);

        if (choice == 1) {
            MANAGER.sortById();
            System.out.println("Students sorted by ID.");
        } else {
            MANAGER.sortByLastNameThenFirstName();
            System.out.println("Students sorted by last name.");
        }
    }

    private static void statisticsFlow() {
        System.out.println("\n--- Statistics ---");
        List<Student> students = MANAGER.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students available for statistics.");
            return;
        }

        double average = MANAGER.averageScore();
        Student highest = MANAGER.highestScoreStudent();
        double threshold = readScore("Enter threshold score (0-100): ");
        int countAbove = MANAGER.countAboveThreshold(threshold);

        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Highest score student: " + highest);
        System.out.printf("Students above %.2f: %d%n", threshold, countAbove);
    }

    private static int readIntInRange(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();

            try {
                int value = Integer.parseInt(input);
                if (value < min || value > max) {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static int readPositiveInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();

            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Value must be greater than 0.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static double readScore(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();

            try {
                double value = Double.parseDouble(input);
                if (value < 0 || value > 100) {
                    System.out.println("Score must be between 0 and 100.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a numeric score.");
            }
        }
    }

    private static String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("This field is required.");
                continue;
            }
            return input;
        }
    }

    private static void seedExampleRecords() {
        MANAGER.addStudent(new Student(1001, "Ava", "Johnson", 88.5));
        MANAGER.addStudent(new Student(1002, "Liam", "Chen", 92.0));
        MANAGER.addStudent(new Student(1003, "Mia", "Lopez", 79.5));
    }
}
