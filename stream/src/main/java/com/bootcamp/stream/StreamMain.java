package com.bootcamp.stream;

import com.bootcamp.stream.forumUser.Forum;
import com.bootcamp.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.forumUsers();

        Map<Integer, ForumUser> usersMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(1999, 1, 1)))
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(f -> f.getUserId(), f -> f));

        usersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
