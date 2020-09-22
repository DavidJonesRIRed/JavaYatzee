package GameDice;
import java.util.Random;

public class Die {
    private int dieSides;
    private Random randomNumber;
    private int dieFace;

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
        dieFace = randomNumber.nextInt((dieSides - 1) + 1) + 1;
        return dieFace;

    }

    public int getDieFace(){
        return dieFace;
    }
}
