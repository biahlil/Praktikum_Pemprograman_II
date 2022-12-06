package com.example.UTSPBO.soal4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern ptr = Pattern.compile("[~!@#$%^&*()_+{}\\\\[\\\\]:;,.<>/?-]");
        int counter = 0;
        String left = input.nextLine();
        String[] right;
        right = ptr.split(left);
        String open ="";
        while (counter < right.length) {
            open = open + right[counter].charAt(0);
            counter++;
        }
        for (String element: right) {
            System.out.println(element);
        }
        System.out.println(open);
    }
}
