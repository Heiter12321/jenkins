package sber.service;

import org.springframework.http.ResponseEntity;
import sber.httpsender.HttpSender;
import sber.model.ServiceRq;
import org.springframework.stereotype.Service;
import sber.model.ServiceRs;


@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public ResponseEntity<String> forwardMessageFromAS1(ServiceRq serviceRq) {
        HttpSender httpSender = new HttpSender();
        return httpSender.sendMessageFromAS1(serviceRq);
    }

    @Override
    public ResponseEntity<String> forwardMessageToAS1(ServiceRs serviceRs) {
        HttpSender httpSender = new HttpSender();
        return httpSender.sendMessageToAS1(serviceRs);
    }
}
