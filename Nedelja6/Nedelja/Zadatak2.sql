SELECT dependents.first_name, dependents.last_name FROM dependents
INNER JOIN employees ON dependents.dependent_id = employees.department_id
WHERE salary IN (SELECT MAX(salary) FROM employees)
