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



