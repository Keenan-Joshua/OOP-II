import java.util.*;
public class DecisionCoding {
    Scanner scanner = new Scanner(System.in);
    void EvenOrOdd(){
        System.out.println("This program checks whether your number is even or odd.");
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("Your number is even.");
        }
        else{
            System.out.println("Your number is odd.");
        }
    }
    public static void main(String[] args) {
        new DecisionCoding().EvenOrOdd();
    }
}
