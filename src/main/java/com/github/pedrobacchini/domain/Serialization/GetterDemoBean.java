package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * @JsonGetter
 *
 * The @JsonGetter annotation is used to customize the generated JSON keys.
 * This is accomplished with the value argument of @JsonGetter.
 * The value passed is the name that should be used as the JSON key.
 *
 * Let us consider an example Java class that uses the @JsonGetter annotation.
 */
public class GetterDemoBean {

    private long personId = 123L;
    private String personName = "Pedro Bacchini";

    @JsonGetter(value = "person-id")
    public long getPersonId() {
        return personId;
    }

    @JsonGetter(value = "person-name")
    public String getPersonName() {
        return personName;
    }
}
