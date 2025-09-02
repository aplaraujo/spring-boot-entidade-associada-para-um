package com.example.spring_boot_entidade_associada_para_um.controllers;

import java.net.URI;

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
public class PersonController {
    @Autowired
    private PersonService personService;

    // @GetMapping(value = "/{id}")
    // public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
    //     ProductDTO dto = productService.findById(id);
    //     return ResponseEntity.ok(dto);
    // }

    // @GetMapping
    // public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable) {
    //     Page<ProductDTO> dto = productService.findAll(pageable);
    //     return ResponseEntity.ok(dto);
    // }

    // @PostMapping
    // public ResponseEntity<PersonDepartmentDTO> insert(@RequestBody PersonDepartmentDTO dto) {
    //     dto = personService.insert(dto);
    //     URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
    //     return ResponseEntity.created(uri).body(dto);
    // }

    @PostMapping
    public ResponseEntity<PersonDTO> insert(@RequestBody PersonDTO dto) {
        dto = personService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    // @PutMapping(value = "/{id}")
    // public ResponseEntity<ProductDTO> update(@PathVariable Long id, @Valid @RequestBody ProductDTO dto)
    //         throws InvalidDefinitionException {
    //     dto = productService.update(id, dto);
    //     return ResponseEntity.ok(dto);
    // }

    // @DeleteMapping(value = "/{id}")
    // public ResponseEntity<Void> delete(@PathVariable Long id) {
    //     productService.delete(id);
    //     return ResponseEntity.noContent().build();
    // }
}
