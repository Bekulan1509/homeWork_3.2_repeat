package com.company;

public class BankAccount {
    private double amount;

    public BankAccount() {

    }


    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount += sum;
        return amount;

    }

    public double withDraw(double sum) throws Exception {

        if (amount < sum) {
            throw new LimitException("У вас не достатачно средств на счету ", amount);
        } else {
            amount -= sum;
        }
        return amount;


    }

    public void takeMoney() {

        double amount1 = getAmount();
        amount = amount1-getAmount();

    }
}
    


        
