package Lab_4;

import java.util.Scanner;

public class Stick_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Game state variables
        boolean stick1 = true;
        boolean stick2 = true;
        boolean stick3 = true;
        boolean stick4 = true;
        boolean stick5 = true;

        int currentPlayer = 1;
        int totalRounds = 0;
        int player1Sticks = 0;
        int player2Sticks = 0;
        boolean gameEnded = false;
        String winner = "";
        String loser = "";

        System.out.println("Welcome to the Five Sticks Game!");

        //Game loop
        while (!gameEnded) {
            totalRounds++;

            // Display stick and check stick status
            System.out.print("1: ");
            if (stick1) {
                System.out.println("------");
            } else {
                System.out.println("");
            }
            System.out.print("2: ");
            if (stick2) {
                System.out.println("------");
            } else {
                System.out.println("");
            }
            System.out.print("3: ");
            if (stick3) {
                System.out.println("------");
            } else {
                System.out.println("");
            }
            System.out.print("4: ");
            if (stick4) {
                System.out.println("------");
            } else {
                System.out.println("");
            }
            System.out.print("5: ");
            if (stick5) {
                System.out.println("------");
            } else {
                System.out.println("");
            }

            // Player turn
            System.out.println("The " + currentPlayer + " player turn");
            System.out.print("Please choose the stick number: ");

            boolean validChoice = false;
            while (!validChoice) {
                int choice = scanner.nextInt();

                if (choice < 1 || choice > 5) {
                    System.out.print("Invalid number! Please choose a stick number between 1 and 5: ");
                } else {
                    boolean stickAvailable = false;

                    switch (choice) {
                        case 1:
                            stickAvailable = stick1;
                            break;
                        case 2:
                            stickAvailable = stick2;
                            break;
                        case 3:
                            stickAvailable = stick3;
                            break;
                        case 4:
                            stickAvailable = stick4;
                            break;
                        case 5:
                            stickAvailable = stick5;
                            break;
                    }
                    if (!stickAvailable) {
                        System.out.print("That stick has already been picked! Please choose another: ");
                    } else {
                        validChoice = true;

                        switch (choice) {
                            case 1:
                                stick1 = false;
                                break;
                            case 2:
                                stick2 = false;
                                break;
                            case 3:
                                stick3 = false;
                                break;
                            case 4:
                                stick4 = false;
                                break;
                            case 5:
                                stick5 = false;
                                break;
                        }
                        if (currentPlayer == 1) {
                            player1Sticks++;
                        } else {
                            player2Sticks++;
                        }
                        System.out.println("Player " + currentPlayer + " picked stick " + choice);
                        System.out.println();

                        if (choice == 3) {
                            gameEnded = true;
                            loser = "Player " + currentPlayer;
                            if (currentPlayer == 1) {
                                winner = "Player 2";
                            } else {
                                winner = "Player 1";
                            }
                        }
                    }
                }
            }
            if (!gameEnded && !stick1 && !stick2 && !stick3 && !stick4 && !stick5) {
                gameEnded = true;
                winner = "It's a tie";
                loser = "No one";
            }
            if (!gameEnded) {
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
        }
        // Display final result
        System.out.println("=== GAME OVER ===");
        System.out.println("Winner: " + winner);
        System.out.println("Loser: " + loser);
        System.out.println("Total number of rounds played: " + totalRounds);
        System.out.println("Number of sticks picked by Player 1: " + player1Sticks);
        System.out.println("Number of sticks picked by Player 2: " + player2Sticks);
    }
}