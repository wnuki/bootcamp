package com.bootcamp.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PortfolioTestSuite {
    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When
        String taskToDo = "taskToDo";
        String taskDone = "taskDone";
        String taskInProgress = "taskInProgress";

        board.getDoneList().addTask("taskDone");
        board.getInProgressList().addTask("taskInProgress");
        board.getToDoList().addTask("taskToDo");

        // Then
        Assert.assertEquals("taskToDo", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("taskDone", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("taskInProgress", board.getInProgressList().getTasks().get(0));
    }
}
