/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220092_responsi_pbo;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class membaca_data_buku extends AbstractTableModel {
    List<data_perpustakaan>dp;
    public membaca_data_buku(List<data_perpustakaan>dp){
     this.dp=dp;
    }
    
    @Override
    public int getRowCount(){
        return dp.size();
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "namabuku";
            case 1:
                return "penulis";
            case 2:
                return "rating";
            case 3:
                return "hargapinjam";
            default :
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column){
        switch(column){
            case 0:
                return dp.get(row).getnamabuku();
            case 1:
                return dp.get(row).getpenulis();
            case 2:
                return dp.get(row).getrating();
            case 3:
                return dp.get(row).gethargapinjam();
            default:
                return null;
        }
    }
}