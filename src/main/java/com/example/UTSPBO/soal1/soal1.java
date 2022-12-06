package com.example.UTSPBO.soal1;

import com.example.praktikum3.Soal2.Negara;

import java.util.LinkedList;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int counterA = 0;
        int counterB = 0;
        LinkedList<Tanaman> tanaman = new LinkedList<Tanaman>();
        System.out.print("Masukan Jumlah Tanaman: ");
        int angka = Integer.parseInt(input.nextLine());

        while (counterA < angka) {
            tanaman.add(new Tanaman());
            System.out.print("\nMasukan Nama Tanaman: ");
            String nama = input.nextLine();
            System.out.print("Masukan Jenis Tanaman: ");
            String jenis = input.nextLine();
            System.out.print("Masukan Tinggi Tanaman (Tanpa satuan): ");
            int tinggi = Integer.parseInt(input.nextLine());
            tanaman.get(counterA).setNama(nama);
            tanaman.get(counterA).setJenis(jenis);
            tanaman.get(counterA).setTinggi(tinggi);
            counterA++;
        }

        while (counterB < angka){
            tanaman.get(counterB).display();
            System.out.println("Tanaman Tumbuh 1 cm");
            tanaman.get(counterB).tumbuh();
            System.out.print("Masukan Tanaman Tumbuh : ");
            int tinggi = Integer.parseInt(input.nextLine());
            tanaman.get(counterB).tumbuh(tinggi);
            System.out.print("\n Data Tanaman Terbaru \n");
            tanaman.get(counterB).display();
            counterB++;
        }
    }
}
