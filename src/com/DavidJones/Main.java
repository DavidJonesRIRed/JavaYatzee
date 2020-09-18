package com.DavidJones;

import GameDice.Die;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //variables
        Die myDie = new Die(6);
        int numberOfRolls = 0;
        Scanner input = new Scanner(System.in);

        //out.println(myDie.getSides());
        out.println("Enter number of rolls");
        numberOfRolls = input.nextInt();

        //test 3 rolls
        for(int rolls = 0; rolls < numberOfRolls; rolls++){
            out.println(myDie.dieRoll());
        }
    }
}
