package com.landon.chat.model;

import java.util.Date;

public class ChatInMessage {

    private String senderId;
    private String senderName;
    private String message;
    private Date timestamp;


    public ChatInMessage(){

    }

    public ChatInMessage(String message){
        this.message = message;
    }

    public ChatInMessage(String senderId, String senderName, String message, Date timestamp) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
