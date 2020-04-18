CREATE DATABASE softuni;

USE softuni;
-- 1. Create Table
CREATE TABLE students (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  first_name VARCHAR(50) NULL,
  last_name VARCHAR(50) NULL,
  age INT NULL,
  grade DOUBLE NULL);

-- 2. Insert Data
INSERT INTO students (id, first_name, last_name, age, grade)
VALUES (1, "Guy", "Gilbert", 15, 4.5),
	   (2, "Kevin", "Brown", 17, 5.4),
       (3, "Roberto", "Tamburello", 19, 6),
       (4, "Linda", "Smith", 18, 5),
       (5, "John", "Stones", 16, 4.25),
       (6, "Nicole", "Nelson", 17, 5.5);
       
 -- 3.	Find All Records      
SELECT * FROM students;
       
-- 4. Find Last Name, Age and Grade       
SELECT last_name, age, grade  FROM students;
       
-- 5. Find First 5 Records
SELECT * FROM students LIMIT 5; 
       
-- 6. Find first 5 Last Name and Grade    
SELECT last_name, grade FROM students LIMIT 5;
  
-- 7. Truncate Table
TRUNCATE students;

-- 8. Drop Table
DROP TABLE students;

-- 9. Drop Database
DROP DATABASE softuni;
