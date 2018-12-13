package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class ValueDemoBeanTest {

    @Test
    public void testSerializingWithJsonValue() throws JsonProcessingException {
        String jsonString = new ObjectMapper().writeValueAsString(new ValueDemoBean());
        System.out.println("Serializing: "+jsonString);
        assertThat(jsonString, containsString("Pedro Bacchini"));
        assertThat(jsonString, containsString("123"));
    }

    /*
    Sem Json Value
    Serializing: {"personId":123,"name":"Pedro Bacchini"}
    Com Json Value
    Serializing: "Pedro Bacchini,123,ValueDemoBean{personId=123, name='Pedro Bacchini'}"
     */
}