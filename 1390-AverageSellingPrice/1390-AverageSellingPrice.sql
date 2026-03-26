-- Last updated: 3/26/2026, 1:49:45 AM
# Write your MySQL query statement below
Select A.product_id, Round(Sum(A.price)/(Sum(A.Units)),2) As average_price
FROM (
    Select P.product_id, (price*Units) As price , U.Units
    From Prices P, UnitsSold U
    Where P.product_id = U.product_id
    And U.purchase_date >= P.Start_date AND U.purchase_date <= P.end_Date 
    Group by P.product_id,purchase_date
) A
Group by A.product_id