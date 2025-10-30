package com.GDP.GDP.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class Prospect {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private LocalDateTime initialApplicationDate;

    @Column(nullable=true)
    private LocalDateTime dateRelaunch;

    @ElementCollection
    private List<LocalDateTime> historyOfRelaunches = new ArrayList<>();

    // Getters and Setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getInitialApplicationDate(){
        return initialApplicationDate;
    }
    public void setInitialApplicationDate(LocalDateTime initialApplicationDate){
        this.initialApplicationDate = initialApplicationDate;   
    }

    public LocalDateTime getDateRelaunch(){
        return dateRelaunch;
    }

    public void setDateRelaunch(LocalDateTime dateRelaunch){
        this.dateRelaunch = dateRelaunch;
    }

    public List<LocalDateTime> getHistoryOfRelaunches(){
        return historyOfRelaunches;
    }

    public void setHistoryOfRelaunches(List<LocalDateTime> historyOfRelaunches){
        this.historyOfRelaunches = historyOfRelaunches;
    }
}
