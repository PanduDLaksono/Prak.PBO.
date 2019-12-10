/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js15_unittest.database;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bonek
 */
public class Anggota1941723006PanduTest {
    
    public Anggota1941723006PanduTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetIdAnggota() {
        System.out.println("getIdAnggota");
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        int expResult = 0;
        int result = instance.getIdAnggota();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdAnggota() {
        System.out.println("setIdAnggota");
        int idAnggota = 0;
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        instance.setIdAnggota(idAnggota);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        String expResult = "";
        String result = instance.getNama();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "";
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        instance.setNama(nama);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAlamat() {
        System.out.println("getAlamat");
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        String expResult = "";
        String result = instance.getAlamat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAlamat() {
        System.out.println("setAlamat");
        String alamat = "";
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        instance.setAlamat(alamat);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTelepon() {
        System.out.println("getTelepon");
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        String expResult = "";
        String result = instance.getTelepon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTelepon() {
        System.out.println("setTelepon");
        String telepon = "";
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        instance.setTelepon(telepon);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        Anggota1941723006Pandu expResult = null;
        Anggota1941723006Pandu result = instance.getById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        ArrayList<Anggota1941723006Pandu> expResult = null;
        ArrayList<Anggota1941723006Pandu> result = instance.getAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "";
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        ArrayList<Anggota1941723006Pandu> expResult = null;
        ArrayList<Anggota1941723006Pandu> result = instance.search(keyword);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSave() {
        System.out.println("save");
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        instance.save();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Anggota1941723006Pandu instance = new Anggota1941723006Pandu();
        instance.delete();
        fail("The test case is a prototype.");
    }
    
}
