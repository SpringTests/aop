package com.ethickeep.bank;

import org.springframework.stereotype.Component;

@Component
public class InternetBank extends Bank{
    @Override
    public long getTotalAmount() {
        return money;
    }
}
