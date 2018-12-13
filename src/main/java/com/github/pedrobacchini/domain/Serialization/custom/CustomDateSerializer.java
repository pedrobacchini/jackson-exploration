package com.github.pedrobacchini.domain.Serialization.custom;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.github.pedrobacchini.domain.Constants;

import java.io.IOException;
import java.util.Date;

public class CustomDateSerializer extends StdSerializer<Date> {

    public CustomDateSerializer() { this(null); }

    private CustomDateSerializer(Class<Date> t) { super(t); }

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(Constants.simpleDateFormat.format(date));
    }
}
