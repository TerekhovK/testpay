package com.packt.example.clientcredentialsserver.dto;

import com.packt.example.clientcredentialsserver.model.Payment;
import com.packt.example.clientcredentialsserver.model.State;


public class NotificationDTO {

    private String id;
    private String created;
    private State state;

    public NotificationDTO(Payment payment) {
    this.id=payment.getId();
    this.created=payment.getCreated().toString();
    this.state=payment.getState();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
