package sber.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import sber.httpSender.HttpSender;
import sber.model.ServiceRq;
import org.springframework.stereotype.Service;
import sber.model.ServiceRs;


@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public ResponseEntity<String> forwardMessageFromAS1(ServiceRq serviceRq) {
        HttpSender httpSender = new HttpSender();
        //return httpSender.sendMessageFromAS1(serviceRq);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<String> forwardMessageToAS1(ServiceRs serviceRs) {
        HttpSender httpSender = new HttpSender();
        return httpSender.sendMessageToAS1(serviceRs);
    }
}
