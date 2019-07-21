package com.bootcamp.hibernate.manytomany.facade;

import com.bootcamp.hibernate.manytomany.Company;
import com.bootcamp.hibernate.manytomany.Employee;
import com.bootcamp.hibernate.manytomany.dao.CompanyDao;
import com.bootcamp.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private List<Company> companiesResult = new ArrayList<>();
    private List<Employee> employeesResult = new ArrayList<>();

    @Test
    public void companySearchWithFacadeTest() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Software Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        companiesResult.add(softwareMachine);
        companiesResult.add(dataMaesters);

        //When
        List<Company> queryResult = searchFacade.retrieveCompaniesLike("oft");

        //Then
        assertEquals(companiesResult.size(), queryResult.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
            companyDao.delete(greyMatter);
        } catch (Exception e) {

        }
    }

    @Test
    public void employeeSearchWithFacade() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        employeesResult.add(lindaKovalsky);

        //When
        List<Employee> queryResult = searchFacade.retrieveEmployees("Kovalsky");

        //Then
        assertEquals(queryResult.size(), employeesResult.size());

        //CleanUp
        try {
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieClarckson);
            employeeDao.delete(lindaKovalsky);
        } catch (Exception e) {

        }
    }
}