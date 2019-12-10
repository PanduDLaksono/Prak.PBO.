/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js15_unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author bonek
 */
public class Kategori1941723006PanduTest extends TestCase{
    Kategori1941723006Pandu instance;
    
    public Kategori1941723006PanduTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Kategori1941723006Pandu("Comics", "Kompinasi tulisan dan gambar");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
    System.out.format("Finish Test : %s \n", this.getName());
    }

   

    @Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "Comics";
        ArrayList<Kategori1941723006Pandu> expResult = instance.getByNamaAndKeterangan(keyword, "");
        ArrayList<Kategori1941723006Pandu> result = instance.search(keyword);
        assertEquals(expResult.size(), result.size());
    }


    @Test
    public void testSave() {
        System.out.println("save");
        this.instance.save();
        ArrayList<Kategori1941723006Pandu> expResult = instance.getByNamaAndKeterangan(instance.getNama(), instance.getKeterangan());
        assertTrue(expResult.size()>0);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Kategori1941723006Pandu instance = new Kategori1941723006Pandu();
        instance.delete();
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Kategori1941723006Pandu instance = new Kategori1941723006Pandu();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}