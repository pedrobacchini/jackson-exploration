package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class RootNameDemoBeanTest {

    @Test
    public void testSerializingWithRootName() throws JsonProcessingException {
        String jsonString = new ObjectMapper()
                .enable(SerializationFeature.WRAP_ROOT_VALUE)
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(new RootNameDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("Pedro Bacchini"));
        assertThat(jsonString, containsString("user"));
    }
}