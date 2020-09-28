package Yatzee;

import GameDice.Die;

import java.util.ArrayList;

public class Hand {

    public boolean allDieMatch(ArrayList<Die> dice){
        return dice.isEmpty() || dice.stream().allMatch(dice.get(0)::equals);
    }
}
