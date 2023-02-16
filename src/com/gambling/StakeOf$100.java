package com.gambling;
import java.util.Scanner;
public class StakeOf$100 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("As a Gambler, would start with a stake of $100 every day and bet $1 every game. Enter Yes or No to start the game: ");
        String answer= scanner.next();
        if(answer == "Yes")
        {
            System.out.println("Welcome to Gambling World");
        }
        else
        {
            System.exit(0);
        }
    }
}
