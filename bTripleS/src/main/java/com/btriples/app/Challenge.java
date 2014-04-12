package com.btriples.app;

import java.util.UUID;

/**
 * Created by shuxu on 4/12/14.
 */
public class Challenge {

    private UUID id;
    private String sender;
    private String receiver;
    private String word;
    private boolean finished;

    public Challenge() {
        id = UUID.randomUUID();
        finished = false;

    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public UUID getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getWord() {
        return word;
    }

    public boolean isFinished() {
        return finished;
    }

}
