package com.project_EyeCare.EyeCare.entity;
import jakarta.persistence.*;

@Entity
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int product_id;
    public String name;
    public int price;
    public String brand;
}