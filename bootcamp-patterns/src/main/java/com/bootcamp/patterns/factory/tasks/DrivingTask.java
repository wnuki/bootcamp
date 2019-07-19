package com.bootcamp.patterns.factory.tasks;

public class DrivingTask implements Task {
    private static final String TASKNAME = "Driving task";
    private String where;
    private String using;
    private boolean isTaskExecuted;

    public DrivingTask(String where, String using) {
        this.where = where;
        this.using = using;
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
