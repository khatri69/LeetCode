# Write your MySQL query statement below
Select E1.name as Employee
from Employee E1
Join Employee E2
ON E1.managerId = E2.id
Where E1.salary > E2.salary;