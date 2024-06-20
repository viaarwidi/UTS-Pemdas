/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utess;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UTEES2 {
        public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
  double sudut = in.nextDouble();
  double tan = Math.tan(Math.toRadians(sudut));
  double jarak = 50* tan;
       int bulat = (int) Math.ceil(jarak);
        System.out.println("Jarak horizontal bola terhadap gedung: "+bulat + " meter");
  double kecepatan = in.nextDouble();
  double konversi = kecepatan*10/36;
  double waktu = jarak / konversi ;
  
    if (waktu < 6){
        boolean peserta = waktu < 6 ;
        System.out.println("Peserta dapat menangkap bola: "+peserta);
    }
        else {
        boolean peserta = waktu < 6 ;
                System.out.println("Peserta dapat menangkap bola: "+peserta);
    }
}
}