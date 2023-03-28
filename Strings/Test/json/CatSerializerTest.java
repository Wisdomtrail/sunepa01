package json;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {
    Cat cat;
    LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
    DateTimeFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);
    }

    @Test
    void convertCatToJson() {
        String catJson = CatSerializer.convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+
                formatter.format(dateOfBirth)+"\""+"}",catJson);
    }
}