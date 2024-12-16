package Q2.StudentDB;
import java.util.*;

public class StudentDataBase {
    public static int indexOfStu(ArrayList<Student> db, int id) {
        for (int i = 0; i < db.size(); i++)
            if (db.get(i).getId() == id) return i;
        return -1; // not found
    }

    public static int indexOfStu(ArrayList<Student> db, String last) {
        for (int i = 0; i < db.size(); i++)
            if (db.get(i).getLastName().equals(last)) return i;
        return -1; // not found
    }

    public static void printStu(Student s) {
        System.out.printf("%s\t%s\t%d\t%.2f\n",
                s.getFirstName(), s.getLastName(), s.getId(), s.getGPA());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Menu:");
            System.out.println("1-Add new student");
            System.out.println("2-Display all students");
            System.out.println("3-Search for student(by id)");
            System.out.println("4-Search for student(by last name)");
            System.out.println("5-Modify a student's gpa");
            System.out.println("6-Remove student(by id)");
            System.out.println("Exit");
            System.out.print("Please enter your choice: ");
            int c = input.nextInt();

            if (c == 1) {
                System.out.print("Enter first name: ");
                String f = input.next();
                System.out.print("Enter last name: ");
                String l = input.next();
                System.out.print("Enter student id: ");
                int id = input.nextInt();
                System.out.print("Emter GPA: ");
                double gpa = input.nextDouble();
                Student st = new Student(f, l, id, gpa);
                db.add(st);
            } else if (c == 2) {
                System.out.println("First\tLast\tID\tGPA");
                for (Student s : db)
                    printStu(s);
            } else if (c == 3) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index != -1) printStu(db.get(index));
                else System.out.println("No student was found with that ID.");
            } else if (c == 4) {
                System.out.print("Enter student last name: ");
                String last = input.next();
                int index = indexOfStu(db, last);
                if (index != -1) printStu(db.get(index));
                else System.out.println("No student was found with that last name.");
            } else if (c == 5) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index == -1) System.out.println("No student was found with that last name.");
                else {
                    System.out.print("Enter new GPA: ");
                    double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA updated successfully!!!");
                }
            } else if (c == 6) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index == -1) printStu(db.get(index));
                else db.remove(index);
            } else if (c == 7) {
                return;
            }
        }
    }
}
/*
Student Menu:
1-Add new student
2-Display all students
3-Search for student(by id)
4-Search for student(by last name)
5-Modify a student's gpa
6-Remove student(by id)
Exit
Please enter your choice: 5
Enter student ID: 5
No student was found with that last name.

Student Menu:
1-Add new student
2-Display all students
3-Search for student(by id)
4-Search for student(by last name)
5-Modify a student's gpa
6-Remove student(by id)
Exit
Please enter your choice: 5
Enter student ID: 5
No student was found with that last name.

Student Menu:
1-Add new student
2-Display all students
3-Search for student(by id)
4-Search for student(by last name)
5-Modify a student's gpa
6-Remove student(by id)
Exit
Please enter your choice: 1
Enter first name: maya
Enter last name: wojcik
Enter student id: 1234
Emter GPA: 999999999999

Student Menu:
1-Add new student
2-Display all students
3-Search for student(by id)
4-Search for student(by last name)
5-Modify a student's gpa
6-Remove student(by id)
Exit
Please enter your choice: 5
Enter student ID: 1234
Enter new GPA: 999999999999999
GPA updated successfully!!!

Student Menu:
1-Add new student
2-Display all students
3-Search for student(by id)
4-Search for student(by last name)
5-Modify a student's gpa
6-Remove student(by id)
Exit
Please enter your choice: 2
First	Last	ID	GPA
maya	wojcik	1234	999999999999999.00

Student Menu:
1-Add new student
2-Display all students
3-Search for student(by id)
4-Search for student(by last name)
5-Modify a student's gpa
6-Remove student(by id)
Exit
Please enter your choice:
 */