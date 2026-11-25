package com.seduc2.princess.controller;

import com.seduc2.princess.entity.Princesa;
import com.seduc2.princess.service.PrincesaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/princesa")
public class PrincesaController {

    private final PrincesaService service;

    public PrincesaController(PrincesaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Princesa> mostrar(){

    }
}
