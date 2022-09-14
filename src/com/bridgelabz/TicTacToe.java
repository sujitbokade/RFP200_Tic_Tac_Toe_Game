package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game!");
        char[] board = new char[10];
        char player1Letter = ' ';
        char player2Letter = ' ';
        createBoard(board);
        showBoard(board);

        player1Letter = chooseLetter();
        player2Letter = (player1Letter == 'x') ? 'o' : 'x';

        System.out.println("Player 1 Letter is: " + player1Letter);
        System.out.println("Player 2 Letter is: " + player2Letter);
    }

    static void createBoard(char[] board) {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    static char chooseLetter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Letter X or O");
        return sc.next().charAt(0);
    }
    static void showBoard(char[]board){
            System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
            System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
            System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        }
    }

