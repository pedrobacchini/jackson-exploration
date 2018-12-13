package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class CreatorDemoBeanTest {

    @Test
    public void testDesserializingWithCreator() throws IOException {
        String jsonString = "{\"id\": 231, \"name\": \"Pedro Bacchini\"}";
        CreatorDemoBean bean = new ObjectMapper().readValue(jsonString, CreatorDemoBean.class);
        System.out.println(bean);
        assertThat(bean.name, is(equalTo("Pedro Bacchini")));
        assertThat(bean.personId, is(equalTo(231L)));
    }
}