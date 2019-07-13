package com.bootcamp.testing.forum.statistics;

public class ForumStatistics {
    private int noOfUsers;
    private int noOfPosts;
    private int noOfComments;
    private double advNoOfPostsPerUser;
    private double advNoOfCommentsPerUser;
    private double advNoOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        noOfUsers = statistics.usersNames().size();
        noOfPosts = statistics.postsCount();
        noOfComments = statistics.commentsCount();
        advNoOfPostsPerUser = calculateAdvNoOfPostsPerUser();
        advNoOfCommentsPerUser = calculateAdvNoOfCommentsPerUser();
        advNoOfCommentsPerPost = calculateAdvNoOfCommentsPerPost();
    }

    private double calculateAdvNoOfPostsPerUser() {
        return noOfUsers > 0 ? (double) noOfPosts / noOfUsers : 0;
    }

    private double calculateAdvNoOfCommentsPerUser() {
        return noOfUsers > 0 ? (double) noOfComments / noOfUsers : 0;
    }

    private double calculateAdvNoOfCommentsPerPost() {
        return noOfPosts > 0 ? (double) noOfComments / noOfPosts : 0;
    }

    public void showStatistics() {
        System.out.println("Liczba użytkowników forum: " + noOfUsers);
        System.out.println("Liczba postów: " + noOfPosts);
        System.out.println("Liczba komentarzy: " + noOfComments);
        System.out.println("Średnia liczba postów na użytkownika: " + advNoOfPostsPerUser);
        System.out.println("Średnia liczba komentarzy na użytwkownika: " + advNoOfCommentsPerUser);
        System.out.println("Średnia liczba komentarzy na post: " + advNoOfCommentsPerPost);
    }

    public int getNoOfUsers() {
        return noOfUsers;
    }

    public int getNoOfPosts() {
        return noOfPosts;
    }

    public int getNoOfComments() {
        return noOfComments;
    }

    public double getAdvNoOfPostsPerUser() {
        return advNoOfPostsPerUser;
    }

    public double getAdvNoOfCommentsPerUser() {
        return advNoOfCommentsPerUser;
    }

    public double getAdvNoOfCommentsPerPost() {
        return advNoOfCommentsPerPost;
    }
}


