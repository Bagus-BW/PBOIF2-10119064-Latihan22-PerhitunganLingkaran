/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan22.perhitunganlingkaran;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menghitung suatu lingkaran 
 * (jari-jari, luas, dan keliling)
 */
public class PBOIF210119064Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    
    public static double hitungJariJari(double diameter){
        double jariJari = diameter/2;
        return jariJari;
    }
    
    public static double hitungLuas(double diameter){
        double jariJari = hitungJariJari(diameter);
        double luas = 3.14 * jariJari * jariJari;
        return luas;
    }
    
    public static double hitungKeliling(double diameter){
        double jariJari = hitungJariJari(diameter);
        double keliling = 2 * 3.14 * jariJari;
        return keliling;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double diameter = 0;
        String filterAngka;
        boolean kondisi = true;
                
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=======Perhitungan Lingkaran=======");
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            filterAngka = keyboard.nextLine();
            if(filterAngka.matches("[0-9]*")){
                diameter = Integer.parseInt(filterAngka);
                kondisi = true;
            }else{
                System.out.println("Nilai Diameter Tidak Sesuai!");
                System.out.println("");
                kondisi = false;
            }
        } while (!kondisi);
        
        System.out.println("");
        System.out.println("=======Hasil Perhitungan Lingkaran=======");
        System.out.println("Jari - Jari Lingkaran   = " + hitungJariJari(diameter) + " cm");
        System.out.println("Luas Lingkaran          = " + hitungLuas(diameter) + " cm");
        System.out.println("Keliling Lingkaran      = " + hitungKeliling(diameter) + " cm");
        
    }
    
}
