package com.github.pedrobacchini.domain.SerializationAndDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedrobacchini.domain.SerializationAndDeserialization.IgnoreTypeDemoBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class IgnoreTypeDemoBeanTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() { objectMapper = new ObjectMapper(); }

    @After
    public void tearDown() { objectMapper = null; }

    @Test
    public void testSerializingWithJsonIgnoreType() throws JsonProcessingException {
        String jsonString = objectMapper.writeValueAsString(new IgnoreTypeDemoBean());
        System.out.println(jsonString);
        assertThat(jsonString, containsString("Pedro Bacchini"));
        assertThat(jsonString, not(containsString("doorNumber")));
    }

    @Test
    public void testDeserializingWithJsonIgnoreType() throws IOException {
        String jsonString = "{\"personId\":123,\"name\":\"Leonardo Medeiros\",\"address\":{\"doorNumber\":123,\"streetName\":\"T-63\",\"pinCode\":\"123456\",\"city\":\"Goiania\"}}";
        IgnoreTypeDemoBean bean = objectMapper.readValue(jsonString, IgnoreTypeDemoBean.class);
        System.out.println(bean);
        assertThat(bean.name, containsString("Leonardo Medeiros"));
        assertThat(bean.address.doorNumber, is(not(equalTo("123"))));
    }
}