package com.github.pedrobacchini.domain.SerializationAndDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedrobacchini.domain.SerializationAndDeserialization.AutoDetectDemoBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AutoDetectDemoBeanTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() { objectMapper = new ObjectMapper(); }

    @After
    public void tearDown() { objectMapper = null; }

    @Test
    public void testSerializingWithJsonAutoDetect() throws JsonProcessingException {
        String jsonString = objectMapper.writeValueAsString(new AutoDetectDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("123"));
        assertThat(jsonString, containsString("Pedro Bacchini"));
    }

    @Test
    public void testDeserializinWithJsonAutoDetect() throws IOException {
        String jsonString = "{\"personId\":123,\"name\":\"Pedro Bacchini\"}";
        AutoDetectDemoBean bean = objectMapper.readValue(jsonString, AutoDetectDemoBean.class);
        System.out.println(bean);
        assertThat(bean.getName(), is(equalTo("Pedro Bacchini")));
        assertThat(bean.getPersonId(), is(equalTo(123L)));
    }
}