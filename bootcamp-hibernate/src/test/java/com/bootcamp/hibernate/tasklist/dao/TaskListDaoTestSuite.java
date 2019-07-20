package com.bootcamp.hibernate.tasklist.dao;

import com.bootcamp.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

}