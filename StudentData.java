import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks > 35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    }
}
