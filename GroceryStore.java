package com.egitim.birincihafta;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args){
        String meyve;
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;
        double ucret;
        double kilo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ne almak istersiniz:");
        meyve = scan.nextLine();
        System.out.print("Kaç kilo almak istersiniz:");
        kilo = scan.nextInt();

        if (meyve.equalsIgnoreCase("armut")){
            ucret = (armut*kilo);
            System.out.println("Ödemeniz gereken ücret:" + ucret);
        }
        else if (meyve.equalsIgnoreCase("elma")){
            ucret = (elma*kilo);
            System.out.println("Ödemeniz gereken ücret:" + ucret);
        }
        else if (meyve.equalsIgnoreCase("domates")){
            ucret = (domates*kilo);
            System.out.println("Ödemeniz gereken ücret:" + ucret);
        }
        else if (meyve.equalsIgnoreCase("muz")){
            ucret = (muz*kilo);
            System.out.println("Ödemeniz gereken ücret:" + ucret);
        }
        else if (meyve.equalsIgnoreCase("patlıcan")){
            ucret = (patlıcan*kilo);
            System.out.println("Ödemeniz gereken ücret:" + ucret);
        }
        else{
            System.out.println("İstediğiniz ürün manavımızda bulunmamaktadır.");
        }
    }
}
