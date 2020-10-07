package Yatzee;

import GameDice.Die;

import java.util.ArrayList;

public class Hand {
    //properties
    private ArrayList<Die> myDice = new ArrayList<>();

    //constructors
    public Hand(){
        for(int makeDice = 0; makeDice < 5; makeDice++){

            Die myDie = new Die(6);

            //delay creation, random will have different time seed
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            myDice.add(myDie);
        }
    }

    //methods
    public boolean allDieMatch(ArrayList<Die> dice){
        return dice.isEmpty() || dice.stream().allMatch(dice.get(0)::equals);
    }

    public reRollDice(2parameter ){

    }
}
