package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class AnyGetterDemoBeanTest {

    @Test
    public void testSerializingWithAnyGetter() throws JsonProcessingException {
        AnyGetterDemoBean bean = new AnyGetterDemoBean();
        Map<String, String> stringMap = bean.getProperties();
        stringMap.put("email","pedrobacchini@outlook.com");
        stringMap.put("gender","male");
        stringMap.put("mother","Maria Henrique");
        String jsonString = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(bean);
        System.out.println(jsonString);
        assertThat(jsonString, containsString("email"));
        assertThat(jsonString, containsString("gender"));
    }
}