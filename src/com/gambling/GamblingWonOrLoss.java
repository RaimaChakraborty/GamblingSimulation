package com.gambling;
public class GamblingWonOrLoss {
    public static final int everyDayStake = 100;                    //Initializing static variable (UC1)
    public static final int betEveryGame = 1;                       //Initializing static variable (UC1)
    /*Creating a new method to see if gambler won or lost (UC2)*/
    public void gamblingWinLose(){
        double random = Math.random();
        int amount = everyDayStake;         //Before the bet the remaining amount and total stake is same
        if (random > 0.5){
            amount += betEveryGame;
            System.out.println("The Gambler won the first bet. He has $" +amount+ " remaining with him.");
        }
        else{
            amount -= betEveryGame;
            System.out.println("The Gambler lost the first bet. He has $" +amount+ " remaining with him.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Simulator Program");
        GamblingWonOrLoss simulation = new GamblingWonOrLoss();                 //Creating a new object
        simulation.gamblingWinLose();                                           //Calling the method
    }
}
