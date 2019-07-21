package com.bootcamp.hibernate.manytomany.dao;

import com.bootcamp.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> findEmployeesWithLastName(@Param("LASTNAME")String lastname);
}
