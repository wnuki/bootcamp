package com.bootcamp.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private ForumStatistics statistics = new ForumStatistics();
    private Statistics mockStatistics= mock(Statistics.class);
    private List<String> mockList = new ArrayList<>();

    @Test
    public void testZeroPosts() {
        //Given
        when(mockStatistics.postsCount()).thenReturn(0);
        when(mockStatistics.commentsCount()).thenReturn(0);
        when(mockStatistics.usersNames()).thenReturn(mockList);

        //When
        statistics.calculateAdvStatistics(mockStatistics);

        //Then
        assertEquals(0, statistics.getNoOfComments());
        assertEquals(0, statistics.getNoOfPosts());
        assertEquals(0, statistics.getNoOfUsers());
    }

    @Test
    public void test1000Posts() {
        // Given
        for (int i = 0; i < 10; i++) {
            mockList.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(mockList);
        when(mockStatistics.postsCount()).thenReturn(1000);
        when(mockStatistics.commentsCount()).thenReturn(5000);

        // When
        statistics.calculateAdvStatistics(mockStatistics);

        // Then
        assertEquals(1000, statistics.getNoOfPosts(), 0);
        assertEquals(5, statistics.getAdvNoOfCommentsPerPost(), 0);
        assertEquals(100, statistics.getAdvNoOfPostsPerUser(), 0);
        assertEquals(500, statistics.getAdvNoOfCommentsPerUser(), 0);
    }

    @Test
    public void test0Comments() {
        // Given
        for (int i = 0; i < 10; i++) {
            mockList.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(mockList);
        when(mockStatistics.postsCount()).thenReturn(1000);
        when(mockStatistics.commentsCount()).thenReturn(0);

        // When
        statistics.calculateAdvStatistics(mockStatistics);

        // Then
        assertEquals(1000, statistics.getNoOfPosts(), 0);
        assertEquals(0, statistics.getAdvNoOfCommentsPerPost(), 0);
        assertEquals(100, statistics.getAdvNoOfPostsPerUser(), 0);
        assertEquals(0, statistics.getAdvNoOfCommentsPerUser(), 0);
    }

    @Test
    public void testCommentsLessThanPosts() {
        // Given
        for (int i = 0; i < 10; i++) {
            mockList.add("User");
        }

        when(mockStatistics.usersNames()).thenReturn(mockList);
        when(mockStatistics.postsCount()).thenReturn(1000);
        when(mockStatistics.commentsCount()).thenReturn(100);

        // When
        statistics.calculateAdvStatistics(mockStatistics);

        // Then
        assertEquals(1000, statistics.getNoOfPosts(), 0);
        assertEquals(0.1, statistics.getAdvNoOfCommentsPerPost(), 0);
        assertEquals(100, statistics.getAdvNoOfPostsPerUser(), 0);
        assertEquals(10, statistics.getAdvNoOfCommentsPerUser(), 0);
    }

    @Test
    public void testCommentsMoreThanPosts() {
        // Given
        for (int i = 0; i < 10; i++) {
            mockList.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(mockList);
        when(mockStatistics.postsCount()).thenReturn(1000);
        when(mockStatistics.commentsCount()).thenReturn(4000);

        // When
        statistics.calculateAdvStatistics(mockStatistics);

        // Then
        assertEquals(1000, statistics.getNoOfPosts(), 0);
        assertEquals(4, statistics.getAdvNoOfCommentsPerPost(), 0);
        assertEquals(100, statistics.getAdvNoOfPostsPerUser(), 0);
        assertEquals(400, statistics.getAdvNoOfCommentsPerUser(), 0);
    }

    @Test
    public void testOUsers() {
        // Given
        when(mockStatistics.usersNames()).thenReturn(mockList);
        when(mockStatistics.postsCount()).thenReturn(1000);
        when(mockStatistics.commentsCount()).thenReturn(4000);

        // When
        statistics.calculateAdvStatistics(mockStatistics);

        // Then
        assertEquals(1000, statistics.getNoOfPosts(), 0);
        assertEquals(4, statistics.getAdvNoOfCommentsPerPost(), 0);
        assertEquals(0, statistics.getAdvNoOfPostsPerUser(), 0);
        assertEquals(0, statistics.getAdvNoOfCommentsPerUser(), 0);
    }

    @Test
    public void test100Users() {
        // Given
        for (int i = 0; i < 100; i++) {
            mockList.add("User");
        }
        when(mockStatistics.usersNames()).thenReturn(mockList);
        when(mockStatistics.postsCount()).thenReturn(1000);
        when(mockStatistics.commentsCount()).thenReturn(4000);

        // When
        statistics.calculateAdvStatistics(mockStatistics);

        // Then
        assertEquals(1000, statistics.getNoOfPosts(), 0);
        assertEquals(4, statistics.getAdvNoOfCommentsPerPost(), 0);
        assertEquals(10, statistics.getAdvNoOfPostsPerUser(), 0);
        assertEquals(40, statistics.getAdvNoOfCommentsPerUser(), 0);
    }

}
