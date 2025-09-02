package com.example.spring_boot_entidade_associada_para_um.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_entidade_associada_para_um.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
