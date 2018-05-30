/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;
import penjualan.entity.barang;
import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.interfc.barangInterfc;
/**
 * 985
 * @author irfan
 */
public class barangImplement implements barangInterfc {

    //Untuk melakukan select / view dari tabel barang pada database ke form
    @Override
    public List<barang> getAll() throws SQLException {
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM barang");
        List<barang>list = new ArrayList<>();
        while(rs.next()){
            barang brg = new barang();
            brg.setkodeBarang(rs.getString("kode_barang"));
            brg.setNamaBarang(rs.getString("nama_barang"));
            brg.setJumlah(rs.getString("jumlah"));
            brg.setHarga(rs.getString("harga"));
            list.add(brg);
        }
        return list;
    }

    @Override
    public barang insert(barang o) throws SQLException {
        PreparedStatement
                st = koneksi.getConnection().prepareStatement("INSERT INTO barang VALUES(?,?,?,?)");
        st.setString(1, o.getkodeBarang());
        st.setString(2, o.getNamaBarang());
        st.setString(3, o.getJumlah()+ " ");
        st.setString(4, o.getHarga()+ " ");
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(barang o) throws SQLException {
        PreparedStatement
                st = koneksi.getConnection().prepareStatement("UPDATE barang SET nama_barang=?,jumlah=?,harga=? WHERE kode_barang=?");
        st.setString(1, o.getNamaBarang());
        st.setString(2, o.getJumlah());
        st.setString(3, o.getHarga());
        st.setString(4, o.getkodeBarang());
        st.executeUpdate();
    }
    
    @Override
    public void delete(String kodeBarang) throws SQLException {
        PreparedStatement
                st = koneksi.getConnection().prepareStatement("DELETE FROM barang WHERE kode_barang=?");
        st.setString(1, kodeBarang);
        st.executeUpdate();
    }
}