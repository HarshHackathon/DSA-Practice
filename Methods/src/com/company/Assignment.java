package com.company;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Minimum: " + minimumNumber(1,2,3));
//        System.out.println("Maximum: "+ maximumNumber(1,2,3));

//        oddEven(26);

//        System.out.println("Eligible to Vote: "+ isAdult(18));

//        System.out.println("Sum: "+ numSum(1,2));

//        System.out.println("Product: "+ products(2,5,8,9));

//        System.out.println("Enter radius: ");
//        int radius = sc.nextInt();
//        System.out.println("Circumference: "+ circumference(radius));
//        System.out.println("Area: "+ area(radius));

//        System.out.println("Enter the number: ");
//        int number = sc. nextInt();
//        System.out.println("Prime: "+ isPrime(number));

//        System.out.println("Enter marks (out of 100): ");
//        int marks = sc.nextInt();
//        System.out.println("Grade: "+ getGrades(marks));

//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
//        System.out.println("Factorial: "+factorial(number));

//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        System.out.println("Palindrome: "+ isPalindrome(num));

//        System.out.println("Enter the triplet separated by space: ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        System.out.println("Pythagorean Triplet: "+ isPythagoreanTriplet(num1,num2,num3));

//        System.out.println("Enter 2 numbers separated by space: ");
//        int low = sc.nextInt();
//        int high = sc.nextInt();
//
//        System.out.println("Primes: ");
//        for (int i=low;i<=high;i++){
//            if (isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }

//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.println("Sum of first n natural numbers: "+ sumFirstNatural(n));



    }

    public static int minimumNumber(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }

    public static int maximumNumber(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }

    public static void oddEven(int num){
        if (num%2==0){
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }

    public static boolean isAdult(int age){
        return age>=18;
    }

    public static int numSum(int ...nums){
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        return sum;
    }

    public static int products(int ...nums){
        int product = 1;
        for (int i=0;i<nums.length;i++){
            product *= nums[i];
        }

        return product;
    }

    public static double circumference(int radius){
        return 2*3.14*radius;
    }

    public static double area(int radius){
        return 3.14*radius*radius;
    }

    public static boolean isPrime(int number){
        if (number<=1){
            return false;
        }

        for (int i=2;i*i<=number;i++){
            if (number%i==0){
                return false;
            }
        }

        return true;
    }

    public static String getGrades(int marks){
        if(marks>90){
            return "AA";
        } else if (marks >80) {
            return "AB";
        } else if (marks >70) {
            return "BB";
        } else if (marks >60) {
            return "BC";
        } else if (marks >50) {
            return "CD";
        } else if (marks >40) {
            return "DD";
        } else {
            return "Fail";
        }
    }

    public static int factorial(int number){

        int result = 1;
        for (int i=1;i<=number;i++){
            result *= i;
        }

        return result;
    }

    public static boolean isPalindrome(int number){
        int original = number;
        int result = 0;

        while(number>0){
            result = (result *10) +  number %10;
            number /= 10;
        }

        return result == original;
    }

    public static boolean isPythagoreanTriplet(int num1, int num2, int num3){
        return ((num1*num1) + (num2*num2)) == num3*num3;
    }

    public static int sumFirstNatural(int n){
        return (n*(n+1))/2;
    }

}
