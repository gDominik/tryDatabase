package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.model.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.net.URI;
import java.util.List;

@RestController
class ClientController {
    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
    private final ClientRepository repository;

    ClientController(final ClientRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/client")
    ResponseEntity<Client> createTask(@RequestBody Client toCreate) {
        Client result = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }

    @GetMapping(value = "/clients")
    ResponseEntity<List<Client>> readAllClients() {
        logger.info("read clients");
        return ResponseEntity.ok(repository.findAll());
    }

}
