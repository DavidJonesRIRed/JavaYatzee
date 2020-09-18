package com.DavidJones;

import GameDice.Die;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Die myDie = new Die(6);
        out.println(myDie.getSides());

        //test 3 rolls
        for(int rolls = 0; rolls < 20; rolls++){
            out.println(myDie.dieRoll());
        }
    }
}
