package com.gambling;
public class ResignIf50Percent {
    public static final int EveryDayStake = 100;                    //Initializing static variable for total stack (UC1)
    public static final int betEveryGame = 1;                       //Initializing static variable for every bet (UC1)

    public void gamblingWinLose() {
        double random = Math.random();
        int remainingAmount = EveryDayStake;
        if (random > 0.5) {
            remainingAmount += betEveryGame;
            System.out.println("The Gambler won the first bet. He has $" + remainingAmount + " remaining with him.");
        } else {
            remainingAmount -= betEveryGame;
            System.out.println("The Gambler lost the first bet. He has $" + remainingAmount + " remaining with him.");
        }            //Before the bet the remaining amount and total stake is same
    }

    /*(UC3) Creating a new method to print that gambler would resign for the day if won or lose 50% of stake*/
    public void gamblerResign(int margin)
    {
        int highAmount = EveryDayStake + margin*EveryDayStake/100;            //Upper margin for resigning
        int lowAmount = EveryDayStake - margin*EveryDayStake/100;             //Lower margin for resigning
        int availableAmount = EveryDayStake;                                   //Before the bet they will be same
        while ((availableAmount < highAmount) && (availableAmount > lowAmount)){
            double random1 = Math.random();
            if (random1 > 0.5){                                           //Using random to check if gambler win or lose
                availableAmount += betEveryGame;
            }
            else{
                availableAmount -= betEveryGame;
            }
        }
        System.out.println("The Gambler resigns for the day. He has $" +availableAmount+ " remaining with him.");
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To Gambling Simulator Program");
        ResignIf50Percent simulation = new ResignIf50Percent();                 //Creating a new object
        simulation.gamblingWinLose();                                           //Calling the method
        ResignIf50Percent simulation1 = new ResignIf50Percent();                 //Creating a new object
        simulation1.gamblingWinLose();                                            //Calling the first method (UC2)
        ResignIf50Percent resignCheck = new ResignIf50Percent();
        resignCheck.gamblerResign(50);                                //Calling the second method (UC3)
    }
}
