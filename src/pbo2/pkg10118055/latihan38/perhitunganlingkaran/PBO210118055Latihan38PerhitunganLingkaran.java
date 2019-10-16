/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("======Perhitungan Lingkaran======");
       Scanner userInput = new Scanner (System.in);
       diameter nilai = new diameter();
       
       do{
       System.out.print("Masukkan nilai diameter lingkran:");
       nilai .di = userInput.nextDouble();
       System.out.println("=====hasil perhitungan lingkaran=====");
        System.out.println("jari jari lingkaran:"+nilai.jari());
       System.out.println("luas lingkaran"+nilai.luas());
       System.out.println("keliling lingkaran"+nilai.keliling());
    
       }while(!userInput.hasNextInt());
    }
    
}
