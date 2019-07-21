package com.bootcamp.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedQuery(
        name = "Employee.findEmployeesWithLastName",
        query = "FROM Employee WHERE lastname = :LASTNAME"
)
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "ID")}
    )
    private List<Company> companies = new ArrayList<>();

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
