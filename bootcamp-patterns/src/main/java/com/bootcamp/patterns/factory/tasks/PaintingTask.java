package com.bootcamp.patterns.factory.tasks;

public class PaintingTask implements Task {
    private static final String TASKNAME = "Painting task";
    private String color;
    private String whatToPaint;
    private boolean isTaskExecuted;

    public PaintingTask(String color, String whatToPaint) {
        this.color = color;
        this.whatToPaint = whatToPaint;
        isTaskExecuted = false;
    }

    @Override
    public void executeTask() {
        isTaskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return TASKNAME;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}