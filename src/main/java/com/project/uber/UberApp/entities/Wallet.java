package com.project.uber.UberApp.entities;

import com.project.uber.UberApp.entities.enums.PaymentMethod;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wallet {
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private Double balance;

    @OneToMany(mappedBy = "wallet")
    private List<WalletTransaction> transactions;

}
