package com.bootcamp.hibernate.task.dao;

import com.bootcamp.hibernate.task.TaskFinancialDetails;
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
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    public void testFindByIsPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails =
                new TaskFinancialDetails(new BigDecimal("123"), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        //When
        List<TaskFinancialDetails> results = taskFinancialDetailsDao.findByPaid(false);

        //Then
        assertEquals(1, results.size());

        //CleanUp
        taskFinancialDetailsDao.deleteAll();
    }
}