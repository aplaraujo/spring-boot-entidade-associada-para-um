package com.example.spring_boot_entidade_associada_para_um.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_entidade_associada_para_um.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
