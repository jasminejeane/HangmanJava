package com.company;

//game logic
public class Game {
//    each class will need to know the answer to the game

    private String answer;
    private String hits;
    private String misses;

    public Game(String answer){

        this.answer = answer;
        hits = "";
        misses = "";
    }

//    method to apply a guess toward the answer

    public boolean applyGuess(char letter) {

        boolean isHit = answer.indexOf(letter) != -1;

        if (isHit) {
            hits += letter;
        } else {

            misses += letter;
        }
        return isHit;
    }
}
