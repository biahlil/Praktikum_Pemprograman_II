package com.example.praktikum4.Soal1;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Judul: ");
        String judul = input.nextLine();
        System.out.print("Penulis: ");
        String penulis = input.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahun = input.nextInt();

        Buku buku1 = new Buku(judul,penulis,tahun);
        buku1.display();
    }
}
