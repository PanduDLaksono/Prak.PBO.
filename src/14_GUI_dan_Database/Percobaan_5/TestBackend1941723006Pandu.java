
package frontend;
import backend.*;
/**
 *
 * @author bonek
 */
public class TestBackend1941723006Pandu {
    public static void main(String[] args) {
        Kategori1941723006Pandu kat1 = new Kategori1941723006Pandu("Novel", "Koleksi buku novel");
        Kategori1941723006Pandu kat2 = new Kategori1941723006Pandu("Referensi", "Buku referensi ilmiah");
        Kategori1941723006Pandu kat3 = new Kategori1941723006Pandu("Komik", "Komik anak-anak");
        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        // test delete
        kat3.delete();
        // test select all
        for(Kategori1941723006Pandu k : new Kategori1941723006Pandu().getAll())
        {
        System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        // test search
        for(Kategori1941723006Pandu k : new Kategori1941723006Pandu().search("Komik"))
        {
        System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
    

