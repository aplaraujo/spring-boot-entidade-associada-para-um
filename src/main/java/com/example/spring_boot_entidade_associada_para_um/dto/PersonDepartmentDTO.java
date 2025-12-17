package com.example.spring_boot_entidade_associada_para_um.dto;

public record PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {}
