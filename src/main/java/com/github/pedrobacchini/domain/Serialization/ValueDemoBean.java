package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @JsonValue
 *
 * The @JsonValue annotation is used at the method level. This annotation tells Jackson to use this
 * method to generate the JSON string from the Java object. Typically, if you want to print a serialized
 * object, you override the toString() method. But, by using the@JsonValue annotation, you can define
 * the way in which the Java object is to be serialized.
 *
 * Note: Jackson omits any quotation marks inside the String returned by the custom serializer.
 * Let us consider an example Java class that uses the @JsonValue annotation.
 */

public class ValueDemoBean {

    @JsonProperty
    private long personId = 123L;
    @JsonProperty
    private String name = "Pedro Bacchini";

    @JsonValue
    public String toJson() {
        return this.name+","+this.personId+","+this.toString();
    }

    @Override
    public String toString() {
        return "ValueDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
