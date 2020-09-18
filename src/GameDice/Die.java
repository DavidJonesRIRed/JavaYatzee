package GameDice;
import java.util.Random;

public class Die {
    private int dieSides;
    private Random randomNumber;

    public Die(){
        this.dieSides = 4;
    }

    public Die(int newAmountOfSides){
        this.dieSides = newAmountOfSides;
    }

    public int getSides(){
        return dieSides;
    }

    public int dieRoll(){
        randomNumber = new Random();
        return randomNumber.nextInt((dieSides - 1) + 1) + 1;

    }
}
