package com.bootcamp.patterns.factory.tasks;

public class TaskFactory {
    private static final String DRIVINGTASK = "DRIVING TASK";
    private static final String PAINTINGTASK = "PAINTING TASK";
    private static final String SHOPPINGTASK = "SHOPPING TASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Warsaw", "car");
            case PAINTINGTASK:
                return new PaintingTask("blue", "sky");
            case SHOPPINGTASK:
                return new ShoppingTask("book", 3);
            default:
                return null;
        }
    }

    public static String getDRIVINGTASK() {
        return DRIVINGTASK;
    }

    public static String getPAINTINGTASK() {
        return PAINTINGTASK;
    }

    public static String getSHOPPINGTASK() {
        return SHOPPINGTASK;
    }
}
