package com.example.praktikum2.soal1;
//Cari Pengaturan Koma
    public class mangga {
        String nama;
        float berat;
        int jumlah;
        float harga;
        float totalBerat;
        float totalHarga;

        public mangga() {
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public float getBerat() {
            return berat;
        }

        public void setBerat(float berat) {
            this.berat = berat;
        }

        public int getJumlah() {
            return jumlah;
        }

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }

        public void setHarga(float harga) {
            this.harga = harga;
        }

        public float getTotalBerat() {
            this.totalBerat = this.berat * this.jumlah;
            return this.totalBerat;
        }

        public float getTotalHarga() {
            this.totalHarga = this.harga * this.jumlah;
            return this.totalHarga;
        }

    }

