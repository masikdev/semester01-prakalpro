package com.company;

//import jdk.nashorn.internal.parser.Scanner;
import jdk.nashorn.internal.parser.TokenType;

import javax.swing.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pertemuan05 {
    public static void main(String[] args) {

        System.out.println("Coba FOR");
        System.out.println("Nomor 1");
        int jml = 0;
        for (int i = 0; i <= 10; i++){
            jml += i;
        }
        System.out.println("Jumlah semua bilangan: " + jml);

        System.out.println("Nomor 2");
        for (double jari = 1.0; jari <= 2.0; jari+= 0.2){
            System.out.println("Radius = " + jari + " Luas= " + jari * Math.PI * jari);
        }

//        System.out.println("Coba WHILE");
//        double r = 0;
//        while (r < 0.99d){
//            r = Math.random();
//            System.out.println(r);
//        }

//        System.out.println("CobaDoWhile");
//        double r2 = 0;
//        do{
//            r2 = Math.random();
//            System.out.println(r);
//        }
//        while (r2 < 0.99d);

        System.out.println();
        System.out.println("Nomor 1 - Faktorial");
        long batas = 4;
        long faktorial = 1;
        for (int i = 0; i <= batas; i++) {
            faktorial = 1;
            for (int faktor = 2; faktor <= i; faktor++) {
                faktorial *= faktor;
            }
            System.out.println(i + "!" + " adalah " + faktorial);
        }

        System.out.println("Nomor 2A");
        int angka1 = 4, angka2 = 4;
        int pangkat1 = 3;
        int awalan1 = 1;
        while (awalan1 < pangkat1){ // 1 < 3, 2 < 3
            angka1 *= angka2; // 4x4 = 16, 16 x 4
            awalan1++;// awalan = 2,
        }
        System.out.println("Angka 1 = " + angka1);
        int nilai1 = 5, nilai2 = 5;
        int pangkat2 = 2;
        int awalan2 = 1;
        while (awalan2 < pangkat2){
            nilai1 *= nilai2;
            awalan2++;
        }
        System.out.println("Angka 2 = " + nilai1);
        System.out.println("Hasil dari 4^3+5^2 adalah: " + (angka1 + nilai1));
        System.out.println("Nomor 2B");
        int nilaiSatu, nilaiDua;
        int faktSatu, faktDua;
        int operasiSatu, operasiDua, jumlah;

        nilaiSatu   = 4;  nilaiDua   = 5;
        faktSatu    = 3;  faktDua    = 2;
        operasiSatu = 1;  operasiDua = 1;

        while (operasiSatu <= nilaiSatu){
            faktSatu = faktSatu * operasiSatu;
            operasiSatu++;
        } while (operasiDua <= nilaiDua){
            faktDua = faktDua * operasiDua;
            operasiDua++;
        }
        jumlah = faktSatu + faktDua;
        System.out.print("Hasil dari 5! + 4!= ");
        System.out.println(jumlah);
        System.out.println("Nomor 2C");
        double aangka1, aangka2, aangka3, aangka4;
        double paangkat1, paangkat2, paangkat3;
        double saatu, duaa, tigaa, empaat;
        double hasilAkhir;

        aangka1   = 4; aangka2   = 5; aangka3   = 4; aangka4 = 5;
        paangkat1 = 2; paangkat2 = 1; paangkat3 = 2;
        saatu     = 1; duaa      = 1; tigaa     = 1;

        for (int i = 1; i <= paangkat1; i++){
            saatu = saatu * aangka1;
        }
        for(int j = 1; j <= paangkat2; j++){
            duaa = duaa * aangka2;
        }
        for (int k = 1; k <= paangkat3; k++){
            tigaa = tigaa * aangka3;
        }
        hasilAkhir = (saatu+duaa)/5+tigaa;
        System.out.println("Hasil dari (4^2+5+4^2)/5+4^2= " + hasilAkhir);
        System.out.println("Nomer 3");

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        int angka;
        try {
            System.out.print("PILIHLAH ANGKA DARI 1 - 10: ");
            angka = Integer.parseInt(userInput.readLine());
            switch (angka){
                case 1:
                    System.out.println("YOU ARE AMAZING!"); break;
                case 2:
                    System.out.println("YOU ARE EXTRAORDINARY!"); break;
                case 3:
                    System.out.println("YOUR DREAMS WILL COME TRUE!"); break;
                case 4:
                    System.out.println("YOU ARE A GREAT PERSON!"); break;
                case 5:
                    System.out.println("NOTHING IS IMPOSSIBLE!"); break;
                case 6:
                    System.out.println("PRACTICE MAKES PERFECT!"); break;
                case 7:
                    System.out.println("EXPERIENCE IS THE BEST TEACHER!"); break;
                case 8:
                    System.out.println("EVERYTHING WILL BE OKAY!"); break;
                case 9:
                    System.out.println("WE HAVE TO OBEY OUR PARENTS!"); break;
                case 10:
                    System.out.println("DON'T FORGET TO FIGHT FOR THE FUTURE!"); break;
                default:
                    System.out.println("INVALID INPUT"); break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Nomer 4");

        Scanner inputData = new Scanner(System.in);
        int nimAwal, nimAkhir;
        int jumlaah = 0;

        System.out.print("Masukkan NIM awal: ");
        nimAwal = inputData.nextInt();
        System.out.print("Masukkan NIM akhir: ");
        nimAkhir = inputData.nextInt();
        System.out.println();

        System.out.println("Daftar NIM bernilai genap:");
        for (int i = nimAwal; i <= nimAkhir; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
                jumlaah = jumlaah + i;
            }
        }
        System.out.println("\nJumlah NIM genap adalah: "  + jumlaah);
        System.out.println("Nomor 5");
        System.out.println("-Perintah 1");
        String angkka = JOptionPane.showInputDialog("Masukkan angka yang anda inginkan!");
        int n = Integer.parseInt(angkka);

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-Perintah 2");
        String angkah = JOptionPane.showInputDialog("Masukkan angka yang anda ingingkan!");
        int p = Integer.parseInt(angkah);

        for(int i = 1; i <= p; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int k = p; k >= i; k--){
                System.out.print(" ");
            }
            for (int l = p; l >= i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-Perintah 3");
        String angkahh = JOptionPane.showInputDialog("Masukkan angka yang anda inginkan!");
        int o = Integer.parseInt(angkahh);

        for (int i = 1; i <= n; i++){
            for (int j = o; j >= i; j--){
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for (int l = o; l >= i; l--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}