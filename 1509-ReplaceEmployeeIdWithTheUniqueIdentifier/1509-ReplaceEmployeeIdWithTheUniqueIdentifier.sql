-- Last updated: 3/26/2026, 1:55:01 AM
# Write your MySQL query statement below
Select unique_id, name from 
Employees E left Outer Join EmployeeUNI U
ON E.id = U.id