--Task 1729. Find Followers Count
--https://leetcode.com/problems/find-followers-count
create table Followers
(
    user_id     int,
    follower_id int
);

insert into Followers
values (0, 1);
insert into Followers
values (1, 0);
insert into Followers
values (2, 0);
insert into Followers
values (2, 1);


select user_id, count(follower_id) as followers_count
from Followers
group by user_id
order by user_id;



drop table Followers;
