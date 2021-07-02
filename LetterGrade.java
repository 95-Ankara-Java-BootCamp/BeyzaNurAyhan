package com.egitim.birincihafta;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args){
        int vize;
        int finalNotu;
        double sonuc;

        Scanner scan = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz:");
        vize = scan.nextInt();
        System.out.print("Final notunuzu giriniz:");
        finalNotu = scan.nextInt();
        sonuc = (vize*0.4 + finalNotu*0.6);
        System.out.println("Ders notunuz:" + sonuc);

        if (sonuc >= 70 && sonuc <= 100){
            System.out.println("Harf notunuz: AA");
        }
        else if (sonuc >= 50 && sonuc <= 69){
            System.out.println("Harf notunuz: BB");
        }
        else if (sonuc >= 35 && sonuc <= 49){
            System.out.println("Harf notunuz: DC");
        }
        else if (sonuc >= 0 && sonuc <= 34){
            System.out.println("Harf notunuz: FF");
        }
        else{
            System.out.println("Lütfen geçerli bir sınav notu giriniz.");
        }
    }
}
