/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrdsql;

/**
 *
 * @author This-PC
 */
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class HRDSQL {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/hrd";
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
            String sql="SELECT * FROM karyawan";
            rs=stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("ID Karyawan : "+rs.getInt("id_karyawan"));
                System.out.println("Nama Karyawan : "+rs.getString("nama"));
                System.out.println("Alamat Karyawan : "+rs.getString("alamat"));
                System.out.println();
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
