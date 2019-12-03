/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author bonek
 */
public class Buku1941723006Pandu {

    private int idBuku;
    private Kategori1941723006Pandu kategori = new Kategori1941723006Pandu();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Kategori1941723006Pandu getKategori() {
        return kategori;
    }

    public void setKategori(Kategori1941723006Pandu kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Buku1941723006Pandu() {
    }

    public Buku1941723006Pandu(Kategori1941723006Pandu kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public Buku1941723006Pandu getById(int id) {
        Buku1941723006Pandu buku = new Buku1941723006Pandu();
        ResultSet rs = DBHelper1941723006Pandu.selectQuery("SELECT "
                + "    b.idBuku as idBuku, "
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit, "
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan"
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "    where b.idBuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1941723006Pandu();
                buku.setIdBuku(rs.getInt("idBuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1941723006Pandu> getAll() {
        ArrayList<Buku1941723006Pandu> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1941723006Pandu.selectQuery("SELECT "
                + "    b.idBuku as idBuku, "
                + "    b.judul as judul, "
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try{
            while(rs.next()){
                Buku1941723006Pandu buku = new Buku1941723006Pandu();
                buku.setIdBuku(rs.getInt("idBuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    
    public ArrayList<Buku1941723006Pandu> search(String keyword){
        ArrayList<Buku1941723006Pandu> ListBuku = new ArrayList();
        
        ResultSet rs = DBHelper1941723006Pandu.selectQuery("Select "
                + "    b.idBuku as idbuku,"
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis,"
                + "    k.idkategori as idkategori,"
                + "    k.nama as nama,"
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    left join kategori k on b.idkategori = k.idkategori "
                + "    where b.judul like '%"+keyword+"%' "
                + "    OR b.penerbit like '%"+keyword+"%' "
                + "    OR b.penulis LIKE '%"+keyword+"%' ");
        try{
            while(rs.next()){
                Buku1941723006Pandu buku = new Buku1941723006Pandu();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenerbit(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void save(){
        if(getById(idBuku).getIdBuku() == 0){
            String SQL = "INSERT INTO buku (idkategori, judul,penulis, penerbit) VALUES("
                    + " '"+this.getKategori().getIdkategori()+"', "
                    + " '"+this.judul+"', "
                    + " '"+this.penulis+"', "
                    + " '"+this.penerbit+"' "
                    + " )";
            this.idBuku = DBHelper1941723006Pandu.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE buku set "
                    + " idkategori = '"+this.getKategori().getIdkategori()+"', "
                    + " judul = '"+this.judul+"', "
                    + " penulis = '"+this.penulis+"', "
                    + " penerbit = '"+this.penerbit+"' "
                    + " WHERE idBuku = '"+this.idBuku+"'";
            DBHelper1941723006Pandu.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM buku where idBuku = '"+this.idBuku+"'";
        DBHelper1941723006Pandu.executeQuery(SQL);
    }
}
