package sber.controller;

import org.springframework.http.MediaType;
import sber.model.ServiceRq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sber.model.ServiceRs;
import sber.service.ClientService;


@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value = "/application1",
            produces = {MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseEntity<?> forwardMessageFromAS1(@RequestBody ServiceRq serviceRq) {
        return clientService.forwardMessageFromAS1(serviceRq);
    }

    @PostMapping(value = "/application2",
            produces = {MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseEntity<?> forwardMessageToAS1(@RequestBody ServiceRs serviceRs) {
        return clientService.forwardMessageToAS1(serviceRs);
    }


}
