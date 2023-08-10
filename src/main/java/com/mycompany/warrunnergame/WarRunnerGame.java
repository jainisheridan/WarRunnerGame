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
        
        System.out.println("Enter password with minimum lenght 7, Password with atleast one uppercase, one special character");
        
        System.out.print("Enter Player 1 name: ");
        String playerName1 = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.next();
        
        if(checkLength(password)&& checkUpper(password) && checkSpecial(password))
        {
            System.out.println("Valid Password");
        }
        else{
            System.out.println("InValid Password");
        }
        
        int maxRounds = 26; // Set the desired number of rounds here
        WarGame warGame = new WarGame(playerName1);
        warGame.playGame(maxRounds);
    }
        
        public static boolean checkLength(String password){

            if(password.length() > 7)
            {
              return true;  
            }
            return false;
        }
        public static boolean checkUpper(String password) {
            for (char letter : password.toCharArray()) {
                if (Character.isUpperCase(letter)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean checkSpecial(String password) {
            for (char letter : password.toCharArray()) {
                if (!Character.isLetterOrDigit(letter)) {
                    return true;
                }
            }
            return false;
        }
}


