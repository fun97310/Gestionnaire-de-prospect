package com.GDP.GDP.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "businesses")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String recruitmentServiceContact;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecruitmentServiceContact() {
        return recruitmentServiceContact;
    }

    public void setRecruitmentServiceContact(String recruitmentServiceContact) {
        this.recruitmentServiceContact = recruitmentServiceContact;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}

