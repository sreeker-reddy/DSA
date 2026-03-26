-- Last updated: 3/26/2026, 1:49:33 AM
# Write your MySQL query statement below
select country_name,
CASE WHEN AVG(weather_state)<=15 THEN 'Cold'
WHEN AVG(weather_state)>=25 THEN 'Hot' 
ELSE 'Warm' END as weather_type from
Countries C, Weather W
Where C.country_id = W.country_id
And day between '2019-11-01' and '2019-11-30'
Group by W.country_id