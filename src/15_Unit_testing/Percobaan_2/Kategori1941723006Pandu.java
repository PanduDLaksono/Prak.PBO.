
package js15_unittest.database;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author bonek
 */
public class Kategori1941723006Pandu {
    private int idkategori;
    private String nama;
    private String keterangan;
    
    public Kategori1941723006Pandu() {
    }
    
    public String toString(){
        return nama;
    }

    public Kategori1941723006Pandu(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1941723006Pandu getById(int id) {
        Kategori1941723006Pandu kat = new Kategori1941723006Pandu();
        ResultSet rs = DBHelper1941723006Pandu.selectQuery("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1941723006Pandu();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1941723006Pandu> getAll() {
        ArrayList<Kategori1941723006Pandu> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1941723006Pandu.selectQuery("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1941723006Pandu kat = new Kategori1941723006Pandu();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1941723006Pandu> search(String keyword) {
        ArrayList<Kategori1941723006Pandu> ListKategori = new ArrayList();

        String sql = "Select * from kategori where " + " nama like '%" + keyword + "%' " + " or keterangan like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1941723006Pandu.selectQuery(sql);

        try {
            while (rs.next()) {
                Kategori1941723006Pandu kat = new Kategori1941723006Pandu();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    //public String toString(){
     //   return nama;
   // }
    
    public void save() {
        if (getById(idkategori).getIdkategori() == 0) {
            String SQL = "Insert into kategori (nama,keterangan) values("
                    + " '" + this.nama + "', "
                    + " '" + this.keterangan + "' "
                    + " )";
            this.idkategori = DBHelper1941723006Pandu.insertQueryGetId(SQL);
        } else {
            String SQL = "Update kategori set"
                    + " nama = '" + this.nama + "', "
                    + " keterangan = '" + this.keterangan + "' "
                    + "Where idKategori = '" + this.idkategori + "'";
            DBHelper1941723006Pandu.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idKategori = '" + this.idkategori + "'";
        DBHelper1941723006Pandu.executeQuery(SQL);
    }
    
    public ArrayList<Kategori1941723006Pandu> getByNamaAndKeterangan(String nama, String keterangan) {
        ArrayList<Kategori1941723006Pandu> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1941723006Pandu.selectQuery("SELECT * FROM kategori Where nama = '" + nama + "' and keterangan = '" + keterangan + "'");
        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1941723006Pandu.selectQuery("SELECT * FROM kategori Where nama = '" + nama + "'");
        } else {
            rs = DBHelper1941723006Pandu.selectQuery("SELECT * FROM kategori Where keterangan = '" + keterangan + "'");
        }
        try {
            while (rs.next()) {
                Kategori1941723006Pandu kat = new Kategori1941723006Pandu();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
}