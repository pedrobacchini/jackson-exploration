package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @JsonRootName
 *
 * The @JsonRootName annotation can be used to tell Jackson to wrap the object to be
 * serialized with a top-level element. You can pass the name as a parameter to the
 * @JsonRootName annotation. Let us consider that you want to wrap your serialized
 * Java object with the key user.
 *
 * Here is an example of a Java class that uses the @JsonRootName annotation.
 */
@JsonRootName(value = "user")
public class RootNameDemoBean {

    public long personId = 0;
    public String name = "Pedro Bacchini";
}
