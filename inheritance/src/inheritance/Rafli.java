/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author This-PC
 */
public class Rafli {
    public static void main(String[] args){
        //objek dari Karyawan_Teatp
        Karyawan_Tetap Rafli = new Karyawan_Tetap();
        //setter
        Rafli.setNama("Ahmad Rafli Salamudin");
        Rafli.setGajiBulanan(30000000);
        //getter Karyawan_Tetap
        System.out.println("Nama            : " + Rafli.getNama());
        System.out.println("Gaji Bulanan    : " + Rafli.getGajiBulanan());
        System.out.println();
        
     
        //void dari Karyawan
        Karyawan InfoKaryawan = new Karyawan();
        System.out.println("========== INFO KARYAWAN ==========");
        InfoKaryawan.AhmadRafliSalamudin();
        System.out.println();
        InfoKaryawan.NaufalFakhrudin();
        System.out.println();
    }
    
}
