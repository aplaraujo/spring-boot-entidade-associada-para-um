package com.example.spring_boot_entidade_associada_para_um.controllers;

import java.net.URI;

import com.example.spring_boot_entidade_associada_para_um.dto.PersonDepartmentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.spring_boot_entidade_associada_para_um.dto.PersonDTO;
import com.example.spring_boot_entidade_associada_para_um.services.PersonService;

@RestController
@RequestMapping(value = "/people")
@RequiredArgsConstructor
public class PersonController implements GenericController{
    private final PersonService personService;

    // Caso 1
//    @PostMapping
//    public ResponseEntity<Void> save(@RequestBody PersonDepartmentDTO dto) {
//        personService.save(dto);
//        var url = gerarHeaderLocation(dto.id());
//        return ResponseEntity.created(url).build();
//    }

    // Caso 2
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody PersonDTO dto) {
        personService.save(dto);
        var url = gerarHeaderLocation(dto.id());
        return ResponseEntity.created(url).build();
    }
}
