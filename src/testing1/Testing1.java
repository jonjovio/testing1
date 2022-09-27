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
public class Testing1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int i;
        
        System.out.println("angka:");
        i = scan.nextInt();
        
        if (i < 5) {
            System.out.println("angka yang dimasukkan lebih kecil dari 5");
        } else if (i == 5) {
            System.out.println("angka yang dimasukkan sama dengan 5");
        } else {
            System.out.println("angka yang dimasukkan lebih dari 5");
        }
    }
    
}
