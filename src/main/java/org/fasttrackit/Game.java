package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start(){
        System.out.println("Welcome!");
        int playerCount = getPlayerCountFromUser();
    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private int getPlayerCountFromUser(){
        System.out.println("Please enter player numbers: ");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }
}
