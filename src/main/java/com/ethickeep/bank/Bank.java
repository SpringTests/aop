package com.ethickeep.bank;


public abstract class Bank {
    protected long money = 100000L;
    public abstract long getTotalAmount();
}
