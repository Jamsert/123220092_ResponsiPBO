/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220092_responsi_pbo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Lab Informatika
 */
public class connector {
    static Connection connect;
    public static Connection connection(){
        if(connect == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("gym_db");
            data.setUser("root");
            data.setPassword("");
            try{
                connect = data.getConnection();
                System.out.println("Koneksi Berhasil");
            } catch (SQLException ex){
                ex.printStackTrace();
                System.out.println("Koneksi Gagal!");
            }
        }
        return connect;
    }
}