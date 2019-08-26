package com.example.week2codingtest.jungle;

import java.util.Random;

public class Animal {
    public static final int ACTION_COUNT = 3;
    private int energy;
    public Random rand;

    public Animal() {
        this.energy = 50;
        rand = new Random();
    }

    public boolean makeSound(){
        if(getEnergy() - 3 < 0) {
            System.out.println("I do not have enough energy.");
            return false;
        }
        else {
            setEnergy(getEnergy() - 3);
        }
        return true;
    }

    public void eatFood(String food){
        setEnergy(getEnergy()+5);
    }

    public void sleep(){
        setEnergy(getEnergy()+10);
        System.out.println("Zzzz Zzzz Zzzz");
        reportEnergy();
    }

    public void reportEnergy(){
        System.out.printf("I have %d energy left\n", energy);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void doRandomThing(String food){
        switch(rand.nextInt(ACTION_COUNT)){
            case 0:
                makeSound();
                break;
            case 1:
                eatFood(food);
                break;
            case 2:
                sleep();
                break;
        }
    }
}
