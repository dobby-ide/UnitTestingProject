import org.junit.Test;

import static org.junit.Assert.*;

public class TokensTest {

    @Test
    //normal case: it checks rather the function does its work, so it decreease the amount of credits if
    // setCredits(0) => credits -=10
    public void getCredits(){
        Tokens token = new Tokens();
        token.setCredits(0);
        assertTrue(token.getCredits()==90);
        Tokens token1 = new Tokens();
        token1.setCredits(200);
        assertTrue(token1.getCredits()==300);

    }
    @Test
    //normal case: it checks rather the function is checked to the possibility of going minus with its credit counting
    public void getCreditsNegative() throws Exception{
        Tokens token = new Tokens();
        token.setCredits(-120);
        assertTrue(token.getCredits()==-1);

    }
}