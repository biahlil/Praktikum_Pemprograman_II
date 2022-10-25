package com.example.praktikum1;
import java.util.Scanner;

public class PRAK105_2010817110011_BiahlilHaqAuliaAkbarAwaludin {
    private static final double phi = 3.41;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double volume = phi * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung dengan jari-jari " + jariJari + " cm dan tinggi " +
                tinggi + " cm adalah " + volume + " m3");
    }
}