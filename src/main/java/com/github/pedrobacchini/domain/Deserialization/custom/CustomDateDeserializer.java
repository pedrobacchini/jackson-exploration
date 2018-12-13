package com.github.pedrobacchini.domain.Deserialization.custom;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.pedrobacchini.domain.Constants;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class CustomDateDeserializer extends StdDeserializer<Date> {

    public CustomDateDeserializer() { this(null); }

    protected CustomDateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String date = jsonParser.getText();
        try {
            return Constants.simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException();
        }
    }
}
