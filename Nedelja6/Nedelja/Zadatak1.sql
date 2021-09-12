SELECT employees.email, employees.phone_number FROM employees
INNER JOIN departments ON employees.department_id = departments.department_id
INNER JOIN locations ON departments.location_id = locations.location_id
INNER JOIN countries ON locations.country_id = countries.country_id
INNER JOIN regions ON countries.region_id = regions.region_id
WHERE regions.region_id = 1 AND employees.phone_number IS NOT NULL;
