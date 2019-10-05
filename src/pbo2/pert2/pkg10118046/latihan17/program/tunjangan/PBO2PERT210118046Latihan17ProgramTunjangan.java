/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan17.program.tunjangan;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung tunjangan dan gaji total dari gaji pokok yang di input
 */
public class PBO2PERT210118046Latihan17ProgramTunjangan {

    /**
     * @param perbulan
     * @param status
     * @return 
     */
    
    public static float hitungTunjangan (float perbulan, String status)
    {
        status = status.toLowerCase();
        float hasil;
        if (status.equals("menikah")) hasil = (float) (perbulan * 0.35);
        else hasil = 0;
        return hasil;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===================PROGRAM TUNJANGAN===================");
        System.out.print("Berapa Gaji Pokok Anda perbulan?: Rp. ");
        Scanner scanner = new Scanner(System.in);
        float perbulan = scanner.nextFloat();
        System.out.print("Status Anda? (Menikah/Belum)?\t: ");
        String status = scanner.next();
        
        float tunjangan = hitungTunjangan(perbulan, status);
        float gajiTotal = tunjangan + perbulan;
        System.out.println("===================HASIL PERHITUNGAN GAJI ANDA===================");
        System.out.println("Gaji Pokok\t\t: " + perbulan);
        System.out.println("Tunjangan\t\t: " + tunjangan);
        System.out.println("Gaji Total\t\t: " + gajiTotal);
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
