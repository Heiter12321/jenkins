package sber.httpsender;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import sber.model.ServiceRq;
import sber.model.ServiceRs;

import java.util.ArrayList;
import java.util.List;

public class HttpSender {
    public ResponseEntity<String> sendMessageFromAS1(ServiceRq serviceRq) {
        StringBuilder xmlString = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?><ServiceRq><SystemName>");

        xmlString.append(serviceRq.getSystemName()).append("</SystemName><CardNumber>").append(serviceRq.getCardNumber());
        xmlString.append("</CardNumber><ClientName>").append(serviceRq.getClientName()).append("</ClientName></ServiceRq>");

        return sendMessage(new String(xmlString), "http://localhost:8080/" + serviceRq.getSystemName());
    }

    public ResponseEntity<String> sendMessageToAS1(ServiceRs serviceRs) {
        StringBuilder xmlString = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?><ServiceRs><StatusCode>");

        xmlString.append(serviceRs.getStatusCode()).append("</StatusCode><CardBalance>").append(serviceRs.getCardBalance()).append("</CardBalance></ServiceRs>");

        return sendMessage(new String(xmlString), "http://localhost:8080/AS1");
    }

    public ResponseEntity<String> sendMessage(String xml, String url) {
        RestTemplate restTemplate =  new RestTemplate();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new StringHttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);
        HttpEntity<String> request = new HttpEntity<>(xml, headers);

        return restTemplate.postForEntity(url, request, String.class);
    }
}
