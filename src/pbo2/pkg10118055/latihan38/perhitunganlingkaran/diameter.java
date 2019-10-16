/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan38.perhitunganlingkaran;

/**
 *
 * @author User
 */
public class diameter {
    public final double  phi= 3.14;
      public  double di ;
      
    
     public double keliling() {
     return 2*phi*jari();
}
       public double jari(){
           return ( di/2);
       }
      public int luas(){
          return (int) (phi*jari()*jari());
      }
      
}
