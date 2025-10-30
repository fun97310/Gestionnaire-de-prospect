package com.GDP.GDP.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "job_offers")
public class JobOffer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String link;

    @ManyToOne
    @JoinColumn(name="business_id", nullable=false)
    private Business business;

    @OneToOne(mappedBy="offer")
    private Application application;

    // Getters and Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLink(){
        return link;
    }

    public void setLink(String link){
        this.link = link;
    }

    public Business getBusiness(){
        return business;
    }

    public void setBusiness(Business business){
        this.business = business;
    }

    public Application getApplication(){
        return application;
    }

    public void setApplication(Application application){
        this.application = application;
    }
}
