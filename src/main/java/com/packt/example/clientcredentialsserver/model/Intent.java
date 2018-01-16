package com.packt.example.clientcredentialsserver.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Created by User on 013 13.01.18.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Intent {
    ORDER("order");


    private String key;

    Intent(String key) {
        this.key = key;
    }

    @JsonCreator
    public static Intent fromString(String key) {
        return key == null
                ? null
                : Intent.valueOf(key.toUpperCase());
    }

    @JsonValue
    public String getKey() {
        return key;
    }
}
