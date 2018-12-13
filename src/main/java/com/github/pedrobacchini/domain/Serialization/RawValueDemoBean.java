package com.github.pedrobacchini.domain.Serialization;

import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * @JsonRawValue
 *
 * The @JsonRawValue annotation is used on methods and fields. It tells Jackson to serialize the field or
 * property as declared. For example, if you have a String field in your Java class, the JSON value that
 * Jackson generates is enclosed within quotes (" "). But when you annotate the field with @JsonRawValue,
 * Jackson omits the quotes.
 *
 * Let us consider an example Java class that explains the use of @JsonRawValue.
 */
public class RawValueDemoBean {

    public long personId = 0;
    public String name = "Pedro Bacchini";

    @JsonRawValue
    public String address = "{\"doorNumber\":1234,\"street\":\"T-63\",\"city\":\"New York\"}";
}
