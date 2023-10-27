/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk menampilkan target saldo tabungan 
 */
public class TI_RegPagi_22205024_latihan20_target_saldo_tabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoawal;
        int bunga;
        int saldotarget;
        
        System.out.print("saldo awal:");
        saldoawal = scanner.nextInt();
        System.out.print("Bunga perbulan %:");
        bunga = scanner.nextInt();
        System.out.print("saldo target:");
        saldotarget = scanner.nextInt();
        
        int bulan = (saldotarget-saldoawal)/(saldoawal*bunga/100);
       
        
        for(int i = 1;i<= bulan;i++) {
            saldoawal = saldoawal + (saldoawal * bunga/100);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String formattedsaldoawal = decimalFormat.format(saldoawal);
            System.out.println("Saldo di bulan ke-"+i+"Rp"+ formattedsaldoawal);
        }
        
        
        
        
    }
}
