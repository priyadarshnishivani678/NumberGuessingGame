import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    public static void main(String[] args){

        int answer , guess ;

         int attempt = 0;
        final int MAX = 100;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        answer = rand.nextInt(MAX) + 1;
        
        while(attempt < 5){ 
            
        System.out.println("Guess any number between(1-100):");
        guess = sc.nextInt();

        if(guess == answer){
            System.out.println("WOWWW! Congratulations!\n Right Answer");
            //break;
        }
       
        else{
            System.out.println("Oops! Better luck next time ");
        }
        attempt++;
    }
    System.out.println();
    System.out.println("The correct answer is :" + answer);
    System.out.println();
    switch(answer){
        case 1 : attempt = 1;
        System.out.println("Score = 25/25");
        break;
        case 2 : attempt = 2;
        System.out.println("Score = 20/25");
        break;
        case 3 : attempt = 3;
        System.out.println("Score = 15/25");
        break;
        case 4 : attempt = 4;
        System.out.println("Score = 10/25");
        break;
        case 5 : attempt = 5;
        System.out.println("Score = 5/25");
        break;
        default : System.out.println("Score  = 0/25 ");
    }

  }
}
