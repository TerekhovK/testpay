package com.packt.example.clientcredentialsserver.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
class Amount {

    @NotNull
    @Size(min = 3, max = 3)
    private String currency;
    @NotNull
    @Size(min = 1, max = 10)
    private String value;

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
}
