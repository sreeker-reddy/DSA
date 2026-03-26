-- Last updated: 3/26/2026, 1:49:15 AM
# Write your MySQL query statement below

Select S.id, S.name from Students S where department_id not in(
select id from departments
)