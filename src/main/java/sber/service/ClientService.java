package sber.service;

import org.springframework.http.ResponseEntity;
import sber.model.ServiceRq;
import sber.model.ServiceRs;

public interface ClientService {
    ResponseEntity<String> forwardMessageFromAS1(ServiceRq serviceRq);

    ResponseEntity<String> forwardMessageToAS1(ServiceRs serviceRs);
}