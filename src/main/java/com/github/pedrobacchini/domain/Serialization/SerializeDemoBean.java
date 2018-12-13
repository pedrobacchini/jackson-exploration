package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.pedrobacchini.domain.Serialization.custom.CustomDateSerializer;

import java.util.Date;

/**
 * @JsonSerialize
 *
 * The @JsonSerialize annotation is used tell Jackson to use the declared custom serializer during the
 * serialization of the field, which is marked with this annotation.
 *
 * Let us consider a POJO that uses the @JsonSerializeannotation.
 */
public class SerializeDemoBean {

    public long personId = 123L;
    public String name = "Pedro Bacchini";

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date activeDate;

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }
}
