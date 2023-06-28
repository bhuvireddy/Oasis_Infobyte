import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args)
    {
        System.out.println("Let's play a game. I'll pick a number between");
        System.out.println("1 and 100,and you try to guess it.");
        Scanner sc1=new Scanner(System.in);
        boolean playAgain;
        do{
            playGame();
            System.out.println("would you like to play again? Y/N");
            playAgain=sc1.nextBoolean();
        }while(playAgain);
        System.out.println("Thanks for palying. bye.");
    }

    static void playGame(){
        int computersNumber;
        int userGuess;
        int guessCount;
        computersNumber = (int)(100 * Math.random()) + 1;
        guessCount=0;
        System.out.println();
        System.out.println("What is your first guess?");
        Scanner sc=new Scanner(System.in);
        while(true){
            userGuess=sc.nextInt();
            guessCount++;
            if(userGuess==computersNumber){
                System.out.println("you got it in"+ guessCount + "guess! My nunber was" + computersNumber);
                break;
            }
            if(guessCount==6){
                System.out.println("you didn't get the number in 6 guesses.");
                System.out.println("you lose. My number was" + computersNumber);
                break;
            }
            if(userGuess<computersNumber)
              System.out.println("That's too low. Try again:");
            else
              System.out.println("That's too high. Try again:");
        }
        System.out.println();
    }
}