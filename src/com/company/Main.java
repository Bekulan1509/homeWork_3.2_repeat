package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + "'s " + "bank amount is");
        System.out.println("your balance is " + bankAccount.deposit(10000));
        System.out.println("Would you like to earn some money?");
        System.out.println("1 - yes, 2- No ");
        int num = scanner.nextInt();


        if (num == 1) {
            System.out.println(" 1 example ");
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            System.out.println(" How much will it be " + a + " * " + b + "?");
            double sum = a * b;
            int answer = scanner.nextInt();
            if (answer == sum) {
                System.out.println("My congratulations ! It's correct!");
                System.out.println("+100 soms  for the right answer ");
                System.out.println("Your balance: " + bankAccount.deposit(100));

            } else {
                System.out.println("It isn't correct! You are Looser!  Right answer is " + sum);


            }
            System.out.println(" 2 example ");
            int c = (int) (Math.random() * 10);
            System.out.println(" How much will it be " + a + " - " + b + " + " + c + "?");

            double sum1 = a - b + c;
            int answer1 = scanner.nextInt();
            if (answer1 == sum1) {
                System.out.println("My congratulations ! It's correct!");
                System.out.println("+100 soms  for the right answer ");
                System.out.println("Your balance: " + bankAccount.deposit(100));
            } else {
                System.out.println("It isn't correct! You are Looser!   Right answer is " + sum);
            }
            System.out.println(" 3 example ");
            System.out.println(" How much will it be " + a + " * " + b + " + " + c + "?");
            double sum2 = a * b + c;
            int answer2 = scanner.nextInt();
            if (answer2 == sum2) {
                System.out.println("My congratulations ! It's correct!, There are 2 else) ");
                System.out.println("+100 soms  for the right answer ");
                System.out.println("Your balance: " + bankAccount.deposit(100));

            } else {
                System.out.println("It isn't correct! You are Looser!   Right answer is " + sum);
            }
            System.out.println(" 4 example ");
            System.out.println(" How much will it be " + a + " / " + b + " + " + c + "?");
            double sum3 = a / b + c;
            int answer3 = scanner.nextInt();
            if (answer3 == sum3) {
                System.out.println("My congratulations ! It's correct!");
                System.out.println("+100 soms  for the right answer ");
                System.out.println("Your balance: " + bankAccount.deposit(100));

            } else {
                System.out.println("It isn't correct! You are Looser!   Right answer is " + sum);
            }
            System.out.println(" 5 example ");
            System.out.println(" How much will it be " + a + " + " + b + " * " + c + "?");
            double sum4 = a + b * c;
            int answer4 = scanner.nextInt();
            if (answer4 == sum4) {
                System.out.println("My congratulations ! It's correct!");
                System.out.println("+100 soms  for the right answer ");
                System.out.println("Your balance: " + bankAccount.deposit(100));
            } else {
                System.out.println("It isn't correct! You are Looser!   Right answer is " + sum);


            }
        }

            if (num == 2) {
                System.out.println("у вас насчету " + bankAccount.deposit(10000));
                while (true) {
                    try {
                        System.out.println("остаток на счету " + bankAccount.withDraw(6000));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Вы успешно сняли деньги " + bankAccount.getAmount() + " сомов со счета");
                        bankAccount.takeMoney();
                        System.out.println(bankAccount.getAmount());
                        break;
                    }


                }

            }

    }
}