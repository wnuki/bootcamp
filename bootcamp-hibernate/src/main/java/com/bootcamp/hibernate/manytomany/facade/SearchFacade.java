package com.bootcamp.hibernate.manytomany.facade;

import com.bootcamp.hibernate.manytomany.Company;
import com.bootcamp.hibernate.manytomany.Employee;
import com.bootcamp.hibernate.manytomany.dao.CompanyDao;
import com.bootcamp.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> retrieveCompaniesLike(String name) {
        return companyDao.findCompanyWithFragmentName(name);
    }

    public List<Employee> retrieveEmployees(String name) {
        return employeeDao.findEmployeesWithLastName(name);
    }
}
