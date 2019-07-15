package com.bootcamp.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ForumUser {
    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        ForumPost forumPost = new ForumPost(postBody, author);
        posts.add(forumPost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment forumComment = new ForumComment(thePost, commentBody, author);
        comments.add(forumComment);
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {
        return Optional.ofNullable(posts.get(postNumber)).orElse(null);
    }

    public ForumComment getComment(int commentNumber) {
        return Optional.ofNullable(comments.get(commentNumber)).orElse(null);
    }

    public boolean removePost(ForumPost forumPost) {
        boolean result = false;
        if(posts.contains(forumPost)) {
            posts.remove(forumPost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment forumComment) {
        boolean result = false;
        if(comments.contains(forumComment)) {
            comments.remove(forumComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

}
