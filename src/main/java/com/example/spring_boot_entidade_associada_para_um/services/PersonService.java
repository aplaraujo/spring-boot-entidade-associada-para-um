package com.example.spring_boot_entidade_associada_para_um.services;

import com.example.spring_boot_entidade_associada_para_um.mappers.PersonMapperOne;
import com.example.spring_boot_entidade_associada_para_um.mappers.PersonMapperTwo;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final DepartmentRepository departmentRepository;
    private final PersonMapperOne mapperOne;
    private final PersonMapperTwo mapperTwo;

    // Caso 1
    public PersonDepartmentDTO save(PersonDepartmentDTO dto) {
        Person person = mapperOne.toEntity(dto);
        Department dept = departmentRepository.findById(dto.department().id()).orElseThrow(() -> new EntityNotFoundException("Departmento não encontrado"));
        person.setDepartment(dept);
        person = personRepository.save(person);
        return mapperOne.toDTO(person);
    }

//    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
//        Person entity = new Person();
//        entity.setName(dto.getName());
//        entity.setSalary(dto.getSalary());
//        Department dept = departmentRepository.findById(dto.getDepartment().getId()).orElseThrow(() -> new EntityNotFoundException("Departmento não encontrado"));
//        // Department dept = new Department();
//        // dept.setId(dto.getDepartment().getId());
//
//        entity.setDepartment(dept);
//        entity = personRepository.save(entity);
//        return new PersonDepartmentDTO(entity);
//    }
//
//    public PersonDTO insert(PersonDTO dto) {
//        Person entity = new Person();
//        entity.setName(dto.getName());
//        entity.setSalary(dto.getSalary());
//        Department dept = departmentRepository.findById(dto.getDepartmentId()).orElseThrow(() -> new EntityNotFoundException("Departmento não encontrado"));
//        // Department dept = new Department();
//        // dept.setId(dto.getDepartment().getId());
//
//        entity.setDepartment(dept);
//        entity = personRepository.save(entity);
//        return new PersonDTO(entity);
//    }
}
