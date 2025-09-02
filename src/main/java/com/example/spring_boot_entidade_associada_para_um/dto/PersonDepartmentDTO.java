package com.example.spring_boot_entidade_associada_para_um.dto;

import com.example.spring_boot_entidade_associada_para_um.entities.Person;

public class PersonDepartmentDTO {

    private Long id;
    private String name;
    private Double salary;

    private DepartmentDTO department;

    public PersonDepartmentDTO() {}

    public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public PersonDepartmentDTO(Person entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.salary = entity.getSalary();
        this.department = new DepartmentDTO(entity.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    
}
