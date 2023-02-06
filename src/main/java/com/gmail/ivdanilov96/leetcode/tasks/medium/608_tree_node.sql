--608 https://leetcode.com/problems/tree-node/
create table Tree
(
    id   int,
    p_id int
);


insert into Tree
values (1, null);
insert into Tree
values (2, 1);
insert into Tree
values (3, 1);
insert into Tree
values (4, 2);
insert into Tree
values (5, 2);



select distinct par.id                 as id,
                (case
                     when par.p_id is NULL then 'Root'
                     when child.id is NULL then 'Leaf'
                     else 'Inner' end) as type
FROM Tree par
         LEFT join Tree child on par.id = child.p_id;

drop table Tree;