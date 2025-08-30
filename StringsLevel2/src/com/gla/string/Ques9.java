package com.gla.string;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();

        int playerWins = 0, computerWins = 0, draws = 0;
        String[][] results = new String[totalGames][3];

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();

            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(totalGames, playerWins, computerWins, draws);

        displayResults(results, stats);
        sc.close();
    }

    // Computer choice using Math.random
    static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // Determine winner
    static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";

        if (player.equals("rock")) {
            return computer.equals("scissors") ? "Player" : "Computer";
        } else if (player.equals("paper")) {
            return computer.equals("rock") ? "Player" : "Computer";
        } else if (player.equals("scissors")) {
            return computer.equals("paper") ? "Player" : "Computer";
        } else {
            return "Invalid"; // if player enters something else
        }
    }

    // Calculate win stats
    static String[][] calculateStats(int total, int playerWins, int computerWins, int draws) {
        String[][] stats = new String[3][3];

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", (playerWins * 100.0 / total)) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0 / total)) + "%";

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.format("%.2f", (draws * 100.0 / total)) + "%";

        return stats;
    }

    // Display all game results and stats
    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("---------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("---------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
}

