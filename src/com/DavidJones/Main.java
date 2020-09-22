package com.DavidJones;

import GameDice.Die;

import java.util.ArrayList;
import java.util.Scanner;

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




        out.println("Please enter the number of Dice");
        numberOfDice = input.nextInt();

        for(int makeDice = 0; makeDice < numberOfDice; makeDice++){
            //String varName = "die" + Integer.toString(makeDice);
            Die myDie = new Die();
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
        myDice.get(0).dieRoll();

        out.println("Which die would you like to reroll?");
        dieReRoll = input.nextInt();

        myDice.get(dieReRoll).dieRoll();
    }
}
