package com.company;

import javax.swing.*;

public class pertemuan04 {
    public static void main(String[] args) {
//     1. Sebuah perusahaan memberikan komisi kepada salesmannya dengan ketentuan sebagai berikut:
//        - Bila seorang salesman dapat menjual barang hingga Rp 2.000.000 maka dia akan mendapat uang
//          jasa sebesar Rp. 100.000 ditambah dengan uang komisi sebesar 10% dari pendapatan hari itu.
//        - Bila seorang salesman dapat menjual barang di atas Rp. 2.000.000 hingga 5.000.000 maka dia akan
//          mendapat uang jasa sebesar Rp 200.000 ditambah dengan uang komisi sebesar 15% dari
//          pendapatan hari itu.
//        - Bila seorang salesman dapat menjual barang di atas Rp. 5.000.000 maka dia akan mendapat uang
//          jasa sebesar Rp. 300.000 ditambah dengan uang komisi sebesar 20% dari pendapatan hari itu.
//        Bangunlah program untuk menghitung pendapatan seorang salesman hari itu. Nilai hasil penjualan
//        dimasukkan melalui JOptionPane.

        String msg1 = "\tSelamat Datang\nAmbil bonus anda!";
        JOptionPane.showMessageDialog(null, msg1);
        int pendapatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Pendapatan Anda Hari Ini!"));


        int bonus1, bonus2, bonus3;
        bonus1 = 100000 + (pendapatan * 10/100);
        bonus2 = 200000 + (pendapatan * 15/100);
        bonus3 = 300000 + (pendapatan * 20/100);

        if (pendapatan == 2000000) {
            JOptionPane.showMessageDialog(null, "Komisi anda adalah\nRp. " + bonus1);
        } else if (pendapatan > 2000000 && pendapatan <= 5000000) {
            JOptionPane.showMessageDialog(null, "Komisi anda adalah\nRp. " + bonus2);
        } else if (pendapatan > 5000000) {
            JOptionPane.showMessageDialog(null, "Komisi anda adalah\nRp. " + bonus3);
        }

//        Adi = 70
//        Budi = 65
//        Caca = 90
//        Deny = 75
//     2. Buat listing program untuk memberikan nilai huruf pada masing-masing mahasiswa pada table
//        tersebut jika kaidah pemberian nilai huruf seperti berikut ini:
//        36-45 Nilai D
//        46-55 Nilai C
//        56-65 Nilai C+
//        66-75 Nilai B
//        76-85 Nilai B+
//        86-100 Nilai A
//        Kemudian munculkan message yang mempunya nilai terendah dan yang mempunyai nilai terkecil

        String nama1 = "Adi";  String nama3 = "Caca";
        String nama2 = "Budi"; String nama4 = "Deny";
        int nilai1 = 70; int nilai2 = 65;
        int nilai3 = 90; int nilai4 = 75;
        System.out.print("Nama\tNilai\tHuruf");
        System.out.println();

        if (nilai1 >= 86) {
            System.out.println(nama1 + "\t " + nilai1 + "\t  A");
        } else if (nilai1 >= 76) {
            System.out.println(nama1 + "\t " + nilai1 + "\t  B+");
        } else if (nilai1 >= 66) {
            System.out.println(nama1 + "\t " + nilai1 + "\t  B");
        } else if (nilai1 >= 56) {
            System.out.println(nama1 + "\t " + nilai1 + "\t  C+");
        } else if (nilai1 >= 46) {
            System.out.println(nama1 + "\t " + nilai1 + "\t  C");
        } else if (nilai1 >= 36) {
            System.out.println(nama1 + "\t " + nilai1 + "\t  D");
        } else {
            System.out.println(nama1 + "\t " + nilai1 + " ");
        }

        if (nilai2 >= 86) {
            System.out.println(nama2 + "\t " + nilai2 + "\t  A");
        } else if (nilai2 >= 76) {
            System.out.println(nama2 + "\t " + nilai2 + "\t  B+");
        } else if (nilai2 >= 66) {
            System.out.println(nama2 + "\t " + nilai2 + "\t  B");
        } else if (nilai2 >= 56) {
            System.out.println(nama2 + "\t " + nilai2 + "\t  C+");
        } else if (nilai2 >= 46) {
            System.out.println(nama2 + "\t " + nilai2 + "\t  C");
        } else if (nilai2 >= 36) {
            System.out.println(nama2 + "\t " + nilai2 + "\t  D");
        } else {
            System.out.println(nama2 + "\t " + nilai2 + " ");
        }

        if (nilai3 >= 86) {
            System.out.println(nama3 + "\t " + nilai3 + "\t  A");
        } else if (nilai3 >= 76) {
            System.out.println(nama3 + "\t " + nilai3 + "\t  B+");
        } else if (nilai3 >= 66) {
            System.out.println(nama3 + "\t " + nilai3 + "\t  B");
        } else if (nilai3 >= 56) {
            System.out.println(nama3 + "\t " + nilai3 + "\t  C+");
        } else if (nilai3 >= 46) {
            System.out.println(nama3 + "\t " + nilai3 + "\t  C");
        } else if (nilai3 >= 36) {
            System.out.println(nama3 + "\t " + nilai3 + "\t  D");
        } else {
            System.out.println(nama3 + "\t " + nilai3 + " ");
        }

        if (nilai4 >= 86) {
            System.out.println(nama4 + "\t " + nilai4 + "\t  A");
        } else if (nilai4 >= 76) {
            System.out.println(nama4 + "\t " + nilai4 + "\t  B+");
        } else if (nilai4 >= 66) {
            System.out.println(nama4 + "\t " + nilai4 + "\t  B");
        } else if (nilai4 >= 56) {
            System.out.println(nama4 + "\t " + nilai4 + "\t  C+");
        } else if (nilai3 >= 46) {
            System.out.println(nama4 + "\t " + nilai4 + "\t  C");
        } else if (nilai4 >= 36) {
            System.out.println(nama4 + "\t " + nilai4 + "\t  D");
        } else {
            System.out.println(nama4 + "\t " + nilai4 + " ");
        }

        System.out.println("\nNilai Tertinggi: " + nama3 +", dengan nilai " + nilai3 + " predikat A");
        System.out.println("Nilai Terendah: " + nama2 + ", dengan nilai " + nilai2 + " predikat B");

    }
}