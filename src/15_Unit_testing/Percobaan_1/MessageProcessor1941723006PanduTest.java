/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js15_unittest;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author bonek
 */

public class MessageProcessor1941723006PanduTest {
    MessageProcessor1941723006Pandu mProcessor;

    public MessageProcessor1941723006PanduTest() {
        mProcessor = new MessageProcessor1941723006Pandu();
        mProcessor.setSenderPandu("Messi");
        mProcessor.setRecipientPandu("Suarez");
        mProcessor.setMessagePandu("Wanna play football?");
    }
    
    @Test
    public void testShowMessagePandu(){
        String exceptedResult = "Hai Suarez, you have message from Messi.\nThe message as follows : Wanna play football?";
        Assert.assertEquals(exceptedResult, mProcessor.messageFormatPandu());
    }
}
