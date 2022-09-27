/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

/**
 *
 * @author ASUS
 */
public class loopBentuk1 {
    public static void main(String[] args) {
        int baris = 8;
        int n = 5;
        
        for (int i = 0; i < baris+1; i++) {
//            for (int j = 0; j < baris-i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i+1; j++) {
//                if (j < n) {
//                    System.out.print(j+1 + " ");
//                }
//            }
            
            for (int j = baris-i+1; j >= baris-i; j--) {
                if (j <= n) {
                    System.out.print(j + " ");
                } else {
                    if (i == baris && j == baris) {
                        System.out.print("hehe");
                    } else{
                        System.out.print("//");
                    }
                }
            }
            
            
            System.out.println("");
        }
    }
}
