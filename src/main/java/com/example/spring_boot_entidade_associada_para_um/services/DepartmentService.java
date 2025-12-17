package com.example.spring_boot_entidade_associada_para_um.services;

import com.example.spring_boot_entidade_associada_para_um.entities.Department;
import com.example.spring_boot_entidade_associada_para_um.repositories.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public Department save(Department department) {
        return departmentRepository.save(department);
    }
}
