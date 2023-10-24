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
import java.util.Date;
public class Karyawan {
   
   String NIP;
   String Nama;
   String tgl_lahir;
   Date tgl_masuk;
   
   void AhmadRafliSalamudin(){
        NIP = "00001";
        Nama = "Ahmad Rafli Salamudin";
        tgl_lahir = "05/08/2000";
        tgl_masuk = new Date();
        System.out.println("NIP             : "+NIP);
        System.out.println("Nama            : "+Nama);
        System.out.println("Tanggal Lahir   : "+tgl_lahir);
        System.out.println("Tanggal Masuk   : "+tgl_masuk.toString());
    }
   void NaufalFakhrudin(){
        NIP = "00002";
        Nama = "Karyawan 2";
        tgl_lahir = "01/08/2001";
        tgl_masuk = new Date();
        System.out.println("NIP             : "+NIP);
        System.out.println("Nama            : "+Nama);
        System.out.println("Tanggal Lahir   : "+tgl_lahir);
        System.out.println("Tanggal Masuk   : "+tgl_masuk.toString());
    }
   
}
