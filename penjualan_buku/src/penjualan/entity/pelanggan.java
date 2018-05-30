/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.entity;

/**
 * 985
 * @author
 */
public class pelanggan {
    private String kodePelanggan;
    private String namaPelanggan;
    private String jenisKelamin;
    private String Alamat;
    private String Telp;
    
    public String getkodePelanggan(){
        return kodePelanggan;
    }
    
    public void setkodePelanggan(String kodePelanggan){
        this.kodePelanggan = kodePelanggan;
    }
    
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
    
    public void setNamaPelanggan(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }
    
    public String getjenisKelamin(){
        return jenisKelamin;
    }
    
    public void setjenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public String getTelp(){
        return Telp;
    }
    
    public void setTelp(String Telp){
        this.Telp = Telp;
    }
}
