package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class RawValueDemoBeanTest {

    @Test
    public void testSerializingJsonRawValue() throws JsonProcessingException {
        String jsonString = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(new RawValueDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("Pedro Bacchini"));
        assertThat(jsonString, containsString("{\"doorNumber\":1234,\"street\":\"T-63\",\"city\":\"New York\"}"));
    }
}