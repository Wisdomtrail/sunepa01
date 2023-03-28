package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {

    public static Object deserializeCat(String catJson) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(catJson, Cat.class);
        } catch (IOException | ClassCastException e) {
           return e.getMessage();
        }
    }
}
