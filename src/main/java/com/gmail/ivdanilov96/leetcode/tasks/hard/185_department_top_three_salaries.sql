--https://leetcode.com/problems/department-top-three-salaries/description/
create table Employee
(
    id           int,
    name         varchar,
    salary       int,
    departmentId int
);

create table Department
(
    id   int,
    name varchar
);


insert into Employee
values (1, 'Joe', 85000, 1);
insert into Employee
values (1, 'Henry', 80000, 2);
insert into Employee
values (1, 'Sam', 60000, 2);
insert into Employee
values (1, 'Max', 90000, 1);
insert into Employee
values (1, 'Janet', 69000, 1);
insert into Employee
values (1, 'Randy', 85000, 1);
insert into Employee
values (1, 'Will', 70000, 1);

insert into Department
values (1, 'IT');
insert into Department
values (2, 'Sales');


-- my solution
select Department, Employee, Salary
from (select dep.name                                                           as Department,
             emp.name                                                           as Employee,
             emp.salary                                                         as Salary,
             dense_rank() over (partition by departmentId order by salary desc) as top_salary

      from Employee emp
               inner join Department dep on emp.departmentId = dep.id) as top
where top_salary < 4;

-- leetcode solution
SELECT d.Name  AS Department,
       e1.Name AS Employee,
       e1.Salary
FROM Employee e1
         JOIN
     Department d ON e1.DepartmentId = d.Id
WHERE 3 > (SELECT COUNT(DISTINCT e2.Salary)
           FROM Employee e2
           WHERE e2.Salary > e1.Salary
             AND e1.DepartmentId = e2.DepartmentId);

drop table Department;
drop table Employee;