package com.github.pedrobacchini.domain.Deserialization;

import com.fasterxml.jackson.annotation.JacksonInject;

/**
 * @JacksonInject
 *
 * The @JacksonInject annotation is used to tell Jackson that particular values of the
 * deserialized object will be injected and not read from the JSON string.
 *
 * An example of Java class where the personId field is injected by Jackson is:
 */
public class JacksonInjectDemoBean {

    @JacksonInject
    public long personId = 0;
    public String name = "Pedro Bacchini";

    @Override
    public String toString() {
        return "JacksonInjectDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
