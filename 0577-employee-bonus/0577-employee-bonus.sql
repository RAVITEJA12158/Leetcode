-- Write your PostgreSQL query statement below
SELECT e.name,b.bonus
FROM Employee e
LEFT JOIN Bonus b ON e.empId=b.empId
WHERE b.Bonus<1000 or b.Bonus IS NULL;