DROP database IF EXISTS emp_DB;

CREATE database IF NOT EXISTS emp_DB;
use emp_DB;

CREATE TABLE EMPLOYEE (
	EmpId int NOT NULL AUTO_INCREMENT,
	EmpName varchar(32) DEFAULT NULL,
	DOB varchar(32) DEFAULT NULL,
	Salary int DEFAULT NULL,
	Age int DEFAULT NULL,
	PRIMARY KEY (EmpId)
 ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
 
 INSERT INTO EMPLOYEE (EmpId, EmpName, DOB, Salary, Age) VALUES (1, 'Jerry', '01/07/1996', 6000, 26);
 INSERT INTO EMPLOYEE (EmpId, EmpName, DOB, Salary, Age) VALUES (2, 'Sarah', '02/17/1995', 7500, 26);