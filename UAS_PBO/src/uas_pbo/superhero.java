/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo;

/**
 *
 * @author This-PC
 */
public class superhero {
    int kodeplayer;
    String namaplayer;
    int nyawa;
    int power;
    int score;
    
    void tampilprofil() {
        kodeplayer = 2019804265;
        namaplayer = "Ahmad Rafli Salamudin";
        nyawa = 100;
        power = 100;
        score = 0;
        
        System.out.println("Kode Player : "+kodeplayer);
        System.out.println("Nama Player : "+namaplayer);
        System.out.println("Nyawa : "+nyawa);
        System.out.println("Power : "+power);
        System.out.println("Score : "+score);
    }
    
    void menyerang() {
        System.out.println("Serang!");
    }
}


