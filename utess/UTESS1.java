/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utess;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UTESS1 {

    public static void main(String[] args) {
             
 // Daftar harga tiket
        int hargamotor = 2000;
        int hargamobil = 4000;
        int hargabus  = 9000;
      

        // Input
        Scanner input = new Scanner(System.in);
        //System.out.print("Masukkan jenis tiket (1 untuk dewasa, 2 untuk anak-anak, 3 untuk balita): ");
        int jenisKendaraan = input.nextInt();
        //System.out.print("Masukkan jumlah tiket yang dibeli: ");
        int lama = input.nextInt();
        //System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        int bayar = input.nextInt();

        // Hitung total biaya tiket
        int totalharga = 0;
        if (jenisKendaraan == 1) {
            totalharga = hargamotor * lama;
        } else if (jenisKendaraan == 2) {
            totalharga = hargamobil * lama;
        } else if (jenisKendaraan == 3) {
            totalharga = hargabus * lama;
        } else {
           // System.out.println("Jenis tiket tidak valid");
            System.exit(0);
        }

        // Periksa uang yang dibayarkan
        if (bayar == totalharga) {
           System.out.println("Uang yang dibayarkan pas");
        } else if (bayar < totalharga) {
           System.out.println("Uang anda belum mencukupi");
        } else {
            int kembalian = bayar - totalharga;
            int kembalian10ribu = kembalian / 10000;
            kembalian %= 10000;
            int kembalian5ribu = kembalian / 5000;
            kembalian %= 5000;
            int kembalian1ribu = kembalian / 1000;
            kembalian %= 1000;
            int kembalian500 = kembalian / 500;
            kembalian %= 500;
            int kembalian100 = kembalian / 100;
            System.out.println("Anda mendapatkan kembalian sebesar:");
            System.out.println(kembalian10ribu + " uang 10.000");
            System.out.println(kembalian5ribu + " uang 5.000");
            System.out.println(kembalian500 + " uang 500");
            System.out.println(kembalian100 + " uang 100");
        }
    }
}
