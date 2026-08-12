-- Write your PostgreSQL query statement below
SELECT e.name AS Employee
FROM Employee e
JOIN Employee e1 ON e.managerId=e1.id
WHERE e.salary>e1.salary;