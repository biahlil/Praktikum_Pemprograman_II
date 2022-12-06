package com.example.UTSPBO.soal3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Pattern ptr = Pattern.compile(" ");
        int arnold = 0;
        int bella = 0;
        int counter = 0;
        String score = input.nextLine();
        int i1, i2;


        // A = 10 B=11
        i1 = Character.getNumericValue(score.charAt(0));
        i2 = Character.getNumericValue(score.charAt(1));
        System.out.println(score);
        System.out.println(i1);
        System.out.println(i2);

        while (counter < score.length()) {
            if (Character.getNumericValue(score.charAt(counter)) == 10) {
                counter++;
                arnold = arnold + Character.getNumericValue(score.charAt(counter));
            } else if (Character.getNumericValue(score.charAt(counter)) == 11) {
                counter++;
                bella = bella + Character.getNumericValue(score.charAt(counter));
            }
            else {
                System.out.println("Salah Input");
            }
            counter++;
        }
        if (arnold > bella) {
            System.out.println("Arnold, Skor : " + arnold);
        } else if (arnold< bella) {
            System.out.println("Bella, Skor : " + bella);
        } else {
            System.out.println("Seri");
        }
    }
}
