package com.driver;

import java.util.Date;

public class Message {
    private static int id=0;
    private String content;
    private Date timestamp;

    public Message(){}
    public Message(String content){
        id = id+1;
        this.content = content;
        this.timestamp = new Date();
    }

    public int getId(){
        return id;
    }

    public Date getTimestamp(){
        return timestamp;
    }

    public String getContent(){
        return content;
    }


}
