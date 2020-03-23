package org.fasttrackit;

import java.util.Scanner;

public class Game {

    private Track[] tracks = new Track[3];


    public void start(){
        System.out.println("Welcome!");
        int playerCount = getPlayerCountFromUser();
        initializeTracks();
    }

    private void  initializeTracks(){
        Track track1 = new Track();
        track1.setName("Imola");
        track1.setLength(3500);
        tracks[0]= track1;
        Track track2 = new Track();
        track2.setName("Suzuka");
        track2.setLength(4100);
        tracks[1]= track2;
    }
    //classic for loop
    private void displayTracks(){
        System.out.println("Available tracks: ");
        for (int i = 0; i < tracks.length; i++){
            System.out.println(tracks[i].getName() + " - "+tracks[i].getLength());
        }
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
