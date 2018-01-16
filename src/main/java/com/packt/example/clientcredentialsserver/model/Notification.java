package com.packt.example.clientcredentialsserver.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by User on 015 15.01.18.
 */
public class Notification {
    @NotNull
    @Size(min = 3, max = 3)
    private String currency;
    @NotNull
    @Size(min = 1, max = 10)
    private String value;



    private String sha2;
    private String external_id;
    private State state;


    public String getSha2() {
        return sha2;
    }

    public void setSha2(String sha2) {
        this.sha2 = sha2;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
