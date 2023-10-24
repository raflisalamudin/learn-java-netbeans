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
public class Karyawan {
 private int Nik;
 private String Nama;
 private String Alamat;
 private String NoHP;
 private int Gaji;

    public int getNik() {
        return Nik;
    }

    public void setNik(int Nik) {
        this.Nik = Nik;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public int getGaji() {
        return Gaji;
    }

    public void setGaji(int Gaji) {
        this.Gaji = Gaji;
    }
 
}
