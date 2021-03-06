package GameDice;
import java.util.Random;
import java.util.ArrayList;

public class Die {
    private int dieSides;
    private Random randomNumber = new Random();
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
        dieFace = randomNumber.nextInt(dieSides) + 1;
        return dieFace;
    }

    public int getDieFace(){
        return dieFace;
    }



}
