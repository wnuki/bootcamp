package com.bootcamp.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public void forumUsers() {
        forumUsers.add(new ForumUser(1, "firstUser", 'k', 1992, 12, 12, 1234));
        forumUsers.add(new ForumUser(2, "secondUser", 'k', 1988, 7, 12, 23));
        forumUsers.add(new ForumUser(3, "thirdUser", 'm', 1982, 12, 3, 234));
        forumUsers.add(new ForumUser(4, "fourthUser", 'k', 1990, 4, 25, 2345));
        forumUsers.add(new ForumUser(5, "fifthUser", 'm', 2002, 7, 9, 0));
        forumUsers.add(new ForumUser(6, "sixthUser", 'm', 1975, 12, 30, 763));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
