/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warrunnergame;

/**
 *
 * @author jaini
 */

import java.util.Scanner;

public class WarRunnerGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player 1 name: ");
        String playerName1 = scanner.nextLine();
        int maxRounds = 26; // Set the desired number of rounds here
        WarGame warGame = new WarGame(playerName1);
        warGame.playGame(maxRounds);
    }

}

