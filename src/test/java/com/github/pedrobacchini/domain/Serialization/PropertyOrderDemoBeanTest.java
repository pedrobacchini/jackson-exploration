package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class PropertyOrderDemoBeanTest {

    @Test
    public void testSerializingWithJsonPropertyOrder() throws JsonProcessingException {
        String jsonString = new ObjectMapper().writeValueAsString(new PropertyOrderDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("123"));
        assertThat(jsonString, containsString("Pedro Bacchini"));
    }
}