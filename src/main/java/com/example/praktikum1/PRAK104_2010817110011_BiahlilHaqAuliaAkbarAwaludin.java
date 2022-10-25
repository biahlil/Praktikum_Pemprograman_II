package com.example.praktikum1;
import java.util.Arrays;
import java.util.Scanner;

public class PRAK104_2010817110011_BiahlilHaqAuliaAkbarAwaludin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int scoreAndi = 0;
        int scoreBudi = 0;
        int[] andi = new int[3];
        int[] budi = new int[3];
        System.out.print("Kartu Andi: ");
        andi[0] = input.nextInt();
        andi[1] = input.nextInt();
        andi[2] = input.nextInt();
        System.out.print("\n");
        System.out.print("Kartu Budi: ");
        budi[0] = input.nextInt();
        budi[1] = input.nextInt();
        budi[2] = input.nextInt();
        System.out.print("\n");
        while (counter < 3) {
            if (andi[counter] < budi[counter]) {
                scoreBudi++;
            } else if (andi[counter] > budi[counter]) {
                scoreAndi++;
            }
            counter++;
        }
        if (scoreAndi < scoreBudi){
            System.out.println("Budi");
        } else if (scoreAndi > scoreBudi) {
            System.out.println("Andi");
        } else if (scoreAndi == scoreBudi) {
            System.out.println("Seri");
        }
    }
}