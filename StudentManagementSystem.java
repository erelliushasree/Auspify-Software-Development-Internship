
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Exiting Student Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid whole number: ");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = readInt();

        if (findStudent(id) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter student age: ");
        int age = readInt();

        System.out.print("Enter course: ");
        String course = sc.nextLine().trim();

        if (id <= 0 || age <= 0 || name.isEmpty() || course.isEmpty()) {
            System.out.println("Invalid details. Please enter valid values.");
            return;
        }

        Student student = new Student(id, name, age, course);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n----- STUDENT RECORDS -----");

        for (Student student : students) {
            System.out.println(
                "ID: " + student.getId()
                + " | Name: " + student.getName()
                + " | Age: " + student.getAge()
                + " | Course: " + student.getCourse()
            );
        }
    }

    static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = readInt();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter new age: ");
        int age = readInt();

        System.out.print("Enter new course: ");
        String course = sc.nextLine().trim();

        if (name.isEmpty() || age <= 0 || course.isEmpty()) {
            System.out.println("Invalid details. Record not updated.");
            return;
        }

        student.setName(name);
        student.setAge(age);
        student.setCourse(course);

        System.out.println("Student updated successfully!");
    }

    static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = readInt();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(student);
        System.out.println("Student deleted successfully!");
    }

    static Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }
}
