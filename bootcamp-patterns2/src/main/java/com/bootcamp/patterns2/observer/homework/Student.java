package com.bootcamp.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final String name;
    private List<Observer> observers;
    private List<String> homeworks;

    public Student(String name) {
        this.name = name;
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
}
