package com.example.UTSPBO.soal1;

public class Tanaman {
    protected String nama;
    protected String jenis;
    protected int tinggi;

    public Tanaman(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    protected void display(){
        System.out.println("\nNama: " + this.nama);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Tinggi: " + this.tinggi + "cm");
    }
    protected void tumbuh(){
        this.tinggi= this.tinggi +1;
    }
    protected void tumbuh(int cm) {
        this.tinggi= this.tinggi + cm;
    }
}
