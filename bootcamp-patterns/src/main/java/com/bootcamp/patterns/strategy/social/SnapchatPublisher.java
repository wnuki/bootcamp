package com.bootcamp.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "User publishes on Snapchat";
    }
}

