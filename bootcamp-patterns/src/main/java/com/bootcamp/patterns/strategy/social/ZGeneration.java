package com.bootcamp.patterns.strategy.social;

public class ZGeneration extends User {
    public ZGeneration(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}
