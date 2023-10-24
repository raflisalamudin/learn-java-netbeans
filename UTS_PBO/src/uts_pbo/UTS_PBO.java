/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pbo;

/**
 *
 * @author This-PC
 */
public class UTS_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // object
           classrafli data = new classrafli();
        // method
                data.nama = "Ahmad Rafli Salamudin";
                data.npm = "2019804265";
                data.kelas = "SI 4A";
        System.out.println("Nama: " + data.nama);
        System.out.println("NPM : " + data.npm);
        System.out.println("NPM : " + data.kelas);
        
        System.out.println();
        
        for(int i = 100; i <=200 ; i++){
            System.out.println(i);
        }
    }
}