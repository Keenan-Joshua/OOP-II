import java.util.*;

public class RandomImport {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    void NumberGuesser(){
        System.out.println("Guess the number to win!");
        int number = rand.nextInt(1,11);
        System.out.print("Pick a number between 1 and 10: ");
        int guess = sc.nextInt();
        if(guess==number){
            System.out.println("Congratulations! You win!");
        }
        else if(((guess+1)==number) || ((guess-1)==number)){
            System.out.println("So close! The correct number is "+number);
        }
        else{
            System.out.println("Sorry, you lose!");
            System.out.println("The correct number is "+number);
        }
    }
    public static void main(String[] args) {
        new RandomImport().NumberGuesser();
    }
}
