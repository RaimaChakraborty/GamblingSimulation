package com.gambling;
import java.util.Scanner;
public class TotalAmount {
    static void gamble(int noOfTimes, int Stack, int Goal) {
        int betsnum = 0; // total number of bets made
        int wins = 0; // total number of games won
        for (int i = 0; i < noOfTimes; i++) {
            int cash = Stack;
            while (cash > 0 && cash < Goal) {
                betsnum++;
                if (Math.random() < 0.5)
                    cash++; // win $1
                else
                    cash--; // lose $1
            }
            if (cash == Goal)
                wins++; // to find no. of wins
        }
        // print results
        System.out.println();
        System.out.println(wins + " wins out of of " + noOfTimes);
        double perWon=100.0 * wins / noOfTimes;
        double perLoss= 100.0 * (noOfTimes - wins) / noOfTimes;
        System.out.println("Percent of games won = " + perWon);
        System.out.println("Percent of games lost = " +perLoss);
        System.out.println("Total bets in " + noOfTimes + " games = " + betsnum);
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int  stack, goal;

        System.out.println("As a Gambler make $1 bet so either win or loose $1:");
        stack = scanner.nextInt();
        System.out.println("enter goal amount");
        goal = scanner.nextInt();
        gamble(1, stack, goal);
        gamble(20, stack, goal);

    }
}