package com.example.UTSPBO.soal2;

import com.example.praktikum3.Soal2.Negara;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern ptr = Pattern.compile(" ");
        int jumlahDadu= Integer.parseInt(input.nextLine());
        String test;
        test= input.nextLine();
        String[] array = null;
        array = ptr.split(test);
        Arrays.sort(array);
        System.out.println(array[jumlahDadu-1]);
    }
}
