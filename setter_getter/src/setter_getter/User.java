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
class User {
    private String nama;
    private String kelas;
    private int npm;

    // ini method setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void setNpm(int npm){
        this.npm = npm;
    }

    // ini method getter
    public String getNama(){
        return this.nama;
    }

    public String getKelas(){
        return this.kelas;
    }
    
    public int getNpm(){
        return this.npm;
    }
}