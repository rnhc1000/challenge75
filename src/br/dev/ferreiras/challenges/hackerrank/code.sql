
select concat(Name, concat('(', LEFT(occupation, 1),')')) AS OCCUPATION from
occupations ORDER BY name ASC;

select CONCAT('There are a total of ',count(occupation)), LOWER(CONCAT(occupation,('s.'))) from
occupations group by occupation ORDER BY count(occupation) ASC;

SELECT
MIN(IF(Occupation = 'Doctor',Name,NULL)),
MIN(IF(Occupation = 'Professor',Name,NULL)),
MIN(IF(Occupation = 'Singer',Name,NULL)),
MIN(IF(Occupation = 'Actor',Name,NULL))
FROM(
    SELECT ROW_NUMBER() OVER(PARTITION BY Occupation
                             ORDER BY Name) AS row_num,
            Name,
            Occupation
    FROM OCCUPATIONS) AS ord
GROUP BY row_num

SELECT N,
CASE WHEN P IS NULL THEN "Root"
     WHEN N IN (SELECT P FROM BST) THEN "Inner"
     ELSE "Leaf"
END
FROM BST
ORDER BY N;

SELECT cy.company_code,cy.founder,
count(distinct lm.lead_manager_code),
count(distinct sm.senior_manager_code),
count(distinct mg.manager_code),
count(distinct ee.employee_code)
FROM Company cy, Lead_Manager lm, Senior_Manager sm, Manager mg, Employee ee
WHERE
cy.company_code=lm.company_code AND
lm.lead_manager_code=sm.lead_manager_code AND
sm.senior_manager_code=mg.senior_manager_code AND
mg.manager_code=ee.manager_code
GROUP BY cy.company_code,cy.founder
ORDER BY cy.company_code ASC