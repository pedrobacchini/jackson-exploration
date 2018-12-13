package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @JsonCreator
 *
 *The @JsonCreator annotation tells Jackson that the JSON properties can be mapped to the fields of
 * a constructor of the POJO. This is helpful when the JSON properties do not match with the names
 * of the Java object field names. The @JsonCreator annotation can be used where @JsonSetter cannot
 * be used. For example, immutable objects which need their initial values to be injected through constructors.
 *
 * An example of Java class that uses the @JsonCreator annotation is:
 */
public class CreatorDemoBean {

    public long personId = 0;
    public String name = "Pedro Bacchini";

    @JsonCreator
    public CreatorDemoBean(@JsonProperty("id") long personId,
                           @JsonProperty("name") String name) {
        this.personId = personId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreatorDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
