package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pertemuan03 {
    public static void main(String[] args) { // SOAL 1 & 2 TIDAK BISA DI RUN BARENG
//     1. Buat aplikasi dengan menggunakan bufferedreader yang menanyakan input bilangan sebanyak
//        3 kali. Output yang diharapkan :
//        Masukkan Nilai Pertama = 20
//        Masukkan Nilai Kedua = 12
//        Masukkan Nilai ke tiga = 3,
//        Nilai-nilai yang dimasukkan = 20, 12, 3
        System.out.println("Soal 1");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String angkaSatu, angkaDua, angkaTiga;

        try{
            System.out.print("Masukkan Angka Pertama: ");
            angkaSatu = input.readLine();
            System.out.print("Masukkan Angka Kedua: ");
            angkaDua = input.readLine();
            System.out.print("Masukkan Angka Ketiga: ");
            angkaTiga = input.readLine();
            System.out.println("Angka - angka yang dimasukkan adalah: ");
            System.out.println(angkaSatu + ", " + angkaDua + ", " + angkaTiga);
        } catch (IOException e) {
            System.out.println("Error");
        }

//     2. Dari Soal nomor 1 silahkan kerjakan dengan perintah yang sama namun menggunakan
//        JOptionPane
        System.out.println("Soal 2");
        String message = "Welcome!";
        JOptionPane.showMessageDialog(null, "Welcome!");

        String x, y, z;
        x = JOptionPane.showInputDialog("Masukkan angka pertama!");
        y = JOptionPane.showInputDialog("Masukkan angka kedua!");
        z = JOptionPane.showInputDialog("Masukkan angka ketiga!");
        String notif = "Nilai - nilai yang dimasukkan adalah\n";
        String output = x + ", " + y + ", " + z;
        JOptionPane.showMessageDialog(null, notif + output);
    }


}