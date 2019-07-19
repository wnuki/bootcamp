package com.bootcamp.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "User publishes on Twitter";
    }
}

