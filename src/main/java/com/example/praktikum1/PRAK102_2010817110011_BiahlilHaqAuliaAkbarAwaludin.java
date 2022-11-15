package com.example.praktikum1;
import java.util.Scanner;

public class PRAK102_2010817110011_BiahlilHaqAuliaAkbarAwaludin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] container = new int[7];
        int counter = 0;
        while (counter < 7) {
            if (num % 2 == 0) {
                container[counter] = num / 2 - 1;
            }
            else {
                container[counter] = num;
            }
            if (counter == 6) {
                System.out.print(container[counter]);
            }
            else {
                System.out.print(container[counter] + ", ");
            }
            num++;
            counter++;
        }
    }
}