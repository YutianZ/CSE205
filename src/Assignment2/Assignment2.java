package Assignment2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int minInt = 0, sumPositiveEven = 0, countNegativeInt = 0, sumDivisibleBy3 = 0;
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        while(temp != 0) {
            if(temp < minInt) {
                minInt = temp;
            }
            if(temp > 0 && temp % 2 == 0) {
                sumPositiveEven += temp;
            }
            if(temp < 0) {
                countNegativeInt++;
            }
            if(temp % 3 == 0) {
                sumDivisibleBy3 += temp;
            }
            temp = scanner.nextInt();
        }
        System.out.println("The minimum integer is " + minInt +
                "\nThe sum of positive even integers is " + sumPositiveEven +
                "\nThe count of negative integers is " + countNegativeInt +
                "\nThe sum of numbers divisible by 3 is " + sumDivisibleBy3);
    }
}
