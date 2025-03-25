package com.bharatbilty.biltygen.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String licenseNumber;
    private String phone;
    private String address;
}
