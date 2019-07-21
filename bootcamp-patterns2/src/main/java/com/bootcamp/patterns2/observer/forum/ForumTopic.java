package com.bootcamp.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable {
    private final List<String> messages;
    private final List<Observer> observers;
    private final String name;

    public ForumTopic(String name) {
        this.name = name;
        messages = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
