package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @JsonInclude
 *
 * The @JsonInclude annotation is used to exclude properties or fields of a class under certain conditions.
 * This is defined using the JsonInclude.Include enum. This enum contains constants that determine whether
 * or not to exclude the property. The constants are:
 *
 * ALWAYS
 * NON_DEFAULT
 * NON_EMPTY
 * NON_NULL
 *
 * Let us consider an example Java class that uses the @JsonInclude annotation:
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IncludeDemoBean {

    public long personId = 123L;
    public String name = null;

    @Override
    public String toString() {
        return "IncludeDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
