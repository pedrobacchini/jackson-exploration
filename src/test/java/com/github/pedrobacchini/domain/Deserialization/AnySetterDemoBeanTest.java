package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class AnySetterDemoBeanTest {

    @Test
    public void testDeserializingWithAnySetter() throws IOException {
        String jsonString = "{\"personId\": 231, " +
                "\"personName\": \"Pedro Bacchini\", " +
                "\"email\": \"pedrobacchini@outlook.com\", " +
                "\"gender\": \"male\"}";
        AnySetterDemoBean bean = new ObjectMapper().readValue(jsonString, AnySetterDemoBean.class);
        System.out.println(bean);
        assertThat(bean.personName, is(equalTo("Pedro Bacchini")));
        assertThat(bean.personId, is(equalTo(231L)));
        assertThat(bean.getProperties().get("gender"), is(equalTo("male")));
    }
}