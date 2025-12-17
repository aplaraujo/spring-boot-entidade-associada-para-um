package com.example.spring_boot_entidade_associada_para_um.mappers;

import com.example.spring_boot_entidade_associada_para_um.dto.PersonDTO;
import com.example.spring_boot_entidade_associada_para_um.entities.Person;
import org.springframework.stereotype.Component;

// Caso 2 - Cadastro de pessoas com id do departamento incluso
@Component
public class PersonMapperTwo {
    public Person toEntity(PersonDTO dto) {
        Person person = new Person();
        person.setName(dto.name());
        person.setSalary(dto.salary());
        return person;
    }

    public PersonDTO toDTO(Person person) {
        Long departmentId = person.getDepartment() != null ? person.getDepartment().getId() : null;
        return new PersonDTO(person.getId(), person.getName(), person.getSalary(), departmentId);
    }
}
