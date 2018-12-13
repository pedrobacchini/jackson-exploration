package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.pedrobacchini.domain.Deserialization.custom.CustomDateDeserializer;

import java.util.Date;

/**
 * @JsonDeserialize
 *
 * The @JsonDeserialize annotation tells Jackson to use a custom deserializer while
 * deserializing the JSON to Java object. To do so, you need to annotate the field to
 * which you need to apply the custom deserializer.
 *
 * A Java class that uses the @JsonDeserialize annotation is:
 */
public class DeserializeDemoBean {

    public long personId = 123L;
    public String name = "Pedro Bacchini";
    @JsonDeserialize(using = CustomDateDeserializer.class)
    public Date activeDate;

    @Override
    public String toString() {
        return "DeserializeDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", activeDate=" + activeDate +
                '}';
    }
}
