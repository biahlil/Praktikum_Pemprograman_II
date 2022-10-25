package com.example.praktikum3.Soal1;
import java.util.LinkedList;
import java.util.Scanner;

import static com.example.praktikum3.Soal1.Dadu.acakNilai;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int counter = 0;
        int total = 0;
        LinkedList<Integer> dadu = new LinkedList<Integer>();
        while (counter < num) {
            dadu.add(acakNilai());
            int index = counter+1;
            System.out.println("Dadu ke-" + index + " bernilai " + dadu.get(counter));
            total = total + dadu.get(counter);
            counter++;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);

    }
}
