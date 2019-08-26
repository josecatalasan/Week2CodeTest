package com.example.week2codingtest.jungle;

import javax.xml.transform.Source;

public class Snake extends Animal{
    private static int speciesCount = 0;

    public Snake() {
        speciesCount++;
    }

    @Override
    public boolean makeSound() {
        if(super.makeSound()){
            System.out.println("Ssss Sss");
            return true;
        }
        return false;
    }

    @Override
    public void eatFood(String food) {
        super.eatFood(food);
        System.out.printf("Mmmm. Snake thanks you for the %s.\n", food);
    }

    public int getSpeciesCount(){
        System.out.printf("There are %d snakes.\n", speciesCount);
        return speciesCount;
    }
}
