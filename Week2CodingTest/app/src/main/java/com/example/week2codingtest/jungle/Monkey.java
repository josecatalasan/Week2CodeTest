package com.example.week2codingtest.jungle;

import java.util.Random;

public class Monkey extends Animal{
    private static int speciesCount = 0;

    public Monkey() {
        speciesCount++;
    }

    @Override
    public void eatFood(String food) {
        setEnergy(getEnergy()+2);
        System.out.printf("Thank you for feeding monkey %s!\n", food);
    }

    @Override
    public boolean makeSound() {
        if(getEnergy()-4 < 0){
            System.out.println("Monkey is tired.");
            return false;
        } else {
            System.out.println("Ooo Eee Ahh Ahh Ahh");
            setEnergy(getEnergy() - 4);
            return true;
        }

    }

    public void play(){
        if(getEnergy()-8 < 0)
            System.out.println("Monkey is too tired");
        else {
            System.out.println("Oooo Oooo Oooo");
            setEnergy(getEnergy() - 8);
        }
    }

    public int getSpeciesCount(){
        System.out.printf("There are %d monkeys.\n", speciesCount);
        return speciesCount;
    }

    @Override
    public void doRandomThing(String food) {
        switch(rand.nextInt(ACTION_COUNT+1)){
            case 0:
                makeSound();
                break;
            case 1:
                eatFood(food);
                break;
            case 2:
                sleep();
                break;
            case 3:
                play();
                break;
        }
    }
}
