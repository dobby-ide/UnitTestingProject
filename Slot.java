
import java.util.Random;
/**Represents the functioning of a slot machine with three levers
 * @Author Fabio Privitera
 * @version 1.0
 * @since 1.0
 */
public class Slot
{
    String[] a;
    //{"BAR", "APPLE", "STAR", "KIWI","JOLLY"};
    //constructor requires declaration
    public Slot(String[] a) {
        this.a = a;

    }
//this method will check if any of the array item are equals

    /**
     *
     * @param array is passed to the function if the array contains
     *              three equals strings
     * @return an integer based on the string value of the first item in the array
     */
    public int checkThreeEqualValues(String[] array){
    String bar = "BAR";
    String apple = "APPLE";
    String star = "STAR";
    String kiwi = "KIWI";
    try{if(array[0].equals(apple) || array[0].equals(star) || array[0].equals(kiwi)){
        return 50;
    }if(array[0].equals(bar)){
        return 100;
    }
    else{
        return 70;
    }}catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index 0 out of bound for the parameter passed");
    }
    return 0;
    }

    /**
     *
      * @param array is being checked if two or three of its String items are equals
     * @return based on helper functions or 0
     */
    public int checkCombinations(String[] array){

        if(array.length==3){
            //check if there is three of a kind
            if(array[0].equals(array[1]) && array[1].equals(array[2])){
                int result = checkThreeEqualValues(array);
                return result;
            }
            else if(array[0].equals(array[1]) || array[0].equals(array[2]) || array[1].equals(array[2])){
                int result = checkTwoEqualValues(array);
                return result;
            }
        }
        return 0;
    }

    /**
     *
     * @param array is passed when the array contains two equals value
     *              and it is checked against actual content of its values
     * @return an integer based on the actual calculations inside the functions
     */
    public int checkTwoEqualValues(String[] array) {
        String bar = "BAR";
        String apple = "APPLE";
        String star = "STAR";
        String kiwi = "KIWI";
        for(int i = 0;i <array.length +1; i++ ){

            if(array[0].equals(array[1]) || array[0].equals(array[2])){
                if(array[0].equals(apple)||array[0].equals(star)||array[0].equals(kiwi)){
                    return 10;}
                    else if(array[0].equals(bar)){
                        return 20;
                }
                    return 15;

            }
            if(array[1].equals(array[2])){
                if(array[1].equals(apple)||array[1].equals(star)||array[1].equals(kiwi)){
                    return 10;}
                else if(array[1].equals(bar)){
                    return 20;
                }
                return 15;

            }

        }
    return 0;
    }
    //generates a new random number
    //it returns values from each of the arrays (r1,r2,r3) into a string

    /**
     * a is class variable declared in constructor as String[] a
     * @return a String based upon three random selections of items of String[] a
     */
    public String playSlot() {
        Random random = new Random();
        int INDEX = 5;
        try {
            return a[random.nextInt(INDEX)] + "  " + a[random.nextInt(INDEX)] + "  " + a[random.nextInt(INDEX)];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The String array provided needs to contain at least 5 String items");
        }
     return "";


    }

    /**
     *
     * @param combination is a String containing three words separated with 3 spaces from each other
     * @return an integer based on the results of helper functions
     */
     public int winOrLoseCredits(String combination) {

         try {
             String[] arrOfStr = combination.split("  "); //arrOfStr[0] is a String element of the array
             int result = checkCombinations(arrOfStr);
             System.out.println(arrOfStr[0] + " " + arrOfStr[1] + " " + arrOfStr[2]);
             return result;
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Cannot parse the string");
         }

return 0;
     }}
