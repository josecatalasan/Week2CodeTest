package com.example.week2codingtest.jungle;

import java.util.ArrayList;
import java.util.Random;

public class Jungle {
    public static final int MEAT = 100;
    public static final int FISH = 101;
    public static final int BUGS = 102;
    public static final int GRAIN = 103;

    private ArrayList<Snake> allSnakes;
    private ArrayList<Monkey> allMonkeys;
    private ArrayList<Tiger> allTigers;
    private Random rand;

    public Jungle() {
        allSnakes = new ArrayList<>();
        allMonkeys = new ArrayList<>();
        allTigers = new ArrayList<>();
        rand = new Random();
    }

    public void soundOff(){
        for(Snake a: allSnakes){
            a.makeSound();
            a.reportEnergy();
        }

        for(Monkey a: allMonkeys){
            a.makeSound();
            a.reportEnergy();
        }

        for(Tiger a: allTigers){
            a.makeSound();
            a.reportEnergy();
        }
    }

    public void addSnake(){
        allSnakes.add(new Snake());
    }

    public void addMonkey(){
        allMonkeys.add(new Monkey());
    }

    public void addTiger(){
        allTigers.add(new Tiger());
    }

    public Snake getSnake(int i){
        if(i < allSnakes.size())
            return allSnakes.get(i);
        return null;
    }

    public Monkey getMonkey(int i){
        if(i < allMonkeys.size())
            return allMonkeys.get(i);
        return null;
    }

    public Tiger getTiger(int i){
        if(i < allTigers.size())
            return allTigers.get(i);
        return null;
    }

    public String getFood(int code){
        switch(code){
            case MEAT:
                return "meat";
            case FISH:
                return "fish";
            case BUGS:
                return "bugs";
            case GRAIN:
                return "grain";
        }
        System.out.println("Invalid food. Returned null");
        return null;
    }

    private String getRandomFood(){
        switch(rand.nextInt(4)){
            case 0:
                return getFood(MEAT);
            case 1:
                return getFood(FISH);
            case 2:
                return getFood(BUGS);
            case 3:
                return getFood(GRAIN);
        }

        return null;
    }

    public void randomParty(){
        for(Snake a: allSnakes){
            a.doRandomThing(getRandomFood());
        }

        for(Monkey a: allMonkeys){
            a.doRandomThing(getRandomFood());
        }

        for(Tiger a: allTigers){
            a.doRandomThing(getRandomFood());
        }
    }
}
