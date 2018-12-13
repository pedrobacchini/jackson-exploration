package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class GetterDemoBeanTest {

    @Test
    public void testSerializingWithGetter() throws JsonProcessingException {
        String jsonString = new ObjectMapper().writeValueAsString(new GetterDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("person-id"));
        assertThat(jsonString, containsString("person-name"));
    }
}