/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220092_responsi_pbo;
import javax.swing.JTable;
import controller.data_perpustakaancontroller;
import javax.swing.JTextField;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab Informatika
 */
public class perpustakaan {
    data_perpustakaancontroller dc;
    public MainView(){
        initComponents();
        dc=new data_perpustakaancontroller(this);
        dc.isitabel();
    }
    
    private void
            tabelData_perpustakaanMouseClicked(java.awt.event.MouseEvent evt){
                int baris = tabelData_perpustakaan.getSelectedRow();
                
                jtxtnamabuku.setText(tabelData_perpustakaan.getValueAt(baris, 0).toString());
                jtxtpenulis.setText(tabelData_perpustakaan.getValueAt(baris, 1).toString());
                jtxtrating.setText(tabelData_perpustakaan.getValueAt(baris, 2).toString());
                jtxthargapinjam.setText(tabelData_perpustakaan.getValueAt(baris, 3).toString());
            }
            
    private void
            deleteActionPerformed(java.awt.event.ActionEvent evt){
                try{
                    mc.delete();
                    JOptionPane.showMessageDialog(this,"Data Perpustakaan Dihapus");
                }catch(RuntimeException e){
                    JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
                }finally{
                    mc.isitabel();
                }
            }
    private void
            clearActionPerformed(java.awt.event.ActionEvent evt){
                namabuku.setText("");
                penulis.setText("");
                rating.setText("");
                hargapinjam.setText("");
            }
    private void
            btnUpdateActionPerformed(java.awt.event.ActionEvent evt){
                dc.update();
                dc.isitabel();
            }
}