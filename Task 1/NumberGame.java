import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    public static void main(String args[]){
        int count=0,totalcount=0;
        boolean playgame=true
;        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("====Welcome to Number Guess Game====");
        while(playgame){
            System.out.println("Guess a Number:");
            int guess=rd.nextInt(101);  //returns number from 0 to 100
            int attempt=0;
            int maxAttempt=5; // limiting attempts per round
            boolean correctguess=false;
            System.out.println("I have picked a number between 1 to 100.");
            System.out.println("You have "+maxAttempt+" attempts to guess the number.");
            while(attempt<maxAttempt && !correctguess){
                System.out.println("Enter Your Guess:");
                int userguess=0;
                try{       
                    String input=sc.next();     //accepting into string so any value character or number can be entered
                    userguess=Integer.parseInt(input);  //Checking if user entered valid input that is integer.
                }catch(NumberFormatException e){
                    System.out.println("Invalid Input! You lost 1 attempt.");
                    continue;
                }
                attempt++;
                if(userguess==guess){
                    System.out.println("Congrats! You guessed the right number!");
                    count++;
                    totalcount+=attempt;
                    correctguess=true;
                }else if(userguess>guess){
                    System.out.println("Too High! Try low.");
                }else{
                    System.out.println("Too Low! Try High.");
                }
            }
            if(!correctguess){
                System.out.println("Game Over! You ran out of attempts. The number was: "+ totalcount);
            }
            System.out.println("Do you want to play Again?(1 for yes / 0 for no:");
            int choice=0;
            try{
                choice=sc.nextInt();
            }catch(Exception e){
                choice=0; 
            }
            if(choice==0){
                playgame=false;
            }
            
        }
        System.out.println("======Game Summary======");
        System.out.println("Total Rounds Wond: "+totalcount);
        System.out.println("Thanks for Playing!");
        System.out.println("You have guessed total "+count+" right from "+ totalcount);
    }
}