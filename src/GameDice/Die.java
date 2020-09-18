package GameDice;
import java.util.Random;

public class Die {
    private int dieSides;
    private Random randomNumber;

    public void die(){
        this.dieSides = 4;
    }

    public void die(int newAmountOfSides){
        this.dieSides = newAmountOfSides;
    }

}
