package com.example.praktikum4.Soal2;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan pilihan: ");
        int pilihan = Integer.parseInt(input.nextLine());

        if (pilihan == 1){
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis : ");
            String penulis = input.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahun = Integer.parseInt(input.nextLine());
            System.out.print("Genre : ");
            String genre = input.nextLine();
            System.out.print("Sinopsis : ");
            String sinopsis = input.nextLine();
            Novel novel1 = new Novel(judul, penulis,tahun,genre,sinopsis);

            System.out.println("Data yang baru diinputkan adalah");
            System.out.println("Sebuah novel bergenre " +
                    novel1.getNovelDetail("genre") + "dengan judul " +
                    '"'+ novel1.getNovelDetail("judul") + '"' +
                    ". Novel tersebut ditulis oleh " + novel1.getNovelDetail("penulis") +
                    " dan diterbitkan pada tahun " + novel1.getNovelDetail("tahun") + ".");
            System.out.println("Sinopsis : " + novel1.getNovelDetail("sinopsis"));
        }
        else if (pilihan == 2) {
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis : ");
            String penulis = input.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahun = Integer.parseInt(input.nextLine());
            System.out.print("Volume : ");
            int volume = Integer.parseInt(input.nextLine());
            System.out.print("Sinopsis : ");
            String sinopsis = input.nextLine();

            Komik komik1 = new Komik(judul,penulis,tahun,volume,sinopsis);

            System.out.println("Data yang baru diinputkan adalah");
            System.out.println("Sebuah komik dengan judul " +
                    '"'+ komik1.getKomikDetail("judul") + '"' +
                    ". Komik tersebut dibuat oleh " +
                    komik1.getKomikDetail("penulis") +
                    " dan diterbitkan pada tahun " +
                    komik1.getKomikDetail("tahun") +
                    ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " +
                    komik1.getKomikDetail("volume") +
                    " buah.");
            System.out.println("Sinopsis : " + komik1.getKomikDetail("sinopsis"));
        }
    }
}
