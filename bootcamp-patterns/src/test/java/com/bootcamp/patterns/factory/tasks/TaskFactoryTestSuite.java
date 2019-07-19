package com.bootcamp.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    public void testTaskFactoryShopping() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task shoppingTask = taskFactory.createTask(TaskFactory.getSHOPPINGTASK());
        shoppingTask.executeTask();

        // Then
        assertEquals("Shopping task", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testTaskFactoryDriving() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task drivingTask = taskFactory.createTask(TaskFactory.getDRIVINGTASK());
        drivingTask.executeTask();

        // Then
        assertEquals("Driving task", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());

    }

    @Test
    public void testTaskFactoryPainting() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task paintingTask = taskFactory.createTask(TaskFactory.getPAINTINGTASK());
        paintingTask.executeTask();

        // Then
        assertEquals("Painting task", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }
}