/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setter_getter;

/**
 *
 * @author This-PC
 */
public class Rafli {
    public static void main(String[] args) {
        
    // membuat objek dari class User
    User rafli = new User();
    User naruto = new User();

    // menggunakan method setter
    rafli.setNama("Ahmad Rafli Salamudin");
    rafli.setKelas("SI 4A");
    rafli.setNpm(2019804265);
    
    naruto.setNama("Naruto Uzumaki");
    naruto.setKelas("Genin");
    naruto.setNpm(20071502);

    // menggunakan method getter
    System.out.println("Nama  : " + rafli.getNama());
    System.out.println("Kelas : " + rafli.getKelas());
    System.out.println("NPM   : " + rafli.getNpm());
 }
}