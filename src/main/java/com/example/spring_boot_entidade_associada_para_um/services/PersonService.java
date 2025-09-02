package com.example.spring_boot_entidade_associada_para_um.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_entidade_associada_para_um.dto.PersonDTO;
import com.example.spring_boot_entidade_associada_para_um.dto.PersonDepartmentDTO;
import com.example.spring_boot_entidade_associada_para_um.entities.Department;
import com.example.spring_boot_entidade_associada_para_um.entities.Person;
import com.example.spring_boot_entidade_associada_para_um.repositories.DepartmentRepository;
import com.example.spring_boot_entidade_associada_para_um.repositories.PersonRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());
        Department dept = departmentRepository.findById(dto.getDepartment().getId()).orElseThrow(() -> new EntityNotFoundException("Departmento não encontrado"));
        // Department dept = new Department();
        // dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);
        entity = personRepository.save(entity);
        return new PersonDepartmentDTO(entity);
    }

    public PersonDTO insert(PersonDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());
        Department dept = departmentRepository.findById(dto.getDepartmentId()).orElseThrow(() -> new EntityNotFoundException("Departmento não encontrado"));
        // Department dept = new Department();
        // dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);
        entity = personRepository.save(entity);
        return new PersonDTO(entity);
    }
}
