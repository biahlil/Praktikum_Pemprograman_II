package com.example.praktikum2.soal1;

public class soal1 {
    public static void main (String[] args) {
        mangga arumanis = new mangga();
        arumanis.setNama("Arumanis");
        arumanis.setBerat(0.3f);
        arumanis.setJumlah(13);
        arumanis.setHarga(5000);

        mangga manalagi = new mangga();
        manalagi.setNama("Manalagi");
        manalagi.setBerat(0.5f);
        manalagi.setJumlah(17);
        manalagi.setHarga(7500);

        mangga madu = new mangga();
        madu.setNama("Madu");
        madu.setBerat(0.375f);
        madu.setJumlah(12);
        madu.setHarga(6500);

        System.out.println("Nama Mangga : " + arumanis.getNama());
        System.out.println("Berat : " + arumanis.getBerat() + " kg");
        System.out.println("Jumlah Beli : " + arumanis.getJumlah());
        System.out.println("Total Berat : " + arumanis.getTotalBerat() + " kg");
        System.out.println("Total Harga : Rp." + arumanis.getTotalHarga() + "\n");

        System.out.println("Nama Mangga : " + manalagi.getNama());
        System.out.println("Berat : " + manalagi.getBerat() + " kg");
        System.out.println("Jumlah Beli : " + manalagi.getJumlah());
        System.out.println("Total Berat : " + manalagi.getTotalBerat() + " kg");
        System.out.println("Total Harga : Rp." + manalagi.getTotalHarga()+ "\n");

        System.out.println("Nama Mangga : " + madu.getNama());
        System.out.println("Berat : " + madu.getBerat() + " kg");
        System.out.println("Jumlah Beli : " + madu.getJumlah());
        System.out.println("Total Berat : " + madu.getTotalBerat() + " kg");
        System.out.println("Total Harga : Rp." + madu.getTotalHarga()+ "\n");
    }
}