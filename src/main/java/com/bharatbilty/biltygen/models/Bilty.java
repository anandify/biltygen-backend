package com.bharatbilty.biltygen.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Bilty {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String biltyNo;

        @ManyToOne
        private Consignor consignor;

        @ManyToOne
        private Consignee consignee;

        @ManyToOne
        private Driver driver;

        private String particulars;
        private BigDecimal weight;
        private BigDecimal freight;
        private BigDecimal tax;
        private BigDecimal total;

        private LocalDateTime createdAt = LocalDateTime.now();
}
