package com.example.week2codingtest.jungle;

public class Tiger extends Animal{
    private static int speciesCount = 0;

    public Tiger() {
        speciesCount++;
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy()+5);
        System.out.println("ZZZZ ZZZZ ZZZZ");
        reportEnergy();
    }

    @Override
    public void eatFood(String food) {
        if(food.equals("grain")) {
            System.out.println("Tigers can't eat grain.");
        }
        else {
            super.eatFood(food);
            System.out.printf("You've served me well. I liked the %s\n", food);
        }
    }

    @Override
    public boolean makeSound() {
        if(super.makeSound()){
            System.out.println("RAAAAWWRRR");
            return true;
        }
        return false;
    }

    public int getSpeciesCount(){
        System.out.printf("There are %d tigers.\n", speciesCount);
        return speciesCount;
    }
}
