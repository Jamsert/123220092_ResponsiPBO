/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220092_responsi_pbo;
package DAOdata_perpustakaan;
import java.sql;
import java.util.;
import koneksi.connector;
import model.*;
import data_perpustakaanimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lab Informatika
 */
public class DAOdata_perpustakaan {
    connector connection;

    final String select = "SELECT * FROM perpustakaan;";
    final String insert = "INSERT INTO perpustakaan(namabuku, penulis, rating, hargapinjam)VALUES(?,?,?,?,?);";
    final String add = "TAMBAH perpustakaan set penulis=?, rating=?, hargapinjam=? WHERE namabuku=?;";
    final String update = "UBAH perpustakaan set penulis=?, rating=?, hargapinjam=? WHERE namabuku=?;";
    final String delete = "DELETE FROM 'perpustakaan' WHERE namabuku=?";
    
    public DAOdata_perpustakaan(){
        connection=connector.connection();
            }
    
    @Override
    public void insert(data_perpustakaan p){
        PreparedStatement statement=null;
        try{
            statement=connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getnamabuku());
            statement.setDouble(2, p.getpenulis());
            statement.setDouble(3, p.getrating());
            statement.setDouble(4, p.gethargapinjam());
            statement.executeinsert();
            ResultSet rs=statement.getGeneratedKeys();
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();;
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void add(data_perpustakaan p){
        PreparedStatement statement=null;
        try{
            statement=connection.prepareStatement(add);
            statement.setString(1, p.getnamabuku());
            statement.setDouble(2, p.getpenulis());
            statement.setDouble(3, p.getrating());
            statement.setDouble(4, p.gethargapinjam());
            statement.executeadd();
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();;
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void update(data_perpustakaan p){
        PreparedStatement statement=null;
        try{
            statement=connection.prepareStatement(update);
            statement.setString(1, p.getnamabuku());
            statement.setDouble(2, p.getpenulis());
            statement.setDouble(3, p.getrating());
            statement.setDouble(4, p.gethargapinjam());
            statement.executeupdate();
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();;
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void delete(data_perpustakaan p){
        PreparedStatement statement=null;
        try{
            statement=connection.prepareStatement(delete);
            statement.setString(1, p.getnamabuku());
            statement.executeupdate();
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();;
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<data_perpustakaan>getAll(){
        List<data_perpustakaan>dp=null;
        try{
            dp=newArraylist<data_perpustakaan();
            statement st=connection.createStatement();
            ResultSet rs=st.executeQuery(select);
            while(rs.next()){
                data_perpustakaan perpustakaan = new data_perpustakaan();
                perpustakaan.setnamabuku(rs.getString("namabuku"));
                perpustakaan.setpenulis(rs.getDouble("penulis"));
                perpustakaan.setrating(rs.getDouble("rating"));
                perpustakaan.sethargapinjam(rs.getDouble("hargapinjam"));
                dp.add(perpustakaan);
            }
        }catch(SQLException ex){
    
    Logger.getLogger(DAOdata_perpustakaan.class.getName()).log(Level.SEVERE,null,ex);
    }
    return dp;
    }
}
