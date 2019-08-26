package com.example.week2codingtest;

import com.example.week2codingtest.jungle.Jungle;

public class JungleCodingChallenge {

    public static void main(String[] args) {
        Jungle jungle = new Jungle();

        //make animals
        jungle.addMonkey();
        jungle.addMonkey();
        jungle.addMonkey();
        jungle.addTiger();
        jungle.addSnake();
        jungle.addSnake();

        //animal actions
        jungle.getMonkey(0).eatFood(jungle.getFood(Jungle.MEAT));
        jungle.getMonkey(0).makeSound();
        jungle.getMonkey(0).play();
        jungle.getMonkey(0).sleep();

        jungle.getSnake(1).eatFood(jungle.getFood(Jungle.FISH));
        jungle.getSnake(1).makeSound();
        jungle.getSnake(1).sleep();

        jungle.getTiger(0).eatFood(jungle.getFood(Jungle.GRAIN));
        jungle.getTiger(0).makeSound();
        jungle.getTiger(0).sleep();

        //count off
        jungle.getTiger(0).getSpeciesCount();
        jungle.getMonkey(0).getSpeciesCount();
        jungle.getSnake(0).getSpeciesCount();

        //soundOff
        jungle.soundOff();

        for(int i=0;  i<jungle.getMonkey(0).getSpeciesCount(); i++){
            jungle.getMonkey(i).play();
        }

        System.out.println("RANDOM PARTY!!!!");
        jungle.randomParty();
    }

}
