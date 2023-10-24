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
public class gatotkaca extends superhero {
    void terbang() {
        System.out.println("Gatotkaca Terbang");
    }
    public static void main(String[] args){
        gatotkaca rafli = new gatotkaca();
        rafli.tampilprofil();
        rafli.terbang();
    }
}
