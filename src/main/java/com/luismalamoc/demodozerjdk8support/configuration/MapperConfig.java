package com.luismalamoc.demodozerjdk8support.configuration;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class MapperConfig {

    @Bean
    public DozerBeanMapper dozerBean() {
        DozerBeanMapper beanMapper = new DozerBeanMapper();
        beanMapper.setMappingFiles(Collections.singletonList("dozerJdk8Converters.xml"));
        return beanMapper;
    }

}
