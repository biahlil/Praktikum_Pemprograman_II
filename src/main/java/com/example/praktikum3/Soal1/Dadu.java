package com.example.praktikum3.Soal1;

import java.util.Random;

public class Dadu {
    int upperbound = 6;
    public Dadu() {
    }

    public static int acakNilai(){
        Random acak = new Random();
        Dadu dudu = new Dadu();
        int nilai = acak.nextInt(dudu.upperbound) + 1;
        return nilai;
    }
}
