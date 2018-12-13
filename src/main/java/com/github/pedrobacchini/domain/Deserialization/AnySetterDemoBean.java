package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * @JsonAnySetter
 *
 * The @JsonAnySetter annotation is used on setter methods of a Map field. Sometimes you may find some
 * JSON values that cannot be mapped to the fields in the Java object class. In such a case, the
 * @JsonAnySetter captures the data and stores them in a Map.
 *
 * A Java class that uses the @JsonAnySetter annotation is:
 */
public class AnySetterDemoBean {

    public long personId = 123L;
    public String personName = "Pedro Bacchini";
    private Map<String, String> properties = new HashMap<>();

    public Map<String, String> getProperties() {
        return properties;
    }

    @JsonAnySetter
    public void setProperties(String key, String value) {
        properties.put(key, value);
    }

    @Override
    public String toString() {
        return "AnySetterDemoBean{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", properties=" + properties +
                '}';
    }
}
