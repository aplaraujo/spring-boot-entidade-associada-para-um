package com.example.spring_boot_entidade_associada_para_um.mappers;

import com.example.spring_boot_entidade_associada_para_um.dto.DepartmentDTO;
import com.example.spring_boot_entidade_associada_para_um.dto.PersonDepartmentDTO;
import com.example.spring_boot_entidade_associada_para_um.entities.Person;
import org.springframework.stereotype.Component;

// Caso 1 - Cadastro de pessoas com id do departamento aninhado
@Component
public class PersonMapperOne {
    public Person toEntity(PersonDepartmentDTO dto) {
        Person person = new Person();
        person.setName(dto.name());
        person.setSalary(dto.salary());
        return person;
    }

    public PersonDepartmentDTO toDTO(Person person) {
        DepartmentDTO dto = new DepartmentDTO(person.getId(), person.getDepartment().getName());
        return new PersonDepartmentDTO(person.getId(), person.getName(), person.getSalary(), dto);
    }
}
