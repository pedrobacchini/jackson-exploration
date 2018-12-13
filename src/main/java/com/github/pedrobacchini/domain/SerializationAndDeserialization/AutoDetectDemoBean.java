package com.github.pedrobacchini.domain.SerializationAndDeserialization;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * @JsonAutoDetect
 *
 * The @JsonAutoDetect annotation is used at the class level to tell Jackson to override the visibility of
 * the properties of a class during serialization and deserialization. You can set the visibility with
 * the following elements:
 *
 * creatorVisibility
 * fieldVisibility
 * getterVisibility
 * setterVisibility
 * isGetterVisibility
 *
 * The JsonAutoDetect class defines public static constants that are similar to Java class visibility levels.
 * They are:
 *
 * ANY
 * DEFAULT
 * NON_PRIVATE
 * NONE
 * PROTECTED_AND_PRIVATE
 * PUBLIC_ONLY
 * Let us consider an example of Java class that uses the @JsonAutoDetect annotation.
 */

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE
)
public class AutoDetectDemoBean {

    private long personId = 123L;
    private String name = "Pedro Bacchini";

    long getPersonId() {
        System.out.println("getPersonId");
        return personId;
    }

    String getName() {
        System.out.println("getName");
        return name;
    }

    @Override
    public String toString() {
        return "AutoDetectDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
