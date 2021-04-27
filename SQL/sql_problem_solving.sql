-- 1) SELECT UNIQUE CITY NAMES WITH EVEN ID VALUES
SELECT DISTINCT station.city FROM station WHERE MOD(station.id, 2) = 0;

-- 2) SUBTRACT NUMBER OF ALL UNIQUE CITIES FROM NUMBER OF ALL CITIES (works in oracle)
SELECT COUNT(city) - COUNT(distinct city) FROM station;

-- 3) SELECT TWO CITY NAMES WITH SHORTEST AND LONGEST NAMES ORDERED IN ALPHABETICAL ORDER
SELECT  city, CHAR_LENGTH(city)
FROM station
WHERE length(city) = (select min(length(city)) FROM station)
ORDER BY city ASC
LIMIT 1;

SELECT  city, CHAR_LENGTH(city)
FROM station
WHERE length(city) = (select max(length(city)) from station)
LIMIT 1;

/* 4) Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. 
      Your result cannot contain duplicates.*/
SELECT DISTINCT city 
    FROM station 
    where city LIKE 'a%' 
    OR city like'e%' 
    OR city like'i%' 
    OR city like'o%' 
    OR city like'u%';

/* 5) Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) 
      as both their first and last characters. Your result cannot contain duplicates.*/
-- using regex
SELECT DISTINCT city
FROM   station
WHERE  city RLIKE '^[aeiouAEIOU].*[aeiouAEIOU]$';

/* 6) Query the list of CITY names from STATION that do not start with vowels. 
Your result cannot contain duplicates.*/
-- using regexs
SELECT DISTINCT CITY 
FROM STATION 
WHERE CITY NOT RLIKE '^[aeiouAEIOU].*$';

/* 7) Query the list of CITY names from STATION that do not end with vowels. 
Your result cannot contain duplicates.*/
-- using regexs
SELECT DISTINCT CITY FROM STATION WHERE CITY RLIKE '[^aeiouAEIOU]$';

/* 8) Query the list of CITY names from STATION that either do not start with 
vowels or do not end with vowels. Your result cannot contain duplicates.*/
-- using regexs
SELECT DISTINCT city FROM station WHERE city RLIKE '^[^aeiouAEIOU].*|.*[^AEIOUaeiou]$';

/* 9) Query the list of CITY names from STATION that do not start with 
vowels and do not end with vowels. Your result cannot contain duplicates.*/
-- using regexs
SELECT DISTINCT CITY FROM STATION WHERE CITY RLIKE '^[^aeiouAEIOU].*[^AEIOUaeiou]$';

/* 10) Query the Name of any student in STUDENTS who scored higher than 75
 Marks. Order your output by the last three characters of each name. 
 If two or more students both have names ending in the same 
 last three characters (i.e.: Bobby, Robby, etc.), 
 secondary sort them by ascending ID.*/
https://www.w3schools.com/mysql/func_mysql_right.asp
SELECT NAME FROM STUDENTS WHERE Marks > 75 ORDER BY RIGHT(NAME, 3), ID ASC;

/* 11) Write a query that prints a list of employee names
 (i.e.: the name attribute) from the Employee table in alphabetical order.*/
SELECT name FROM employee order by name

/* 12) Write a query that prints a list of employee names 
(i.e.: the name attribute) for employees in Employee having a salary greater than 2000
 per month who have been employees for less than 10 months. 
 Sort your result by ascending employee_id.*/
SELECT NAME FROM EMPLOYEE WHERE SALARY > 2000 AND MONTHS < 10 ORDER BY EMPLOYEE_ID ASC

/* 13)Query the following two values from the STATION table:

  #1 The sum of all values in LAT_N rounded to a scale of  decimal places.
  #2 The sum of all values in LONG_W rounded to a scale of  decimal places.*/
SELECT ROUND(SUM(LAT_N), 2), ROUND(SUM(LONG_W), 2) FROM STATION;

/* 14) Query the sum of Northern Latitudes (LAT_N) from STATION having values 
greater than  387880 and less than 137.2345. Truncate your answer to 4 decimal places*/
 https://www.w3schools.com/sql/sql_between.asp
 https://www.sqltutorial.org/sql-math-functions/sql-truncate/#:~:text=Overview%20of%20SQL%20TRUNCATE()%20function&text=The%20TRUNCATE()%20function%20returns,left%20to%20the%20decimal%20point.
SELECT TRUNCATE(SUM(LAT_N), 4) FROM STATION WHERE LAT_N BETWEEN 38.7880 AND 137.2345;

/* 15) Query the greatest value of the Northern Latitudes (LAT_N) from STATION 
that is less than 137.2345. Truncate your answer to 4 decimal places.*/
SELECT TRUNCATE(MAX(LAT_N), 4) FROM STATION WHERE LAT_N < 137.2345;

/* 16) Query the Western Longitude (LONG_W) for the largest Northern 
Latitude (LAT_N) in STATION that is less than . 
Round your answer to  decimal places.*/
https://cutt.ly/qbebXib
SELECT ROUND(LONG_W, 4) FROM STATION WHERE LAT_N < 137.2345 ORDER BY LAT_N DESC LIMIT 1;

/* 17) Query the smallest Northern Latitude (LAT_N) from STATION that is 
greater than 38.7780. Round your answer to 4 decimal places.*/
SELECT ROUND(MIN(LAT_N),4) FROM STATION WHERE LAT_N > 38.7780;

/* 18) Query the Western Longitude (LONG_W)where the smallest 
Northern Latitude (LAT_N) in STATION is greater than 38.7780. 
Round your answer to 4 decimal places.*/
SELECT ROUND(LONG_W, 4) FROM STATION WHERE LAT_N > 38.7780 ORDER BY LAT_N LIMIT 1;





