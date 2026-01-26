import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String args[]){
        int number=0;
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        boolean guessNumber=false;
        while(guessNumber==false){
            System.out.println("Guess a Number:");
            int guess=rd.nextInt(100);
            number=sc.nextInt();
            if(guess==number){
                System.out.println("Congrats, Right Guess!");
            }
        }
    }
}