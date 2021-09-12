SELECT country_name FROM countries
INNER JOIN locations ON countries.country_id = locations.country_id
INNER JOIN departments ON locations.location_id = departments.location_id
INNER JOIN employees ON departments.department_id = employees.department_id
GROUP BY countries.country_name
ORDER BY SUM (salary) DESC;
