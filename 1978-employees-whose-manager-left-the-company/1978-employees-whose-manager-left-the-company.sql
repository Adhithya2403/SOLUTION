select e.employee_id from Employees e 
where e.manager_id is not null and 
e.manager_id not in(select employee_id from employees) 
and e.salary <30000 order by e.employee_id ;