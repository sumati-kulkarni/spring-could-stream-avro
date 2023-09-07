package com.citi.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

@AllArgsConstructor
public class RecordDeserializer<T> implements Deserializer<T> {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Class<T> forType;


    @Override
    public T deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(new String(data), forType);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }
}