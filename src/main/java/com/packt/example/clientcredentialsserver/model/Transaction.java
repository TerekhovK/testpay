package com.packt.example.clientcredentialsserver.model;

import lombok.Data;

import javax.validation.constraints.NotNull;


class Transaction {

    private String external_id;

    @NotNull
    private Amount amount;

    private String description;

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
