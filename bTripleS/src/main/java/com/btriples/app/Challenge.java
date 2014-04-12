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
}
