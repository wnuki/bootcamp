package com.bootcamp.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;
    @Test
    public void TestGetLasLog() {
        // Given
        String log1 = "log 1";
        String log2 = "log 2";
        String log3 = "log 3";

        // When
        logger.getInstance().log(log1);
        logger.getInstance().log(log2);
        logger.getInstance().log(log3);

        String result = logger.getInstance().getLastLog();

        // Then
        assertEquals("log 3", result);
    }
}
