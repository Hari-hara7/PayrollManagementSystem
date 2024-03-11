# Payroll Management System

A simple Java-based payroll management system for small businesses.

## Overview

This project implements a basic payroll management system to handle employee information, calculate salaries, deductions, and income tax. It provides a command-line interface for users to input employee details and view their salary slips.

## Features

- Add employees with unique IDs, names, and basic salaries.
- Calculate gross salary, deductions, and net salary.
- Display detailed salary slips for each employee.
- Calculate income tax based on net salary.

## Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Hari-hara7/PayrollManagementSystem.git
   cd PayrollManagementSystem

   ## Technologies Used

- **Java:** The primary programming language used for implementing the payroll system.
- **Scanner Class:** Utilized for user input handling.
- **Object-Oriented Programming (OOP):** The project follows OOP principles with classes like `Employee`, `Salary`, and `TaxCalculator`.

## Methods

### `Employee` Class

- `getEmployeeId()`: Returns the employee's ID.
- `getName()`: Returns the employee's name.
- `getBasicSalary()`: Returns the employee's basic salary.

### `Salary` Class

- `calculateGrossSalary()`: Calculates the gross salary with a bonus.
- `calculateDeductions()`: Calculates deductions from the gross salary.
- `calculateNetSalary()`: Calculates the net salary after deductions.
- `getNetSalary()`: Returns the net salary.

### `TaxCalculator` Class

- `calculateIncomeTax(double income)`: Calculates income tax based on the provided income.
  ### `out put`
   Enter Employee ID: 1
Enter Employee Name: Hari
Enter Basic Salary: 50000

Employee ID: 1
Employee Name:Hari
Basic Salary: 50000.0
Gross Salary: 60000.0
Deductions: 6000.0
Net Salary: 54000.0
Income Tax: 5400.0
----------------------------


