package com.github.pedrobacchini.domain.SerializationAndDeserialization;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

/**
 * @JsonIgnoreType
 *
 * The @JsonIgnoreType annotation is used to mark a class to be ignored during serialization and deserialization.
 * It marks all the properties of the class to be ignored while generating JSON and reading JSON.
 * An example of Java class that uses the @JsonIgnoreType annotation is this.
 */
public class IgnoreTypeDemoBean {

    @JsonIgnoreType
    public static class Address {
        public String doorNumber = null;
        public String streetName = null;
        public String pinCode = null;
        public String city = null;

        @Override
        public String toString() {
            return "Address{" +
                    "doorNumber='" + doorNumber + '\'' +
                    ", streetName='" + streetName + '\'' +
                    ", pinCode='" + pinCode + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    public long personId = 0;
    public String name = "Pedro Bacchini";
    public Address address = new Address();

    @Override
    public String toString() {
        return "IgnoreTypeDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
