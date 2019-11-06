package com.mycompany.mahasiswa;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 102;
        mhs2.nama = "Monika";
        mhs2.alamat = "Dinoyo";
        mhs2.kelas = "1F";
        mhs2.tampilBiodata();                          
        
        mhs3.nim = 103;
        mhs3.nama = "Bambang";
        mhs3.alamat = "Jl. Veteran No 17";
        mhs3.kelas = "1C";
        mhs3.tampilBiodata();                          
    }
}
