package com.bootcamp.testing.forum;

import java.util.Objects;

public class ForumComment {
    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumComment)) return false;
        ForumComment comment = (ForumComment) o;
        return Objects.equals(getForumPost(), comment.getForumPost()) &&
                Objects.equals(getCommentBody(), comment.getCommentBody()) &&
                Objects.equals(getAuthor(), comment.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getForumPost(), getCommentBody(), getAuthor());
    }
}
