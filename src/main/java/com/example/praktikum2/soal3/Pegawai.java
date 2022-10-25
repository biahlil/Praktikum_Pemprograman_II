package com.example.praktikum2.soal3;

//Error Karena Nama class berbeda Seharusnya Pegawai
//public class Employee {
    public class Pegawai {
    public String nama;
//  Error karena properti asal perlu tipe data string
//  public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama(){
        return nama;
    }

    public String getAsal(){
        return asal;
    }

//  Error Karena Setter memerlukan argumen
//  public void setJabatan(){
    public void setJabatan(String jabatan){
//  Error karena pada setter ini jabatan di bikin statsi harusnya Ditentukan di main
//  this.jabatan = j;
    this.jabatan = jabatan;
}

//  Penambahan Constructor
    public Pegawai(){
    }
}
