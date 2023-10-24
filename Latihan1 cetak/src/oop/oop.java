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
public class oop {
 
    public static void main(String[] args){
        
        user karyawan = new user("admin","123");
        
        System.out.println("username : " + karyawan.username);
        System.out.println("password : " + karyawan.password);
        
        System.out.println();
                
        hewan kucing = new hewan ("kucing", 4);
        kucing.info();
    }
}
