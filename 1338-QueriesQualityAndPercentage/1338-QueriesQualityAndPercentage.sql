-- Last updated: 3/26/2026, 1:49:57 AM
# Write your MySQL query statement below


select
A.query_name,
round(sum(A.rating / A.position) / count(A.query_name),2) as quality,
round(avg(A.poor)*100,2) as poor_query_percentage

from(
select
query_name,
rating,
position,
case when rating < 3 then 1 else 0 end as poor
from Queries
) as A

group by A.query_name

