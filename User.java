/**
 * Represent the user of the slot machine
 * @var input changes the user willing to continue playing
 * getters and setters for the class variables
 * in constructor input is initialized to 0
 */
public class User {
    String name;
    int input;
    public User(){
        input = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
}
