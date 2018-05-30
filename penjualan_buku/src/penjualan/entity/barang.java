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
public class barang {
    private String kodeBarang;
    private String namaBarang;
    private int jumlah;
    private double harga;
    String jml = String.valueOf(jumlah);
    String hrg = String.valueOf(harga);
    
    public String getkodeBarang(){
        return kodeBarang;
    }
    
    public void setkodeBarang(String kode_barang){
        this.kodeBarang = kode_barang;
    }
    
    public String getNamaBarang(){
        return namaBarang;
    }
    
    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    
    public String getJumlah(){
        return jml;
    }
    
    public void setJumlah(String jml){
        this.jml = jml;
    }
    
    public String getHarga(){
        return hrg;
    }
    
    public void setHarga(String hrg){
        this.hrg = hrg;
    }
}
