/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js15_unittest;

/**
 *
 * @author bonek
 */
public class MessageProcessor1941723006Pandu {
    private String mSender, mRecipient, mMessage;

    public String getSenderPandu() {
        return mSender;
    }

    public void setSenderPandu(String mSender) {
        this.mSender = mSender;
    }

    public String getRecipientPandu() {
        return mRecipient;
    }

    public void setRecipientPandu(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public String getMessagePandu() {
        return mMessage;
    }

    public void setMessagePandu(String mMessage) {
        this.mMessage = mMessage;
    }
    
    public String messageFormatPandu(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessagePandu(){
        System.out.println(messageFormatPandu());
    }
}