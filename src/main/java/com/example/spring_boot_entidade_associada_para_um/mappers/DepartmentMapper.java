package com.example.spring_boot_entidade_associada_para_um.mappers;

import com.example.spring_boot_entidade_associada_para_um.dto.DepartmentDTO;
import com.example.spring_boot_entidade_associada_para_um.entities.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {
    public Department toEntity(DepartmentDTO dto) {
        Department department = new Department();
        department.setId(dto.id());
        department.setName(dto.name());
        return department;
    }

    public DepartmentDTO toDTO(Department department) {
        return new DepartmentDTO(department.getId(), department.getName());
    }
}
