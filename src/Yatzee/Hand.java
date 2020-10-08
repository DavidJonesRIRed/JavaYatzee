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

            timeDelay(100);

            this.myDice.add(myDie);
        }
    }

    //methods
    private boolean allDieMatch(){
        return this.myDice.stream().allMatch(this.myDice.get(0)::equals);
    }

    private void timeDelay(int timeInMilliseconds){
        //delay, random will have different time seed
        try
        {
            Thread.sleep(timeInMilliseconds);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public boolean checkYatzee(){
        return allDieMatch();
    }

    public int numberOfDice(){
        return this.myDice.size();
    }

    public void rollDice(){
        for(int rollDice = 0; rollDice < 5; rollDice++){

            this.myDice.get(rollDice).dieRoll();
            timeDelay(100);

        }
    }

    public void reRollDice(ArrayList<Integer> whichDie){
        for(int roll = 0; roll < whichDie.size(); roll++){
            this.myDice.get(whichDie.get(roll) - 1).dieRoll();
            this.timeDelay(100);
        }
    }

    public int getDieSide(int whichDie){
        return myDice.get(whichDie).getDieFace();
    }
}
