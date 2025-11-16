import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        Student s1 = new Student();
        s1.setData(name, rollNo);
        s1.display();
        sc.close();
    }
}
class Student {
    String name;
    int rollNo;
    void setData(String n, int r) {
        name = n;
        rollNo = r;
    }
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}
