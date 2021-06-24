package com.luismalamoc.demodozerjdk8support.controller;

import com.luismalamoc.demodozerjdk8support.domain.DestinationHelloObject;
import com.luismalamoc.demodozerjdk8support.domain.SourceHelloObject;
import com.luismalamoc.demodozerjdk8support.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @RequestMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DestinationHelloObject> doConvertion(@RequestBody SourceHelloObject request){
        return ResponseEntity.ok(helloService.doConvertion(request));
    }
}