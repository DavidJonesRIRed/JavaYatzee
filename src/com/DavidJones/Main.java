package com.DavidJones;

import GameDice.Die;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //variables
        //Die myDie = new Die(6);
        int numberOfRolls = 0;
        Scanner input = new Scanner(System.in);
        int numberOfDice = 0;
        ArrayList<Die> myDice = new ArrayList<>();
        int dieReRoll;
        String rerollDice = "Y";




        out.println("Please enter the number of Dice");
        numberOfDice = input.nextInt();

        for(int makeDice = 0; makeDice < numberOfDice; makeDice++){

            Die myDie = new Die();
            //TimeUnit.SECONDS.sleep(2);
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


        //out.println(myDie.getSides());
        out.println("Enter number of rolls");
        numberOfRolls = input.nextInt();

        //test rolls
        for(int rolls = 0; rolls < numberOfRolls; rolls++){
            for(int dieNumber = 0; dieNumber < numberOfDice; dieNumber++){
                out.println("This is die number " + dieNumber + " roll result " +myDice.get(dieNumber).dieRoll());
            }

        }

        //reroll first die
        //myDice.get(0).dieRoll();

        //out.println("Which die would you like to reroll?");
        //dieReRoll = input.nextInt();

        //5myDice.get(dieReRoll).dieRoll();

        do {
            if(myDice.get(0).allDieMatch(myDice)){
                out.println("All dice match! Yatzee!!!!");
                break;
            }

            out.println("Which die would you like to reroll? Y/N");
            rerollDice = input.next();
            if (rerollDice.equals("N") || rerollDice.equals("n") ) {
                break;
            }

            out.println("You have " + myDice.size() + " Select die for reroll.");
            dieReRoll = input.nextInt();

            myDice.get(dieReRoll).dieRoll();

            for(int dieNumber = 0; dieNumber < numberOfDice; dieNumber++){
                out.println("This is die number " + dieNumber + " roll result " +myDice.get(dieNumber).getDieFace());
            }

            /*do{
                out.println("Would you like to reroll the current dice? Y or N ");
                rerollDice = input.next();
            }while((rerollDice.equals("y") || rerollDice.equals("Y")) && (!rerollDice.equals("n") || !rerollDice.equals("N")));*/

        }while(rerollDice.equals("y") || !rerollDice.equals("Y") );
    }
}
