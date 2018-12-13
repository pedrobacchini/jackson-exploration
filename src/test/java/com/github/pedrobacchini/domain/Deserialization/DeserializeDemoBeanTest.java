package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedrobacchini.domain.Constants;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class DeserializeDemoBeanTest {

    @Test
    public void testDeserializingWithJsonDeserialize() throws IOException {
        String jsonString = "{\"personId\": 231, " +
                "\"name\": \"Pedro Bacchini\", " +
                "\"activeDate\":\"13-12-2018 10:00:00\"}";
        DeserializeDemoBean bean = new ObjectMapper().readValue(jsonString, DeserializeDemoBean.class);
        System.out.println(bean);
        assertThat(bean.name, is(equalTo("Pedro Bacchini")));
        assertThat(bean.personId, is(equalTo(231L)));
        assertThat(Constants.simpleDateFormat.format(bean.activeDate), is(equalTo("13-12-2018 10:00:00")));
    }
}