import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to add to the database? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent #" + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Surname: ");
            String surname = scanner.nextLine();

            System.out.print("Student No: ");
            int studentNumber = scanner.nextInt();
            scanner.nextLine();







            System.out.print("Year (second grade): ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(name, surname, studentNumber, year);
            students.add(student);
        }

        System.out.println("\nLatest Status of Students:\n");

        for (Student student : students) {
            student.informations();
            System.out.println();
        }
    }
}
