package com.luismalamoc.demodozerjdk8support.service;

import com.luismalamoc.demodozerjdk8support.domain.DestinationHelloObject;
import com.luismalamoc.demodozerjdk8support.domain.SourceHelloObject;
import lombok.RequiredArgsConstructor;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final Mapper mapper;

    public DestinationHelloObject doConvertion(SourceHelloObject request){
        DestinationHelloObject response = DestinationHelloObject.builder().build();
        mapper.map(request, response);// Do mapping using LocalDateTime attribute
        response.setFowardedAt(LocalDateTime.now());
        return response;
    }
}