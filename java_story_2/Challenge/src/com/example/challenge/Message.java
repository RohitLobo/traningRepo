package com.example.challenge;

import java.util.UUID;

public class Message {
        UUID id;
        static String sender = "Rohit";
        String receiver;
        String message;


    public Message(UUID id, String receiver, String message) {
        this.id = id;
        this.receiver = receiver;
        this.message = message;
    }

    public String getMessageDetails(){
            return ("Id: " + getId() +"\n"+
                    "sent : " + getSender() + "\n" +
                    " received : " + getReceiver() + "\n" +
                    "message :" + getMessage());

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public static String getSender() {
        return sender;
    }

    public static void setSender(String sender) {
        Message.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
