package com.example.praktikum2.soal2;
//Cari Pengaturan Koma
public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    String pemilik;
    int pajak;
    public Mobil(){
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    public String getPemilik(){
        return pemilik;
    }
    public int getPajak(){
        this.pajak = this.harga * 2 / 100 ;
        return pajak;
    }

    public void info(){
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga: Rp." + this.harga);
        System.out.println("Tahun Keluaran: " + this.tahun_keluaran);
        System.out.println("Kapasitas :" + this.kapasitas + "cc");
    }
}
