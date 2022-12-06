package com.example.praktikum4.Soal2;

public class Komik extends Buku{
    private int volume;
    private String sinopsis;

    public Komik(String j, String p, int t, int v, String s){
        this.judul = j;
        this.penulis  = p;
        this.tahun = t;
        this.volume = v;
        this.sinopsis = s;
    }

    public int division(int a, int b){
        int result = a/b;
        return result;
    }
    public double division (float a, float b){
        double result = a/b;
        return result;
    }

    public String getKomikDetail(String f) {
        if (f == "judul"){
            return this.judul;
        }
        else if (f == "penulis") {
            return this.penulis;
        }
        else if (f == "penulis") {
            return this.penulis;
        }
        else if (f == "tahun") {
            Integer confTh = this.tahun;
            return Integer.toString(this.tahun);
        }
        else if (f == "volume") {
            Integer conf = this.volume;
            return Integer.toString(this.volume);
        }
        else if (f == "sinopsis") {
            return this.sinopsis;
        }
        else {
            return "Salah Input";
        }
    }
}
