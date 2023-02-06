-- https://leetcode.com/problems/rank-scores/description/
create table Scores
(
    id    int,
    score decimal
);

insert into Scores
values (1, 3.50);
insert into Scores
values (2, 3.65);
insert into Scores
values (3, 4.00);
insert into Scores
values (4, 3.85);
insert into Scores
values (5, 4.00);
insert into Scores
values (6, 3.65);


select score,
       dense_rank() over (order by score desc ) as rank
from Scores
order by score desc;

drop table Scores;
