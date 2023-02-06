-- https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/description/
create table ActorDirector
(
    actor_id    int,
    director_id int,
    timestamp   int
);

insert into ActorDirector
values (1, 1, 0);
insert into ActorDirector
values (1, 1, 1);
insert into ActorDirector
values (1, 1, 2);
insert into ActorDirector
values (1, 2, 0);
insert into ActorDirector
values (1, 2, 0);
insert into ActorDirector
values (2, 2, 0);


select actor_id, director_id
from ActorDirector
group by actor_id, director_id
having count(timestamp) > 2;

drop table ActorDirector;
