package com.github.pedrobacchini.domain.SerializationAndDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedrobacchini.domain.SerializationAndDeserialization.IgnorePropertiesDemoBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class IgnorePropertiesDemoBeanTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() { objectMapper = new ObjectMapper(); }

    @After
    public void tearDown() { objectMapper = null; }

    @Test
    public void testSerializationWithJsonIgnoreProperties() throws JsonProcessingException {
        String jsonString = objectMapper.writeValueAsString(new IgnorePropertiesDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("Pedro Bacchini"));
        assertThat(jsonString, not(containsString("userID")));
        assertThat(jsonString, not(containsString("gender")));
    }

    @Test
    public void testDeserializationWithJsonIgnoreProperties() throws IOException {
        String jsonString = "{\"userId\":231,\"name\":\"Leonardo Medeiros\",\"gender\":\"male\"}";
        IgnorePropertiesDemoBean bean = objectMapper.readValue(jsonString, IgnorePropertiesDemoBean.class);
        System.out.println(bean);
        assertThat(bean.name, containsString("Leonardo Medeiros"));
        assertThat(bean.userId, is(not(equalTo(231L))));
        assertThat(bean.userId, is(not(equalTo("male"))));
    }
}