package com.github.pedrobacchini.domain.SerializationAndDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedrobacchini.domain.SerializationAndDeserialization.IgnoreDemoBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class IgnoreDemoBeanTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() { objectMapper = new ObjectMapper(); }

    @After
    public void tearDown() { objectMapper = null; }

    @Test
    public void testSeriaizingWithJsonIgnore() throws JsonProcessingException {
        String jsonString = objectMapper.writeValueAsString(new IgnoreDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("Pedro Bacchini"));
        assertThat(jsonString, not(containsString("productId")));
    }

    @Test
    public void testDeserializinWithJsonIgnore() throws IOException {
        String jsonString = "{\"personId\":231, \"name\":\"Leonardo Medeiros\"}";
        IgnoreDemoBean bean = objectMapper.readValue(jsonString, IgnoreDemoBean.class);
        System.out.println(bean);
        assertThat(bean.name, is(equalTo("Leonardo Medeiros")));
        assertThat(bean.personId, is(not(equalTo(231L))));
    }
}