package com.ms.concumermovie;

import java.math.BigDecimal;

public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalancd(BigDecimal balance) {
        this.balance = balance;
    }

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
}
