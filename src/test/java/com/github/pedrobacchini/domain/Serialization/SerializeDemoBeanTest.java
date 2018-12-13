package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedrobacchini.domain.Constants;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class SerializeDemoBeanTest {

    @Test
    public void testSerializingWithJsonSerialize() throws ParseException, JsonProcessingException {
        String date = "13-12-2018 07:00:00";
        Date newDate = Constants.simpleDateFormat.parse(date);
        SerializeDemoBean bean = new SerializeDemoBean();
        bean.setActiveDate(newDate);
        String jsonString = new ObjectMapper().writeValueAsString(bean);
        System.out.println(jsonString);
        assertThat(jsonString, containsString("Pedro Bacchini"));
        assertThat(jsonString, containsString("123"));
        assertThat(jsonString, containsString("13-12-2018 07:00:00"));
    }
}