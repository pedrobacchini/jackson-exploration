package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class JacksonInjectDemoBeanTest {

    @Test
    public void testDeserializingJacksonInject() throws IOException {
        String jsonString = "{\"name\": \"Pedro Bacchini\"}";
        InjectableValues injectableValues = new InjectableValues.Std().addValue(long.class, 231L);
        JacksonInjectDemoBean bean = new ObjectMapper()
                .reader(injectableValues)
                .forType(JacksonInjectDemoBean.class)
                .readValue(jsonString);
//        JacksonInjectDemoBean bean = new ObjectMapper().readValue(jsonString, JacksonInjectDemoBean.class);
        System.out.println(bean);
        assertThat(bean.name, is(equalTo("Pedro Bacchini")));
        assertThat(bean.personId, is(equalTo(231L)));
    }
}