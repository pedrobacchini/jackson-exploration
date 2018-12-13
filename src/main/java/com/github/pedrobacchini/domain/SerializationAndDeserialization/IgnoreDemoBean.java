package com.github.pedrobacchini.domain.SerializationAndDeserialization;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @JsonIgnore
 *
 * The @JsonIgnore annotation marks a field of a POJO to be ignored by Jackson during serialization and deserialization.
 * Jackson ignores the field both JSON serialization and deserialization. An example of Java class that uses the
 * @JsonIgnore annotation is this.
 */

public class IgnoreDemoBean {

    @JsonIgnore
    public long personId = 0;
    public String name = "Pedro Bacchini";

    @Override
    public String toString() {
        return "IgnoreDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
