package com.bootcamp.patterns.strategy.social;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        // Given
        User user1 = new Millenials("user1");
        User user2 = new ZGeneration("user2");
        User user3 = new YGeneration("user3");

        // When
        String user1SocialPredictor = user1.socialPublisher.share();
        String user2SocialPredictor = user2.socialPublisher.share();
        String user3SocialPredictor = user3.socialPublisher.share();

        // Then
        assertEquals("User publishes on Facebook", user1SocialPredictor);
        assertEquals("User publishes on Twitter", user2SocialPredictor);
        assertEquals("User publishes on Snapchat", user3SocialPredictor);
    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given
        User user1 = new Millenials("user1");
        User user2 = new YGeneration("user2");
        User user3 = new ZGeneration("user3");
        user1.setSocialPublisher(new TwitterPublisher());
        user2.setSocialPublisher(new SnapchatPublisher());
        user3.setSocialPublisher(new FacebookPublisher());

        // When
        String user1SocialPredictor = user1.socialPublisher.share();
        String user2SocialPredictor = user2.socialPublisher.share();
        String user3SocialPredictor = user3.socialPublisher.share();

        // Then
        assertEquals("User publishes on Twitter", user1SocialPredictor);
        assertEquals("User publishes on Snapchat", user2SocialPredictor);
        assertEquals("User publishes on Facebook", user3SocialPredictor);
    }
}