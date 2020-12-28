package com.ethickeep.bank;

import org.springframework.stereotype.Component;

@Component
public class RegularBank extends Bank{
    @Override
    public long getTotalAmount() {
        System.out.println("Total amount:" + money+" coins");
        return 0;
    }
}
