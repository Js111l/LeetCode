/* Write your T-SQL query statement below */
SELECT max(Salary) AS 'SecondHighestSalary'
From employee
where Salary<(SELECT MAX(SALARY) FROM EMPLOYEE)
