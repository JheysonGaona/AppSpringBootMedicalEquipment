package com.ucacue.jsgaona.AppBackend.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

@Entity
public class Equip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String nameEquip;
    @NonNull
    private String brand;
    @NonNull
    private String model;
    @NonNull
    private String specialization;
    private Integer amount;
    private Integer unitPrice;
    private LocalDateTime localDateTime;

    // Constructor sin parametros
    public Equip() {
    }


    // Constructor con parametros
    public Equip(@NonNull String nameEquip, @NonNull String brand, @NonNull String model, @NonNull String specialization,
                 Integer amount, Integer unitPrice) {
        this.nameEquip = nameEquip;
        this.brand = brand;
        this.model = model;
        this.specialization = specialization;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }


    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NonNull
    public String getNameEquip() {
        return nameEquip;
    }

    public void setNameEquip(@NonNull String nameEquip) {
        this.nameEquip = nameEquip;
    }

    @NonNull
    public String getBrand() {
        return brand;
    }

    public void setBrand(@NonNull String brand) {
        this.brand = brand;
    }

    @NonNull
    public String getModel() {
        return model;
    }

    public void setModel(@NonNull String model) {
        this.model = model;
    }

    @NonNull
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(@NonNull String specialization) {
        this.specialization = specialization;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}