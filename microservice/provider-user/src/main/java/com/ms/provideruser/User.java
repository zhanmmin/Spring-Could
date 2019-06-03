package com.ms.provideruser;

import com.sun.javafx.beans.IDProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Formatter;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;

    //getters and setters

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
