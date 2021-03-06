package com.bootcamp.hibernate.manytomany.dao;

import com.bootcamp.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query
    List<Company> findCompanyWithFragmentName(@Param("NAME")String name);
}
