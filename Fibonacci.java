package com.egitim.birincihafta;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        //    Fibonacci Serisi : 0,1,1,2,3,5,8,13,21...
        int s1=0;
        int s2=1;
        int toplam;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = scan.nextInt();
        System.out.println("***************************************");
        System.out.print(sayi + " Sayısının Fibonacci Serisi:");

        for (int i=0; i<sayi; i++){
            System.out.print(s1 + " ");
            toplam  = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}
