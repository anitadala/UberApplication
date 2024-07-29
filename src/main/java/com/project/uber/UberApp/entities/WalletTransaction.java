package com.project.uber.UberApp.entities;

import com.project.uber.UberApp.entities.enums.TransactionMethod;
import com.project.uber.UberApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.boot.SpringBootVersion;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    @OneToOne
    private Ride ride;

    private String transactionId;

    @ManyToOne
    private  Wallet wallet;

    @CreationTimestamp
    private LocalDateTime timeStamp;
}
