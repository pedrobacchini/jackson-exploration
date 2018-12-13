package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class SetterDemoBeanTest {

    @Test
    public void testDeserializinWithSetter() throws IOException {
        String jsonString = "{\"name\":\"Pedro Bacchini\",\"id\":123}";
        SetterDemoBean bean = new ObjectMapper().readValue(jsonString, SetterDemoBean.class);
        System.out.println(bean);
        assertThat(bean.name, is(equalTo("Pedro Bacchini")));
        assertThat(bean.personId, is(equalTo(123L)));
    }
}