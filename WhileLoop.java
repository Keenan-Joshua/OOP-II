import java.util.*;
public class WhileLoop {
    Scanner scanner = new Scanner(System.in);
    void PrintEvens(){
        System.out.println("This program will print even numbers upto your number.");
        System.out.print("Enter your number: ");
        int num=scanner.nextInt();
        int sum=2;
        while(sum<=num){
            System.out.print(sum+" ");
            sum+=2;
        }
    }
    public static void main(String[] args) {
        new WhileLoop().PrintEvens();
    }
}
