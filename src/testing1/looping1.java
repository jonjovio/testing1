/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class looping1 {
    public static int biayaTetap(int tahun){
        if (tahun <= 2013) {
            return 1000000;
        }else if (tahun < 2019) {
            return 1500000;
        }else if (tahun < 2022) {
            return 2000000;
        }else{
            return 3000000;
        }
    }
    
    public static int biayaSks(String jurusan){
        if (jurusan == "MG") {
            return 200000;
        } else if (jurusan == "TI") {
            return 225000;
        } else {
            return 275000;
        }
    }
    
    public static int totalBayar(int biaya, int sks) {
        return biaya * sks;
    }
    
    public static void main(String[] args) {
        String nama[] = new String[3], jurusan[] = new String[3];
        int nim[] = new int[3];
        int tahun[] = new int[3];
        int sks = 20;
        
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("nama:");
//            nama[i] = scan.next();
//            System.out.println("nim:");
//            nim[i] = scan.nextInt();
//            System.out.println("jurusan:");
//            jurusan[i] = scan.next();
//            System.out.println("tahun:");
//            tahun[i] = scan.nextInt();
//        }
        nama[0] = "jov";
        nim[0] = 123;
        jurusan[0] = "MG";
        tahun[0] = 2014;
        
        nama[1] = "jo";
        nim[1] = 143;
        jurusan[1] = "TI";
        tahun[1] = 2015;
        
        nama[2] = "jiv";
        nim[2] = 423;
        jurusan[2] = "IF";
        tahun[2] = 2017;
        
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("No.\tNIM\tJURUSAN\tBiayaTetap\tBiayaSKS\tTotalSKS\tBayar");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            int biayaSKS = biayaSks(jurusan[i]);
            int totalBayar = totalBayar(biayaSKS, sks);
            System.out.println((i+1) + ".\t" + nim[i] + "\t" + jurusan[i] + "\t" + biayaTetap(tahun[i]) + "\t\t" + biayaSKS + "\t\t" + sks + "\t\t" + totalBayar);
        }
    }
}
