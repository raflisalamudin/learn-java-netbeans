/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author This-PC
 */
public class hewan {
    
    String namahewan;
    int jmlkaki;
    
    public hewan(String namahewan,  int jmlkaki){
        this.namahewan = namahewan;
        this.jmlkaki = jmlkaki;
    }
    
    public void info(){
        System.out.println("nama hewan " + this.namahewan);
        System.out.println("jumlah kaki " + this.jmlkaki);
    }
}