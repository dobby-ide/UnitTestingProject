import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

       Slot mySlot = new Slot(new String[]{"BAR", "APPLE", "STAR", "KIWI", "JOLLY"}); //,"MANGO","JOLLYJOKER","BAR1", "1APPLE", "1STAR", "1KIWI"});
        //String playslot=mySlot.playSlot();

       Tokens myTokens = new Tokens();
       //int credits = mySlot.winOrLoseCredits(playslot);

       User user = new User();
       Scanner sc = new Scanner(System.in);
       System.out.println("Please provide your name: ");
       user.setName(sc.next());
       String nameOfUser = user.getName();
        System.out.println("Welcome " + nameOfUser + ", let's play!");
       int userChoice = user.getInput();
       while(userChoice==0){

           int amonutOfTokens = myTokens.getCredits();
           System.out.println(nameOfUser + " you have " + amonutOfTokens + " tokens");
           String str= mySlot.playSlot();
           int m= mySlot.winOrLoseCredits(str);

           myTokens.setCredits(m);
           int totalTokes = myTokens.getCredits();

           System.out.println(nameOfUser + " you have " + totalTokes + " tokens, now");
           System.out.println("continue playing?? 0 to continue, 1 to quit");
           userChoice =  sc.nextInt();
           if (totalTokes < 10){
               userChoice =1;
               System.out.println("sorry..GAMEOVER!!!");
           }
        }

    }
}
