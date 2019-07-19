package com.bootcamp.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {

        return "User publishes on Facebook";
    }
}
