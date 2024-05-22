/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220092_responsi_pbo;
import java.util.List;
import model.*;
/**
 *
 * @author Lab Informatika
 */
public interface data_perpustakaanimplement {
    public void insert(data_perpustakaan p);
    public void tambah(data_perpustakaan p);
    public void ubah(data_perpustakaan p);
    public List<data_perpustakaan>getAll();
}
