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
public class Karyawan_Tetap extends Karyawan {
    
    private String Nama;
    private int GajiBulanan;
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setGajiBulanan(int GajiBulanan){
        this.GajiBulanan = GajiBulanan;
    }
    
    public int getGajiBulanan(){
        return this.GajiBulanan;
    }
    
    public String getNama(){
        return this.Nama;
    }
}
