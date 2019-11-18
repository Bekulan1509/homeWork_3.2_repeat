package com.company;

public class Main {

    public static void main(String[] args)  {
        BankAccount bankAccount = new BankAccount();
        System.out.println("у вас насчету "+bankAccount.deposit(10000));
        while (true) {
            try {
                System.out.println("остаток на счету "+bankAccount.withDraw(6000));
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Вы успешно сняли 4000 сом со счета");
                bankAccount.takeMoney();
                System.out.println(bankAccount.getAmount());
                break;
            }


        }
    }
}