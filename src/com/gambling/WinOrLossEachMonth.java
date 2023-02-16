package com.gambling;
public class WinOrLossEachMonth {
    public static final int EveryDayStake = 100;
    public static final int betEveryGame = 1;

    public void monthlyWinOrLose()
    {
        double upperMargin = 0.5 * EveryDayStake;                 // There is 50% margin after win or lose
        double lowerMargin = -0.5 * EveryDayStake;
        int winDays = 0, lossDays = 0, drawDays = 0;              //Instantiate new variables
        for (int i = 0; i < 20; i++) {                                // The gambler plays for 20 days
            double dailyAmount = 0;
            int betPlayed = 0;
            while ((dailyAmount < upperMargin) && (dailyAmount > lowerMargin) && (betPlayed < EveryDayStake)) {
                double random = Math.random();
                betPlayed++;
                if (random > 0.5) {
                    dailyAmount += betEveryGame;
                } else {
                    dailyAmount -= betEveryGame;
                }
            }

            if (dailyAmount > 0) {                                            //Printing the daily amount for wins
                winDays++;
                System.out.println("Day " + i + ": The amount won is $" + dailyAmount);
            } else if (dailyAmount == 0) {                                     //Printing the daily amount for draw
                drawDays++;
                System.out.println("Day " + i + ": There is no net gain or loss ");
            } else if (dailyAmount < 0) {                                      //Printing the daily amount for loss
                lossDays++;
                System.out.println("Day " + i + ": The amount lost is $" + Math.abs(dailyAmount));
            }
        }

        System.out.println("In this month I have won for " + winDays +" days, lost for " + lossDays + " days and drew for " + drawDays + " days");
}



    public static void main(String[] args)
    {
        System.out.println("Welcome To Gambling Simulator Program");
        WinOrLossEachMonth simulation = new WinOrLossEachMonth();                  //Creating a new object

        simulation.monthlyWinOrLose();                                            //Calling the method (UC5)
    }
}
