package com.example.praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args){
//Terjadi error karena bedanya nama class dan tidak adanya construktor untuk class
//  Pegawai p1 = new Pegawai();
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
//  Terjadi Error Karena properti dari class menggunakan tipe data char Solusi ganti tipe data properti
        p1.asal = "Kingdom of Orvel";
//  Error Karena perbedaan dengan contoh, karena umur belum di set dan kurang kalimat tahun
        p1.umur = 17;

        p1.setJabatan("Assasin");
//  Error Karena pada contoh seharusnya hanya Nama:
//  System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
//  Error Karena perbedaan dengan contoh, karena umur belum di set dan kurang kalimat tahun
//  System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
