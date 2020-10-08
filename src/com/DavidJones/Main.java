package com.DavidJones;

import GameDice.Die;
import Yatzee.Hand;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //variables
        Scanner input = new Scanner(System.in);
        //int numberOfDice = 0;
        String dieReRoll = "";
        String rerollDice = "Y";
        Hand myHand = new Hand();
        ArrayList<Integer> whichDice;

        myHand.rollDice();
        showDieFaces(myHand);

        do {
            if(myHand.checkYatzee()){
                out.println("All dice match! Yatzee!!!!");
                showDieFaces(myHand);
                break;
            }

            out.println("Would you like to reroll? Y/N");
            rerollDice = input.next();

            if (rerollDice.toLowerCase().equals("n")) {
                break;
            }
            else if(rerollDice.toLowerCase().equals("y")){
                out.println("You have " + myHand.numberOfDice() + " dice. Select dice for reroll. Please die number like so 1 3 4");
                dieReRoll = input.next();

                whichDice = new ArrayList<Integer>(sepDice(dieReRoll));

                myHand.reRollDice(whichDice);
            }

            showDieFaces(myHand);


        }while(rerollDice.equals("y") || rerollDice.equals("Y") );
    }

    private static ArrayList<Integer> sepDice(String dieToRoll) {
        String dice[] = dieToRoll.split("");
        ArrayList<Integer> theDice = new ArrayList<Integer>();
        for (String die : dice) {
            theDice.add(Integer.parseInt(die));
        }
        return theDice;
    }

    private static void showDieFaces(Hand theHand){
        for(int dieNumber = 0; dieNumber < theHand.numberOfDice(); dieNumber++){
            out.println("This is die number " + (dieNumber + 1) + " roll result " + theHand.getDieSide(dieNumber));
        }
    }

}


