package json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatDeserializerTest {

    @Test
    void deserializeCat(){
        Cat cat = (Cat) CatDeserializer.deserializeCat("{\"name\":\"Tom\",\"age\":20}");
        System.out.println(cat);
        assertEquals("Tom",cat.getName());
        assertEquals(20,cat.getAge());
    }
}