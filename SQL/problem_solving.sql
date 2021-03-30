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
