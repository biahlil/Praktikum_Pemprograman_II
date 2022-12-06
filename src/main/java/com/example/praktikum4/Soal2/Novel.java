package com.example.praktikum4.Soal2;

public class Novel extends Buku {
    private String genre;
    private String sinopsis;

    public Novel(String j, String p, int t, String g, String s){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
        this.genre = g;
        this.sinopsis = s;
    }

    public String getNovelDetail(String f){
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
            Integer conf = this.tahun;
            return Integer.toString(this.tahun);
        }
        else if (f == "genre") {
            return this.genre;
        }
        else if (f == "sinopsis") {
            return this.sinopsis;
        }
        else {
            return "Salah Input";
        }
    }
}
