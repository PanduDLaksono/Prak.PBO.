/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.percobaan4;

/**
 *
 * @author bonek
 */
import java.util.ArrayList;
public class InputData1941723006Pandu {
    ArrayList<Mahasiswa1941723006Pandu> ListMahasiswa;

    public InputData1941723006Pandu() {
        ListMahasiswa = new ArrayList();
    }
    
    

    public void isiData1941723006Pandu(String mNim, String mNama, String mAlamat) {
        Mahasiswa1941723006Pandu mhs = new Mahasiswa1941723006Pandu(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa1941723006Pandu> getDataPandu() {
        return ListMahasiswa;
    }
}
