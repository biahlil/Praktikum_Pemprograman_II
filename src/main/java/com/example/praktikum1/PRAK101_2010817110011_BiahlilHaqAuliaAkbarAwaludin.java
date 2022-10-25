package com.example.praktikum1;
import java.util.Scanner;
public class PRAK101_2010817110011_BiahlilHaqAuliaAkbarAwaludin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String temapatLahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        float beratBadan = input.nextFloat();

        String namaBulanLahir[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        if (bulanLahir >= 1 && bulanLahir <= 12) {
            System.out.print("Data Telah Ditambahkan,");
            System.out.print("Nama Lengkap " + nama + ", Lahir di " + temapatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulanLahir[bulanLahir-1] + " " + tahunLahir + "\n" +
                    "Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        }
    }
}