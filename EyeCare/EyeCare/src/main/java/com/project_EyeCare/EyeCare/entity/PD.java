package com.project_EyeCare.EyeCare.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int product_id;
    public String name;
    public int price;
    public String brand;
}
