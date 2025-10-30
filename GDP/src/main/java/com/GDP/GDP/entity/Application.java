package com.GDP.GDP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "applications")
public class Application extends Prospect {
    
    @OneToOne
    @JoinColumn(name = "job_offer_id", nullable = false)
    private JobOffer offer;

    // Getters and Setters
    public JobOffer getOffer() {
        return offer;
    }
    public void setOffer(JobOffer offer) {
        this.offer = offer;
    }
}
