package com.example.dbjsonconverter.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.postgresql.util.PGobject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class PGObjectToGenericTypeConverterFactory implements ConverterFactory<PGobject, Object> {

    @Override
    public <T> Converter<PGobject, T> getConverter(Class<T> targetType) {
        return new PGObjectToGenericTypeConverter<>(targetType);
    }

    private class PGObjectToGenericTypeConverter<T> implements Converter<PGobject, T> {
        private final Class<T> targetType;

        public PGObjectToGenericTypeConverter(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        public T convert(PGobject source) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.readValue(source.getValue(), targetType);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


