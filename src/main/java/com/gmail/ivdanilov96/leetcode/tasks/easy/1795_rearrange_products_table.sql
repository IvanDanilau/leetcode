-- Task 1795. Rearrange Products Table
-- desc https://leetcode.com/problems/rearrange-products-table/description/
create table Products
(
    product_id int,
    store1     int,
    store2     int,
    store3     int
);

insert into Products
values (0, 95, 100, 105);
insert into Products
values (1, 70, null, 80);

select *
from Products;

select product_id,
       'store1' as store,
       store1   as price
from Products
where store1 is not Null
union
select product_id,
       'store2' as store,
       store2   as price
from Products
where store2 is not Null
union
select product_id,
       'store3' as store,
       store3   as price
from Products
where store3 is not Null;

drop table Products;