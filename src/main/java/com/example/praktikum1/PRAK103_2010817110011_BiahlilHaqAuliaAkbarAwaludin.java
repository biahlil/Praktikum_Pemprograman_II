package com.example.praktikum1;
import java.util.Scanner;

public class PRAK103_2010817110011_BiahlilHaqAuliaAkbarAwaludin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] container = new int[5];
        int counter = 0;
        do {
            container[counter] = num;
            if (counter == 4) {
                System.out.print(container[counter]);
            } else if (!(container[counter] % 7 == 0)) {
                System.out.print(container[counter] + ", ");
            }
            num--;
            counter++;
        }while (counter < 5);
    }
}