import java.util.Scanner;
public class Imports {
    Scanner scanner = new Scanner(System.in);
    void TestInput(){
        String name, phone_number, position;
        System.out.println("Enter your name, phone number and position applied for.");
        System.out.print("Name: ");
        name=scanner.next();
        System.out.print("Phone number: ");
        phone_number=scanner.next();
        System.out.print("Position: ");
        position=scanner.next();
        System.out.println(name+" you have applied for the "+position+" position. You will be contacted through "+phone_number);
    }
    public static void main(String[] args) {
        new Imports().TestInput();
    }
}
