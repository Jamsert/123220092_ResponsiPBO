/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220092_responsi_pbo;

/**
 *
 * @author Lab Informatika
 */
public class data_perpustakaan {
    private String namabuku;
    private Double penulis;
    private Double rating;
    private Double hargapinjam;
    
    public String getnamabuku(){
        return namabuku;
    }
    
    public void setnama_buku(String nama_buku){
        this.namabuku=namabuku;
    }
    
    public Double getpenulis(){
        return penulis;
    }
    
    public void setpenulis(Double penulis){
        this.penulis=penulis;
    }
    
    public Double getrating(){
        return rating;
    }
    
    public void setrating(Double rating){
        this.rating=rating;
    }
    
    public Double gethargapinjam(){
        return hargapinjam;
    }
    
    public void sethargapinjam(Double hargapinjam){
        this.hargapinjam=hargapinjam;
    }
 }