package com.company;

import java.util.Locale;
import java.util.Scanner;
public class Assignment {

    public static int factorial(int number){
        int result = 1;
        for (int i=1;i<=number;i++){
            result *= i;
        }

        return result;
    }

    public static int gcd(int a, int b){
        if (b==0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      # Basic Java Programs
//        1. Area Of Circle Java Program
//        2. Area Of Triangle
//        3. Area Of Rectangle Program
//        4. Area Of Isosceles Triangle
//        5. Area Of Parallelogram
//        6. Area Of Rhombus
//        7. Area Of Equilateral Triangle
//        8. Perimeter Of Circle
//        9. Perimeter Of Equilateral Triangle
//        10. Perimeter Of Parallelogram
//        11. Perimeter Of Rectangle
//        12. Perimeter Of Square
//        13. Perimeter Of Rhombus
//        14. Volume Of Cone Java Program
//        15. Volume Of Prism
//        16. Volume Of Cylinder
//        17. Volume Of Sphere
//        18. Volume Of Pyramid
//        19. Curved Surface Area Of Cylinder
//        20. Total Surface Area Of Cube
//        21. Fibonacci Series In Java Programs
//        22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
//        23. Input a number and print all the factors of that number (use loops).
//        24. Take integer inputs till the user enters 0 and print the sum of all numbers
//                (HINT: while loop)
//        25. Take integer inputs till the user enters 0 and print the largest number from
//        all.

//        # Intermediate Java Programs
//        1. Factorial Program In Java
//        2. Calculate Electricity Bill
//        3. Calculate Average Of N Numbers
//        4. Calculate Discount Of Product
//        5. Calculate Distance Between Two Points
//        6. Calculate Commission Percentage
//        7. Power In Java
//        8. Calculate Depreciation of Value
//        9. Calculate Batting Average
//        10. Calculate CGPA Java Program
//        11. Compound Interest Java Program
//        12. Calculate Average Marks
//        13. Addition Of Two Numbers
//        14. Sum Of N Numbers
//        15. Armstrong Number In Java
//        16. Find Ncr & Npr
//        17. Reverse A String In Java
//        18. Find if a number is palindrome or not
//        19. Future Investment Value
//        20. HCF Of Two Numbers Program
//        21. LCM Of Two Numbers
//        22. Java Program Vowel Or Consonant
//        23. Perfect Number In Java
//        24. Check Leap Year Or Not
//        25. Sum Of A Digits Of Number
//        26. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to check if he can go out in the month of August.
//        27. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.


//        # Basic Java Programs
//        1. Area of Circle
//        System.out.print("Enter the radius: ");
//        double radius = sc.nextDouble();
//        System.out.println("Area of the Circle: "+ 3.14*radius*radius);

//        2. Area of Triangle
//        System.out.print("Enter the base: ");
//        double base = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = sc.nextDouble();
//
//        System.out.println("Area of the triangle: "+ 0.5 * base * height);

//        3. Area of Rectangle
//        System.out.print("Enter the length: ");
//        double length = sc.nextDouble();
//        System.out.print("Enter the breadth: ");
//        double breadth = sc.nextDouble();
//
//        System.out.println("Area of Rectangle: "+ length * breadth);

//        4. Area of Isosceles Triangle
//        System.out.print("Enter the length: ");
//        double length = sc.nextDouble();
//        System.out.println("Area of Isosceles triangle: "+ 0.5 * length * length);

//        5. Area of Parallelogram
//        System.out.print("Enter the base: ");
//        double base = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = sc.nextDouble();
//
//        System.out.println("Area of parallelogram: "+ base * height);

//        6. Area of Rhombus
//        System.out.print("Enter the first diagonal: ");
//        double diag1 = sc.nextDouble();
//        System.out.print("Enter the second diagonal: ");
//        double diag2 = sc.nextDouble();
//
//        System.out.println("Area of Rhombus: "+ 0.5 * diag1 * diag2);

//        7. Area of Equilateral triangle.

//        System.out.print("Enter the side: ");
//        double side = sc.nextDouble();
//        System.out.println("Area of Equilateral Triangle: "+ (Math.sqrt(3)/4) * side * side );

//        8. Perimeter of Circle.
//        System.out.print("Enter the radius: ");
//        double radius = sc.nextDouble();
//        System.out.println("Perimeter of the circle: "+ 2 * 3.14 * radius);

//        9. Perimeter of Equilateral triangle.
//        System.out.print("Enter the side: ");
//        double side = sc.nextDouble();
//        System.out.println("Perimeter of Equilateral Triangle: "+ 3 * side);

//        10. Perimeter of Parallelogram.
//        System.out.print("Enter the base: ");
//        double base = sc.nextDouble();
//        System.out.print("Enter the side: ");
//        double side = sc.nextDouble();
//
//        System.out.println("Perimeter of Parallelogram: "+ 2*(base+side));

//        11. Perimeter of Rectangle.
//        System.out.print("Enter the length: ");
//        double length = sc.nextDouble();
//        System.out.print("Enter the breadth: ");
//        double breadth = sc.nextDouble();
//
//        System.out.println("Perimeter of the Rectangle: "+ 2*(length + breadth));

//        12. Perimeter of Square.
//        System.out.print("Enter the side: ");
//        double side = sc.nextDouble();
//        System.out.println("Perimeter of Square: "+ 4 * side);

//        13. Perimeter of Rhombus.
//        System.out.print("Enter the side: ");
//        double side = sc.nextDouble();
//        System.out.println("Perimeter of Rhombus: "+ 4 * side);


//        14. Volume of cone.
//        System.out.print("Enter the radius: ");
//        double radius = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = sc.nextDouble();
//        System.out.println("Volume of Cone: "+ 3.14 * radius * radius * height / 3);

//        15. Volume of Prism.
//        System.out.print("Enter the base: ");
//        double base = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = sc.nextDouble();
//        System.out.println("Volume of Prism: "+ base * height);

//        16. Volume of Cylinder.
//        System.out.print("Enter the radius: ");
//        double radius = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = sc.nextDouble();
//
//        System.out.println("Volume of Cylinder: "+ 3.14 * radius * radius *height);

//        17. Volume of Sphere.
//        System.out.print("Enter the radius: ");
//        double radius = sc.nextDouble();
//        System.out.println("Volume of Sphere: "+ 4 * 3.14 * radius * radius * radius / 3);

//        18. Volume of Pyramid.
//        System.out.print("Enter the base length: ");
//        double baseLength = sc.nextDouble();
//        System.out.print("Enter the base width: ");
//        double baseWidth = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = sc.nextDouble();
//        System.out.println("Volume of the Pyramid: "+ baseLength * baseWidth * height / 3);

//        19. Curved Surface Area of Cylinder
//        System.out.print("Enter the radius: ");
//        double radius = sc.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = sc.nextDouble();
//
//        System.out.println("Curved Surface area of Cylinder: "+ 2 * 3.14 * radius * height);

//        20. Total Surface Area of Cube.
//
//        System.out.print("Enter side: ");
//        double side = sc.nextDouble();
//        System.out.println("Total Surface Area of Cube: "+ 6 * side * side);

//        21. Fibonacci Series In Java Programs
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.print("0 1 ");
//        for (int i=2; i<=n;i++){
//            int c = a+b;
//            System.out.print(c +" ");
//            a = b;
//            b = c;
//        }



//        22. Subtract the Product and Sum of Digits of an Integer
//        System.out.print("Enter Number: ");
//        int n = sc.nextInt();
//        int temp = n;
//        int product = 1;
//        int sum = 0;
//
//        while(temp>0){
//            int rem = temp % 10;
//            product = product * rem;
//            sum = sum + rem;
//            temp /= 10;
//        }
//
//        System.out.println("Result: "+ (product - sum));


//        23. Input a number and print all the factors of that number (use loops).
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.print("Factors: ");
//        for (int i = 1; i <= n; i++){
//            if (n%i==0){
//                System.out.print(i + " ");
//            }
//        }


//        24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//        int sum = 0;
//        while(true){
//            System.out.print("Enter the number: ");
//            int n = sc.nextInt();
//
//            if (n!=0) {
//                sum += n;
//            } else {
//                System.out.println(sum);
//                break;
//            }
//        }

//        25. Take integer inputs till the user enters 0 and print the largest number from all.
//        int largest = 0;
//        while(true){
//            System.out.print("Enter the number: ");
//            int n = sc.nextInt();
//
//            if (n!=0) {
//                if(n>largest){
//                    largest = n;
//                }
//            } else {
//                System.out.println(largest);
//                break;
//            }
//        }


//        Intermediate Java Programs.

//        1. Factorial Program In Java
//        System.out.print("Enter the number: ");
//        int num = sc.nextInt();
//        int result = 1;
//        for (int i = 1;i<=num; i++){
//            result *= i;
//        }
//        System.out.println("Factorial: "+ result);


//        2. Calculate Electricity Bill

//        System.out.print("Enter the units: ");
//        int units = sc.nextInt();
//        System.out.print("Enter price per unit: ");
//        double rate = sc.nextDouble();
//
//        System.out.println("Total Electricity Bill: Rs. "+ (units*rate));

//        3. Calculate Average Of N Numbers

//        System.out.print("Enter the N: ");
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i=0;i<=N;i++){
//            System.out.print("Enter number: ");
//            int num = sc.nextInt();
//            sum += num;
//        }
//
//        System.out.println("Average: "+ (float)(sum)/N);



//        4. Calculate Discount Of Product

//        System.out.print("Enter the price of product:");
//        int price = sc.nextInt();
//        System.out.print("Enter the discount percent: ");
//        int discountPercent = sc.nextInt();
//
//        System.out.println("Discount: "+ discountPercent * price / 100.0);

//        5. Calculate Distance Between Two Points

//        System.out.print("Enter x1: ");
//        int x1 = sc.nextInt();
//        System.out.print("Enter y1: ");
//        int y1 =sc.nextInt();
//        System.out.print("Enter x2: ");
//        int x2 = sc.nextInt();
//        System.out.print("Enter y2: ");
//        int y2 = sc.nextInt();
//
//        System.out.println("Distance: "+ Math.sqrt( ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)) ));

//        6. Calculate Commission Percentage
//        System.out.print("Enter the total amount: ");
//        int amount = sc.nextInt();
//        System.out.print("Enter the commission: ");
//        int commission = sc.nextInt();
//
//        System.out.println("Commission Percentage: "+ (float)(commission)/amount * 100);

//        7. Power In Java
//        System.out.println("Enter the Number: ");
//        int number = sc.nextInt();
//        System.out.println("Enter the power: ");
//        int power = sc.nextInt();
//        int result = 1;
//
//        for (int i=1;i<=power; i++){
//            result *= number;
//        }
//
//        System.out.println("Result: "+ result);



//        8. Calculate Depreciation of Value

//        System.out.println("Enter Cost of Asset: ");
//        int assetCost = sc.nextInt();
//        System.out.println("Enter Salvage Value: ");
//        int salvageValue = sc.nextInt();
//        System.out.println("Enter Useful Life: ");
//        int usefulLife = sc.nextInt();
//
//        System.out.println("Depreciation Value: "+ ((float)assetCost - salvageValue)/usefulLife);

//        9. Calculate Batting Average

//        System.out.println("Enter the runs scored: ");
//        int runs = sc.nextInt();
//        System.out.println("No of times out: ");
//        int outs = sc.nextInt();
//
//        System.out.println("Batting Average: "+ (float)(runs)/outs);

//        10. Calculate CGPA Java Program

//        System.out.println("No of semesters completed: ");
//        int semesters = sc.nextInt();
//        double totalGPA = 0;
//
//        for (int i=0;i<semesters;i++){
//            System.out.println("Enter SGPA for Semester "+ (i+1));
//            double GPA = sc.nextDouble();
//            totalGPA += GPA;
//        }
//
//        System.out.println("CGPA: "+ totalGPA/semesters);


//        11. Compound Interest Java Program

//        System.out.println("Enter the amount: ");
//        int amount = sc.nextInt();
//        System.out.println("Enter the rate: ");
//        int rate = sc.nextInt();
//        System.out.println("Enter number of times interest applied: ");
//        int n = sc.nextInt();
//        System.out.println("Enter time period: ");
//        int t = sc.nextInt();
//
//        System.out.println("Compound Interest: "+ amount* Math.pow(1+(rate*0.01)/n, n * t));



//        12. Calculate Average Marks
//        System.out.println("Enter the Science Marks: ");
//        int science = sc.nextInt();
//        System.out.println("Enter the Maths Marks: ");
//        int maths = sc.nextInt();
//
//        System.out.println("Average Marks: "+ (maths+science)/2.0);

//        13. Addition Of Two Numbers
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int num2 = sc.nextInt();
//
//        System.out.println("Sum: "+ (num1 + num2));

//        14. Sum Of N Numbers
//        System.out.println("Please enter N: ");
//        int N = sc.nextInt();
//        int sum=0;
//        for (int i=0;i<N;i++){
//            System.out.println("Please enter the number: ");
//            int n = sc.nextInt();
//            sum += n;
//        }
//
//        System.out.println("Sum: "+ sum);

//        15. Armstrong Number In Java

//        System.out.println("Enter the Number: ");
//        int num = sc.nextInt();
//        int temp = num;
//
//        int cubeSum = 0;
//        while(temp>0){
//            int lastDigit = temp%10;
//            cubeSum += lastDigit * lastDigit * lastDigit;
//            temp /= 10;
//        }
//
//        if (cubeSum == num){
//            System.out.println("Number is Armstrong.");
//        } else {
//            System.out.println("Number is not Armstrong.");
//        }


//        16. Find Ncr & Npr.
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        System.out.println("Enter r: ");
//        int r = sc.nextInt();
//
//        System.out.println("nPr :"+ factorial(n)/factorial(n-r));
//        System.out.println("nCr: "+ factorial(n)/(factorial(n-r) * factorial(r)));

//        17. Reverse A String In Java
//        System.out.println("Enter the string: ");
//        String str = sc.next();
//        String reverse = "";
//
//        for(int i = str.length()-1;i>=0;i--){
//            System.out.println(str.charAt(i));
//            reverse += str.charAt(i);
//        }
//
//        System.out.println("String: "+ str);
//        System.out.println("Reverse String: "+ reverse);





//        18. Find if a number is palindrome or not
//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
//        int reverse = 0;
//        int temp = number;
//        while(temp>0){
//            int lastDigit = temp%10;
//            reverse = (reverse * 10) + lastDigit;
//            temp /= 10;
//        }
//
//        System.out.println("Number: "+ number + " Reverse: "+reverse);
//        if (number == reverse){
//            System.out.println("Palindrome Number.");
//        } else {
//            System.out.println("Not a Palindrome Number.");
//        }

//        19. Future Investment Value

//        System.out.println("Enter Present Value: ");
//        int presentValue = sc.nextInt();
//        System.out.println("Enter interest rate: ");
//        double interestRate = (sc.nextInt())* 0.01;
//        System.out.println("Enter time: ");
//        int time = sc.nextInt();
//
//        System.out.println("Future Value: "+ presentValue * Math.pow((1+interestRate),time));


//        20. HCF Of Two Numbers Program
//        System.out.println("Enter first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = sc.nextInt();
//
//        System.out.println("HCF: "+ gcd(num1, num2));

//        21. LCM Of Two Numbers
//        System.out.println("Enter first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = sc.nextInt();
//
//        System.out.println("LCM: " + (num1 * num2)/gcd(num1,num2));

//        22. Java Program Vowel Or Consonant
//        System.out.println("Enter the character: ");
//        char c = sc.next().toUpperCase().charAt(0);
//
//        switch(c){
//            case 'A':
//            case 'E':
//            case 'I':
//            case 'O':
//            case 'U':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonant");
//                break;
//        }


//        23. Perfect Number In Java
//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i<number; i++) {
//            if (number % i == 0) {
//                sum += i;
//            }
//        }
//
//        if (sum == number) {
//            System.out.println("Perfect Number.");
//        } else {
//            System.out.println("Not a Perfect Number.");
//        }


//        24. Check Leap Year Or Not
//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//        if (year % 4 == 0) {
//            System.out.println("Leap Year.");
//        } else {
//            System.out.println("Not a Leap Year. ");
//        }


//        25. Sum Of A Digits Of Number
//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
//        int sum = 0;
//        while (number>0){
//            sum+=number%10;
//            number/=10;
//        }
//
//        System.out.println("Sum of Digits: "+ sum);

//        26. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to check if he can go out in the month of August.
//        System.out.println("Enter the date of a given month: ");
//        int date = sc.nextInt();
//
//        if (date % 2 ==0){
//            System.out.println("You can go out.");
//        } else {
//            System.out.println("You cannot go out.");
//        }

//        27. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

//        int negativeSum = 0;
//        int positiveEvenSum = 0;
//        int positiveOddSum =0;
//
//        System.out.println("Enter N: ");
//        int N = sc.nextInt();
//
//        for (int i = 0;i<=N;i++){
//            System.out.println("Enter the number:");
//            int number = sc.nextInt();
//            if (number<0){
//                negativeSum+=number;
//            } else {
//                if (number % 2 == 0) {
//                    positiveEvenSum += number;
//                } else {
//                    positiveOddSum += number;
//                }
//            }
//        }
//
//        System.out.println("Negative Sum: "+ negativeSum);
//        System.out.println("Positive Even Sum: "+ positiveEvenSum);
//        System.out.println("Positive Odd Sum: "+ positiveOddSum);




    }
}
