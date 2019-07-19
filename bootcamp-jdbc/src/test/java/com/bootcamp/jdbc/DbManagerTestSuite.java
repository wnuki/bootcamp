package com.bootcamp.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {

        //Given
        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();

        // When
        String sqlQuery = " SELECT U.FIRSTNAME, U.LASTNAME, count(*) " +
                "from USERS U, POSTS P " +
                "where P.USER_ID = U.ID " +
                "group by U.ID " +
                "having count(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }
}