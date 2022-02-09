package com.hcl;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import com.hcl.entity.Employee;
import com.hcl.utility.*;

/**
 * Program: 
 * - Menu driven program, Maven project, communicates with MySQL db 
 * - Employee table empId field incremented automatically 
 * - Employee attributes:
 * 						1. EmpId 
 * 						2. EmpName 
 * 						3. DOB 
 * 						4. Salary 
 * 						5. Age 
 * - Insert record in Employee DB using CommandLine args 
 * - Retrieve all Employee info 
 * - Retrieve any employee record input given through CL arg 
 * - Update any employee record input given through CL arg 
 * - Delete any particular employee record input given through CL arg 
 * - ex: retrieve emp info filter records by sal > 5000, age > 21, name starts with 'B'
 */
public class EmpMngmtCLI {

	public static void main(String[] args) {

		UserUtilis.displayMenu();
		
	}
}

