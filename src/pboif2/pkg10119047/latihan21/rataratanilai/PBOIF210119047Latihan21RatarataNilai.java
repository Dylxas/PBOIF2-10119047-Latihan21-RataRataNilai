/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan21.rataratanilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENGHITUNG RATA RATA NILAI
 */

public class PBOIF210119047Latihan21RatarataNilai {

    /**
     * @param args the command line arguments
     */
    //rumus rata rata
    public static double rata2Nilai(int banyakMhs, double jumlahNilai){
        double average = jumlahNilai / banyakMhs;
        return average;
    }
    //utama
    public static void main(String[] args) {
        // TODO code application logic here
        int banyakMhs;
        double nilai;
        double jumlahNilai=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya mahasiswa : ");
        banyakMhs = input.nextInt();
        for (int i = 1; i <= banyakMhs; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = input.nextDouble();
            jumlahNilai += nilai;
        }      
        
        System.out.println("");
        System.out.println("Maka, Rata-Rata Nilainya adalah " + rata2Nilai(banyakMhs,jumlahNilai));
        System.out.println("Developed by Aldy Putra Hanggara (Dylxas)");
    }
    
}
