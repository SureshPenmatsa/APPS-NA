package com.cg.assignments;

import java.util.Scanner;

public class SIAndCI {
    
    public static int calculateSimpleInterest(int amount, int rate, int time) {
        return (amount * rate * time) / 100;
    }

    public static int calculateCompoundInterest(int amount, int rate, int time) {
        return (int) (amount * Math.pow((1 + rate / 100), time)) - amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        System.out.print("Enter rate: ");
        int rate = sc.nextInt();

        System.out.print("Enter time period: ");
        int time = sc.nextInt();

        System.out.println(calculateSimpleInterest(amount, rate, time));
        System.out.println(calculateCompoundInterest(amount, rate, time));

    }
}
