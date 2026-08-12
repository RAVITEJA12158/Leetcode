# Write your MySQL query statement below
-- SELECT salary AS SecondHighestSalary
-- FROM Employee
-- ORDER BY salary DESC
-- LIMIT 1,1;
SELECT 
    MAX(Salary) AS SecondHighestSalary
FROM Employee
WHERE Salary < (SELECT MAX(Salary) FROM Employee);
