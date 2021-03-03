package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.model.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Controller
class ClientController {
//    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
//    private final ClientRepository repository;
//
//    ClientController(final ClientRepository repository) {
//        this.repository = repository;
//    }


//    @PostMapping("/client")
//    ResponseEntity<Client> createTask(@RequestBody Client toCreate) {
//        Client result = repository.save(toCreate);
//        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
//    }
//
//    @GetMapping(value = "/clients")
//    ResponseEntity<List<Client>> readAllClients() {
//        logger.info("read clients");
//        return ResponseEntity.ok(repository.findAll());
//    }

    @GetMapping("/greetingClient")
    public String greetingForm(Model model) {
        model.addAttribute("client", new Client());
        return "greetingClient";
    }

    @PostMapping("/greetingClient")
    public String greetingSubmit(@ModelAttribute Client client, Model model) {
        model.addAttribute("client", client);
        return "resultClient";
    }

}
