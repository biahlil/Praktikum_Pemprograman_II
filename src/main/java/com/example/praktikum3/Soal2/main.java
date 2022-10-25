package com.example.praktikum3.Soal2;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> negara = new LinkedList<Negara>();
        int num = Integer.parseInt(input.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        while (counter1 < num){
            negara.add(new Negara());
            negara.get(counter1).setNama(input.nextLine());
            negara.get(counter1).setJenis_Kepemimpinan(input.nextLine());
            negara.get(counter1).setNama_Pemimpin(input.nextLine());
            if (!(Objects.equals(negara.get(counter1).jenis_Kepemimpinan, "monarki"))) {
                negara.get(counter1).setTanggal_Kemerdekaan(Integer.parseInt(input.nextLine()));
                negara.get(counter1).setBulan_Kemerdekaan(Integer.parseInt(input.nextLine()));
                negara.get(counter1).setTahun_Kemerdekaan(Integer.parseInt(input.nextLine()));
            }
            counter1++;
        }
        while (counter2 < num){
            System.out.println("Negara " + negara.get(counter2).nama +
                    " mempunyai " + negara.get(counter2).jenis_Kepemimpinan +
                    " bernama " + negara.get(counter2).nama_Pemimpin);
            if (!(Objects.equals(negara.get(counter2).jenis_Kepemimpinan, "monarki"))) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.get(counter2).tanggal_Kemerdekaan +
                        " " + negara.get(counter2).bulan_Kemerdekaan + " " + negara.get(counter2).tahun_Kemerdekaan);
            }
            counter2++;
        }
    }
}
