/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        
        String kembali = "y";
        while (kembali.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);       
        String ul="",lagi;
        
        System.out.println(">>PROGRAM MENGHITUNG VOLUME DAN LUAS PERMUKAAN<<");
        System.out.println("PILIHAN MENU");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Limas Segitiga");
        System.out.println("4. Keluar");
        System.out.println(" ");
        System.out.print("Masukkan Pilihan : ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:{
                Menu menu=new Menu();
                Menu.BalokMenu();
                break;
            }
            case 2:{
                Menu menu=new Menu();
                Menu.KerucutMenu();
                break;
            }
             case 3:{
                Menu menu=new Menu();
                Menu.LimasSegitigaMenu();
                break;
             }
            case 4:{
                System.out.println("Pilihan Menu tidak tersedia !! ");
            }
                break;
        }
        System.out.println(" ");
        System.out.print("Kembali ke menu (y/t)? ");
            kembali = input.next();
        }
    }
}
    
