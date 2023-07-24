package com.cg.assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
	public static boolean isArmstrongNumber(int num) {
        List<Integer> digits = new ArrayList<>();
        int temp = num;

        while (temp > 0) {
            digits.add(temp % 10);
            temp = temp / 10;
        }

        int len = digits.size();
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, len);
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (isArmstrongNumber(num)) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }

    
}
