package com.bootcamp.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private int userId;
    private String username;
    private char sex;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int userId, String username, char sex, int year, int month, int day, int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
