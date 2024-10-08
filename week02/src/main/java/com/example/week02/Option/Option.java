package com.example.week02.Option;

import com.example.week02.Product.Product;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "option_tb")

public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String option_id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @Column(nullable = false, length = 100)
    private String option_name;

    @Column(nullable = true, precision = 10, scale = 2)
    private BigDecimal option_price;


    @Builder
    public Option(String option_id, Product product, String option_name, BigDecimal option_price) {
        this.option_id = option_id;
        this.product = product;
        this.option_name = option_name;
        this.option_price = option_price;

    }
}
