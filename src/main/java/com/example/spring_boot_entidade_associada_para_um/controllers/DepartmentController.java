package com.example.spring_boot_entidade_associada_para_um.controllers;

import com.example.spring_boot_entidade_associada_para_um.dto.DepartmentDTO;
import com.example.spring_boot_entidade_associada_para_um.entities.Department;
import com.example.spring_boot_entidade_associada_para_um.mappers.DepartmentMapper;
import com.example.spring_boot_entidade_associada_para_um.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/departments")
@RequiredArgsConstructor
public class DepartmentController implements GenericController {

    private final DepartmentService departmentService;
    private final DepartmentMapper departmentMapper;


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody DepartmentDTO dto) {
        Department department = departmentMapper.toEntity(dto);
        departmentService.save(department);
        var url = gerarHeaderLocation(department.getId());
        return ResponseEntity.created(url).build();
    }

    @GetMapping
    public String teste() {
        return "Rota dos departamentos";
    }
}
