/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_si;

/**
 *
 * @author This-PC
 */
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DB_SI {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/db_si";
    static final String USER = "root";
    static final String PASS = "";
    /**
     * @param args the command line arguments
     */
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName(JDBC_DRIVER);
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt=conn.createStatement();
            String sql="SELECT * FROM mahasiswa";
            rs=stmt.executeQuery(sql);
            
            System.out.println("Data Kelompok 1 PBO. Materi query sql");
            System.out.println("----------------------------------------");
            System.out.println();
            while(rs.next()){           
                System.out.println("No Urut\t\t: "+rs.getInt("id_mahasiswa"));
                System.out.println("NIM\t\t: "+rs.getInt("nim"));
                System.out.println("Nama\t\t: "+rs.getString("nama"));
                System.out.println("Alamat\t\t: "+rs.getString("alamat"));
                System.out.println("Jenis Kelamin\t: "+rs.getString("jeniskelamin"));
                System.out.println();
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
