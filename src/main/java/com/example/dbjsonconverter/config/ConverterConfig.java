package com.example.dbjsonconverter.config;

import com.example.dbjsonconverter.converter.PGObjectToGenericTypeConverterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class ConverterConfig {

    private final PGObjectToGenericTypeConverterFactory factory;

    public ConverterConfig(PGObjectToGenericTypeConverterFactory factory) {
        this.factory = factory;
    }

    @Bean
    public DefaultConversionService conversionService() {
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverterFactory(factory);
        return conversionService;
    }
}
