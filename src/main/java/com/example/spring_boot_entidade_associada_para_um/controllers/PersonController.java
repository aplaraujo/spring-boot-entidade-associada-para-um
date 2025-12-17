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

}
