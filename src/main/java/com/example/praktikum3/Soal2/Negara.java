package com.example.praktikum3.Soal2;

import java.util.HashMap;

public class Negara {
    String nama;
    String jenis_Kepemimpinan;
    String nama_Pemimpin;
    int tanggal_Kemerdekaan;
    String bulan_Kemerdekaan;
    int tahun_Kemerdekaan;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis_Kepemimpinan(String jenis_Kepemimpinan) {
        this.jenis_Kepemimpinan = jenis_Kepemimpinan;
    }

    public void setNama_Pemimpin(String nama_Pemimpin) {
        this.nama_Pemimpin = nama_Pemimpin;
    }

    public void setTanggal_Kemerdekaan(int tanggal_Kemerdekaan) {
        this.tanggal_Kemerdekaan = tanggal_Kemerdekaan;
    }

    public void setBulan_Kemerdekaan(int bulan_Kemerdekaan) {
        String stringBulan = mapBulan().get(bulan_Kemerdekaan);
        this.bulan_Kemerdekaan = stringBulan;
    }

    public void setTahun_Kemerdekaan(int tahun_Kemerdekaan) {
        this.tahun_Kemerdekaan = tahun_Kemerdekaan;
    }

    public Negara (){
    }
    public static HashMap<Integer, String> mapBulan() {
            HashMap<Integer, String> bulan = new HashMap<Integer, String>();
            // Add keys and values (Number Month, String Month)
            bulan.put(1, "Januari");
            bulan.put(2, "Februari");
            bulan.put(3, "Maret");
            bulan.put(4, "April");
            bulan.put(5, "Mei");
            bulan.put(6, "Juni");
            bulan.put(7, "Juli");
            bulan.put(8, "Agustus");
            bulan.put(9, "September");
            bulan.put(10, "Oktober");
            bulan.put(11, "November");
            bulan.put(12, "Desember");
            return bulan;
        }
}
