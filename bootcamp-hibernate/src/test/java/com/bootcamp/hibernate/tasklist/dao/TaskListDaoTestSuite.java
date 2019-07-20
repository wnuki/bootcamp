package com.bootcamp.hibernate.tasklist.dao;

import com.bootcamp.hibernate.task.Task;
import com.bootcamp.hibernate.task.TaskFinancialDetails;
import com.bootcamp.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Test list", "Test description");
        taskListDao.save(taskList);

        //When
        List<TaskList> result = taskListDao.findByListName("Test list");

        //Then
        assertEquals(1, result.size());

        //Clean
        taskListDao.deleteAll();
    }


    @Test
    public void testTaskListDaoSaveWithTasks() {

        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(200), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(100), true);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("TaskList name", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}