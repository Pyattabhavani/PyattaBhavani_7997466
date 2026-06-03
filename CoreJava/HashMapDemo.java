import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Kiran");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        if (students.containsKey(id))
            System.out.println("Student Name: " + students.get(id));
        else
            System.out.println("ID not found.");
    }
}