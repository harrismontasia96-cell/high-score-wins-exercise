package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    private static Object HighScoreWins;

    {
        Scanner Game = new Scanner(System.in);
        System.out.println("Enter Game 1 score (format Home:Visitor 21:9):");
        String score1 = Game.nextLine();
        System.out.println("Home:Visitor|" + score1);

        System.out.println("Enter Game 2 score(format Slytherin:Gryffindor 23:59:");
        String score2 = Game.nextLine();
        System.out.println("Slytherin:Gryffindor|" + score2);

        String[] parts1 = score2.split(":");
        int home1 = Integer.parseInt(parts1[0]);
        int visitor1 = Integer.parseInt(parts1[1]);

        String[] parts2 = score1.split(":");
        int home2 = Integer.parseInt(parts2[0]);
        int visitor2 = Integer.parseInt(parts2[1]);

        int total1 = home1 = visitor1 + visitor2;
        int total2 = home2 = visitor2 + visitor1;

        if (total1 > total2) {
            System.out.println("Game 1 had the highest total score: " + total1);
        } else if (total1 > total2) {
            System.out.println("Game 2 had the highest total score: " + total2);
        } else {
            System.out.println(" Both games had the same total score: " + total1);

        }


    }