package com.company;

import java.util.Scanner;

public class pertemuan02 {
    public static void main(String[] args) {
//      1. Buatlah program untuk menghitung nilai rata2 dari tiga angka berikut ini 30, 30, 60!
        System.out.println("Soal 1");
        int a = 30;
        int b = 60;

        System.out.println("rata-rata dari 30+30+60");
        System.out.println("adalah " + (a+a+b)/3);

        System.out.println();
//      2. Bangunlah sebuah program untuk menghitung gaji bersih setelah dipotong pajak 10%.
        System.out.println("Soal 2");
        System.out.print("Masukkan Gaji anda: ");

        Scanner gajiKotor = new Scanner(System.in);

        int input = 4000000;
        int potonganPajak;
        potonganPajak = input * 10/100;
        int gajiBersih = input-potonganPajak;
        System.out.println("Gaji Kotor: " + input);
        System.out.println("Setelah Dipotong Pajak 10%, yaitu " + potonganPajak);
        System.out.println("Gaji Bersih: " + gajiBersih);

//      3. Pak Soleh Ingin naik haji, kemudian ikut tabungan haji ONH, biaya haji pada waktu itu adalah
//         50jt, pak soleh sudah mengumpulkan tabungan dirumah sebanyak 20jt, kemudian sebagai
//         tabungan pembuka ia masukkan tabungan ONH sebesar 10jt, jika bulan ini pak soleh baru
//         memulai buka tabungan dan cicilan pertama dimulai bulan depan, maka berapa minimal cicilan
//         yang harus ia tabungkan jika dijadwalkan pak soleh akan naik haji 2 tahun lagi? Selesaikan
//         program untuk menghitung nilai cicilan tersebut!
        System.out.println("Soal 3");
        System.out.println("\t Tabungan Haji ONH");
        System.out.println("Nama: Pak Soleh");
        System.out.println("Pembayaran Awal");

        int biayaHajiONH = 50000000;
        int tabunganRumah = 20000000;
        int pembayaranAwal = 10000000;
        int kekurangan = biayaHajiONH - pembayaranAwal;
        int cicilan = kekurangan/24;

        System.out.println("Cicilan\t Rp. " + cicilan + "/bln" + "(24x)");


//     4. Selesaikan perhitungan berikut :
//        a. 2^8
//        b. 2^2 + 4^1/2^2
        System.out.println("Soal 4");
        double x;
        x = Math.pow(2, 8);
        System.out.println("Jawaban");
        System.out.println("A. " + x);

        double y, z;
        y = Math.pow(2, 2);
        z = Math.pow(4, 1);
        System.out.println("B. " + (y + z / y));
    }
}