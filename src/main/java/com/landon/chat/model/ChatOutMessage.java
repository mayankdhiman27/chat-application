package com.landon.chat.model;

import java.util.Date;

public class ChatOutMessage {

    private String content;
    private String groupName;
    private Date timestamp;

    public ChatOutMessage(){

    }

    public ChatOutMessage(String message) {
        this.content = message;
    }

    public ChatOutMessage(String content, String groupName, Date timestamp) {
        this.content = content;
        this.groupName = groupName;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
