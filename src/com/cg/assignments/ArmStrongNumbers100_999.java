package com.cg.assignments;
import java.util.ArrayList;
import java.util.List;

public class ArmStrongNumbers100_999 {
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
        
        System.out.println("Armstong numbers from 100 to 1000: ");
		for(int i=100;i<=999;i++) {
			if (isArmstrongNumber(i)) {
		        System.out.print(i+" ");
		    } 
		}
        
    }

    
}
