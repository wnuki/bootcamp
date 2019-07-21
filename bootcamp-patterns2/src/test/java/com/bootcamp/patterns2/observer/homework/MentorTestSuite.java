package com.bootcamp.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mentor = new Mentor("Mentor");
        Student student = new Student("Student");
        student.registerObserver(mentor);

        //When
        student.addHomework("homework");
        student.addHomework("another homework");
        student.addHomework("one more homework");

        //Then
        assertEquals(3, mentor.getUpdateCount());
    }
}