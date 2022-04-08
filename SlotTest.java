
import static org.junit.Assert.*;


public class SlotTest {



//checks rather method is handled in Try/catch block if the String[] passed is less < 5
    //case 0
    @org.junit.Test
    public void playSlotException() throws Exception{
        Slot myslot = new Slot(new String[]{});
        String actual = myslot.playSlot();
        assertEquals(actual, "");

    }
    //case 1: normal
    @org.junit.Test
    public void playSlotNormal() {
        //checks for return value to be expected if all array items have the same values
        Slot myslot1 = new Slot(new String[]{"BAR", "BAR", "BAR", "BAR", "BAR"});
        String actual1 = myslot1.playSlot();
        assertEquals(actual1, "BAR  BAR  BAR");
    }

//test case 1: normal winOrLoseCredit normal returns if the parsed String will contain some same substrings
    @org.junit.Test
    public void winOrLoseCredits() {
        Slot myslot1 = new Slot(new String[]{"BAR", "BAR", "BAR", "BAR", "BAR"});
        String result = myslot1.playSlot();
        System.out.println(result);
        assertEquals(myslot1.winOrLoseCredits(result),100);
    }
    //test case impossible when we are passing a string that does not much the expected string;
    @org.junit.Test
    public void winOrLoseCreditsImpossible() throws Exception{
        Slot myslot1 = new Slot(new String[]{"BAR", "BAR", "BAR", "BAR", "BAR"});
       String breakingTheCode = "HELLO";
        System.out.println(myslot1.winOrLoseCredits(breakingTheCode));
       assertEquals(myslot1.winOrLoseCredits(breakingTheCode), 0);
    }
    @org.junit.Test
    //normal case: passing to the function something known
    public void checkThreeEqualValuesTest(){
        Slot myslot2 = new Slot(new String[]{"JOLLY", "JOLLY", "JOLLY", "JOLLY", "JOLLY"});
        int expected = myslot2.checkThreeEqualValues(new String[]{"JOLLY", "JOLLY", "JOLLY", "JOLLY", "JOLLY"});
        assertEquals(expected, 70);

    }
    @org.junit.Test
    //impossible case: passing to the function an empty String[]
    public void checkThreeEqualValuesTestImpossible() throws Exception{
        Slot myslot2 = new Slot(new String[]{"JOLLY", "bar", "mark", "jimmy", "timmy"});
        int expected = myslot2.checkThreeEqualValues(new String[]{});
        assertEquals(expected, 0);

    }
}
