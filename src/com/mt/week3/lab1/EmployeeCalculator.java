package com.mt.week3.lab1;
public class EmployeeCalculator {

	/**
	 * Author: Muhammad Tanvir
	 * Date: 09/23/2026
	 * Description: Manages employee salaries through fundamental Java concepts including 
	 * static variables, static methods, method overloading, and passing arrays as arguments.
	 */	
	
    // 1. Static Variable
    static int employeeCount = 0;

	public static void main(String[] args) {
        // 5. Arrays
        double[] salaries = {55000, 62000, 71000, 48000, 85000};

        // Print salaries and count employees
        System.out.println("Employee Salaries:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
            employeeCount = employeeCount + 1;
        }
        System.out.println();

        // Get average and print
        double average = calculateAverageSalary(salaries);
        System.out.println("Average Salary: " + average);
        System.out.println();

        // Pass salaries[0] (the first number, 55000)
        double bonus10 = calculateBonus(salaries[0]);
        System.out.println("10% Bonus: " + bonus10);

        // Pass salaries[1] (the second number, 62000)
        double bonus15 = calculateBonus(salaries[1], 15);
        System.out.println("15% Bonus: " + bonus15);
        System.out.println();

        // Print total count
        System.out.println("Total Employees: " + employeeCount);
    }

    // 2. Programmer-Defined Method
    static double calculateAverageSalary(double[] salaries) {
        double total = 0;
        for (int i = 0; i < salaries.length; i++) {
            total = total + salaries[i];
        }
        return total / salaries.length;
    }

    // 3. Static Method (10% Bonus)
    static double calculateBonus(double salary) {
        return salary * 0.10;
    }

    // 4. Method Overloading (Custom % Bonus)
    static double calculateBonus(double salary, double percentage) {
        return ((salary * percentage) / 100);
    }
}
