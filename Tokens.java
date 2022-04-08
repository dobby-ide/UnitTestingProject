/**Simple class that provides funcitonality of getters and setters on
 * credits gained or lost from the user by playing the slot machine
 * @Author Fabio Privitera
 * @Version 1.0
 * */
public class Tokens
{
    int credits;

    public Tokens(){
        credits = 100;
    }

    /**
     * setter for credits: it decrease the credits if parameter given is 0
     * @param credits adds credits if it is not 0
     */
    public void setCredits(int credits)  {
        if(credits == 0){
            this.credits = this.credits -10;
        }

        this.credits += credits;
    }

    /**
     *
     * @return return the amout of credits, simple getter
     */
    public int getCredits() {
try{
    if(credits>9) {
        return credits;
}
}catch(Exception e){
    System.out.println("not enough credits");
}
        return -1;
    }
}
