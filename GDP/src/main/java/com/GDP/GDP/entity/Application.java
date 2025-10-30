package com.GDP.GDP.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;


@Entity
@Table(name = "applications")
public class Application extends Prospect {
    
    @OneToOne
    @JoinColumn(name = "job_offer_id", nullable = false)
    private JobOffer offer;

    public Application(){
        super();
    }

    public Application(LocalDateTime initialApplicationDate, LocalDateTime dateRelaunch, List<LocalDateTime> historyOfRelaunches, JobOffer offer) {
        super(initialApplicationDate, dateRelaunch, historyOfRelaunches);
        this.offer = offer;
    }
    // Getters and Setters
    public JobOffer getOffer() {
        return offer;
    }
    public void setOffer(JobOffer offer) {
        this.offer = offer;
    }
}
