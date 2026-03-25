package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Portfolio {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany
    @JoinColumn(name = "client_id")
    private Client client;

    @Column
    private Date creationDate;

    @Column
    private int totalValue;

    @Column
    private String risk;

    @Column
    private int currency;

    // Default constructor
    public Portfolio() {}

    public Portfolio(String name, Client client,Date create_date, int total_value,String risk,int  currency) {
        this.name = name;
        this.client = client;
        this.creationDate = create_date;
        this.totalValue = total_value;
        this.risk = risk;
        this.currency = currency;
    }

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setFullName(String name) {
        this.name = name;
    }

    public Client getClientId() {
        return client;
    }

    public void setClientId(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creation_date) {
        this.creationDate = creation_date;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int total_value) {
        this.totalValue = total_value;
    }  

     public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }  


     public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }  
}
