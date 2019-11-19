/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.percobaan2;

/**
 *
 * @author bonek
 */
import java.util.ArrayList;
import java.util.List;
public class CobaArrayList1941723006Pandu {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Jepang");
        mListCountry.add("Germany");
        System.out.println(mListCountry);
        System.out.format("List Index 0 = %s\n", mListCountry.get(0));
        System.out.format("List Index 2 = %s\n", mListCountry.get(2));
    }
}
