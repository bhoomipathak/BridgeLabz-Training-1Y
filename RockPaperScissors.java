package com.gla.string.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String comp) {

        if (user.equals(comp))
            return "Draw";

        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("rock") && comp.equals("paper")) return "Computer";

        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("paper") && comp.equals("scissors")) return "Computer";

        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("scissors") && comp.equals("rock")) return "Computer";

        return "Invalid";
    }

    static String[][] calculateStats(int userWin, int compWin, int games) {

        String[][] stats = new String[2][3];

        double userPer = (userWin * 100.0) / games;
        double compPer = (compWin * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWin);
        stats[0][2] = String.valueOf(userPer);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWin);
        stats[1][2] = String.valueOf(compPer);

        return stats;
    }

    static void display(String[][] games, String[][] stats) {

        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("---------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tPercentage");
        System.out.println("----------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        String[][] gameData = new String[games][3];

        int userWin = 0;
        int compWin = 0;

        for (int i = 0; i < games; i++) {

            String userChoice = sc.next();
            String compChoice = computerChoice();

            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWin++;
            if (winner.equals("Computer")) compWin++;

            gameData[i][0] = userChoice;
            gameData[i][1] = compChoice;
            gameData[i][2] = winner;
        }

        String[][] stats = calculateStats(userWin, compWin, games);
        display(gameData, stats);

        sc.close();
    }
}

