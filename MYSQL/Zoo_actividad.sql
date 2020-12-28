-- Select basic
-- Actividad 1
SELECT world.population FROM world
  WHERE name = 'Germany';
-- Actividad 2
SELECT name, population FROM world
  WHERE name IN ('Sweden', 'Norway','Denmark');
-- Actividad 3
SELECT name, area FROM world
  WHERE area BETWEEN 200000 AND 250000;

-- Select from World
-- Actividad 1
SELECT name, continent, population FROM world;
-- Actividad 2
SELECT name
  FROM world
 WHERE population > 200000000;
-- Actividad 3
SELECT name, gdp/population
  FROM world
 WHERE population > 200000000;
-- Actividad 4
SELECT name, population/1000000
  FROM world
 WHERE continent='South America';
-- Actividad 5
SELECT name, population
  FROM world
 WHERE name in ('france', 'germany', 'Italy');
-- Actividad 6
SELECT name
  FROM world
 WHERE name like '%United%';
-- Actividad 7
SELECT name, population, area
  FROM world
 WHERE area > 3000000 or population > 250000000;
-- Actividad 8
SELECT name, population, area
  FROM world
 WHERE area > 3000000 xor population > 250000000;
-- Actividad 9
SELECT name, Round(population/1000000,2) as 'Redondeo P', 
 Round(gdp/1000000000,2) as 'redondeo GDP'
 FROM world
 WHERE continent='South America';
-- Actividad 10
SELECT name, round(gdp/population,-3)
FROM world
where gdp > 1000000000000;
-- Actividad 11
SELECT name,capital
  FROM world
 WHERE length(capital)= length(name);
-- Actividad 12
SELECT name, capital
FROM world
where name <> capital and left(capital,1)=left(name,1);
-- Actividad 13
SELECT name
FROM world
WHERE name like '%a%' and name like '%e%' and name like '%i%' and name like '%o%' and name like '%u%' and name not like'% %';

-- Select from Nobel
-- Actividad 1
SELECT yr, subject, winner
  FROM nobel
 WHERE yr = 1950;
-- Actividad 2
SELECT winner
  FROM nobel
 WHERE yr = 1962
   AND subject = 'Literature';
-- Actividad 3
select yr, subject
from nobel
where winner='Albert Einstein' ;
-- Actividad 4
select winner
from nobel
where subject='Peace' and yr>=2000;
-- Actividad 5
select yr, subject, winner
from nobel
where subject='Literature' and yr>=1980 and yr<=1989;
-- Actividad 6
select yr, subject, winner
from nobel
WHERE winner in ('Theodore Roosevelt',
                  'Woodrow Wilson',
                  'Jimmy Carter',
                  'Barack Obama');
-- Actividad 7
select  winner
from nobel
where winner like 'John%';
-- Actividad 8
SELECT yr, subject, winner
from nobel
where subject='Physics' and yr='1980' xor subject='chemistry' and yr='1984';
-- Actividad 9
SELECT yr, subject, winner
from nobel
where yr='1980' and subject <> 'Chemistry' and subject <> 'Medicine';
-- Actividad 10
SELECT yr, subject, winner
from nobel
where subject='Medicine' and yr <1910 xor subject='Literature' and yr>=2004;
-- Actividad 11
SELECT yr, subject, winner
from nobel
where winner='Peter Grünberg';
-- Actividad 12
SELECT yr, subject, winner
from nobel
where winner='Eugene O''Neill';
-- Actividad 13
SELECT winner, yr, subject
from nobel
where winner like 'Sir%' order by yr desc;
-- Actividad 14
SELECT winner, subject 
FROM nobel
WHERE yr='1984'
ORDER BY CASE WHEN subject IN ('Physics','Chemistry') THEN 1 ELSE 0 END, subject,winner;

-- Select in select
-- Actividad 1
SELECT name FROM world
  WHERE population >
     (SELECT population FROM world
      WHERE name='Russia');
-- Actividad 2
select name
from world
where continent='Europe' and gdp/population > (select gdp/population 
from world
where name='United kingdom');
-- Actividad 3
select name, continent
from world
where continent = (select continent 
from world
where name='Argentina') or continent=(select continent 
from world
where name='Australia')
order by name asc;
-- Actividad 4
select name, population
from world
where population >( select population
from world
where name='Canada') and population<( select population
from world
where name='Poland')
-- Actividad 5
select name, Concat(Round(100*population/(select population
         from world
         where name='Germany')),'%')
from world
where continent='Europe';
-- Actividad 6
select name
from world
where gdp > all( select gdp
from world
where  continent='Europe' and gdp>0)
-- Actividad 7
SELECT continent, name, area FROM world x
  WHERE area >= ALL
    (SELECT area FROM world y
        WHERE y.continent=x.continent
          AND area>0);
-- Actividad 8
select continent, (select name from world as B where B.continent=A.continent limit 1)
from world as A
group by continent
order by continent asc;
-- Actividad 9
-- Actividad 10

SUM AND COUNT
-- Actividad 1
SELECT SUM(population) 
FROM world;
-- Actividad 2
select distinct continent
from world
-- Actividad 3
select sum(gdp)
from world
where continent='Africa';
-- Actividad 4
select count(name)
from world
where area>=1000000;
-- Actividad 5
select sum(population)
from world
where name in ('Estonia', 'Latvia', 'Lithuania');
-- Actividad 6
select continent, count(name)
from world
group by continent;
-- Actividad 7
select continent, count(name)
from world
where population>=10000000
group by continent;
-- Actividad 8


Join
-- Actividad 1
select matchid, player from goal
 where teamid='GER';
-- Actividad 2
SELECT distinct id,stadium,team1,team2
  FROM game
join goal on matchid=id
where id=1012;
-- Actividad 3
SELECT player,teamid, stadium, mdate
  FROM game JOIN goal ON (id=matchid)
where teamid='GER';
-- Actividad 4
select team1, team2, player
from goal
join game on id=matchid
where player like 'Mario%';
-- Actividad 5
SELECT player, teamid, coach,gtime
  FROM goal 
join eteam on teamid=id
 WHERE gtime<=10;
-- Actividad 6
select mdate, teamname
from game
join eteam on (team1=eteam.id)
where coach='Fernando Santos';
-- Actividad 7
select player
from goal
join game on id=matchid
where stadium='national Stadium, Warsaw';
-- Actividad 8
SELECT player
  FROM game JOIN goal ON matchid = id 
  WHERE (team1='GER' AND team2='GRE') 
  or(team1='GRE' AND team2='GER') and teamid!='GER'; -- REVISAR
-- Actividad 9
SELECT teamname, count(player)
  FROM eteam JOIN goal ON id=teamid
Group BY teamname;
-- Actividad 10
select stadium, count(matchid)
from game
join goal on id=matchid
group by stadium;
-- Actividad 11
SELECT matchid,mdate,count(teamid)
FROM goal 
JOIN game on matchid=id
WHERE team1='POL' OR team2='POL'
group by matchid, mdate;
-- Actividad 12
select matchid, mdate, count (teamid)
FROM goal 
JOIN game on matchid=id
WHERE teamid='GER'
group by matchid, mdate;
-- Actividad 13
SELECT mdate,team1,
  CASE WHEN teamid=team1 THEN 1 ELSE 0 END score1, 
  team2, 
  case when teamid=team2 THEN 1 ELSE 0 END score2
  FROM game JOIN goal ON matchid = id-- CORREGIR
  
MORE JOIN
-- Actividad 1
SELECT id, title
 FROM movie
 WHERE yr=1962;
-- Actividad 2
select yr
from movie
where title='Citizen kane';
-- Actividad 3
select id, title, yr
from movie
where title like 'Star Trek%'
order by yr asc;
-- Actividad 4
select id
from actor
where name='Glenn Close';
-- Actividad 5
select id
from movie
where title='Casablanca';
-- Actividad 6
select name
from casting
join actor on actorid=id
where movieid=11768;
-- Actividad 7
select name
from casting
inner join actor on actorid=id
where movieid=10522;
-- Actividad 8
select title
from movie
join casting on movieid=id
where actorid=2216;
-- Actividad 9
select title
from movie
join casting on movieid=id
where actorid=2216 and ord<>1 ;
-- Actividad 10
select title,name
from casting
inner join actor on actorid=actor.id
inner join movie on movieid=movie.id
where yr=1962 and ord=1;
-- Actividad 11
SELECT yr,COUNT(title)  FROM
  movie JOIN casting ON movie.id=movieid
        JOIN actor   ON actorid=actor.id
WHERE name='Rock Hudson'
GROUP BY yr
HAVING COUNT(title) > 2; --- Explicacion!!!!
-- Actividad 12
SELECT title, name
FROM movie
join casting on (movieid=movie.id and ord=1)
join actor on (actorid=actor.id)
WHERE movieid IN (
  SELECT movieid FROM casting
  WHERE actorid in( select id
from actor
where name='Julie Andrews'));-- Explicacion!!!!
-- Actividad 13

-- Actividad 14
select title,count(actorid)
from casting
inner join actor on actorid=actor.id
inner join movie on movieid=movie.id
where yr=1978 
group by title
order by count(actorid) desc, title asc;
-- Actividad 15
select name
from casting
inner join actor on actorid=actor.id
where movieid IN (
  SELECT movieid FROM casting
  WHERE actorid in ( select id
from actor
where name='Art Garfunkel' and ));-- Quitar a garfunkel

Using NULL
-- Actividad 1
select name
from teacher
where dept is null;
-- Actividad 2
SELECT teacher.name, dept.name
 FROM teacher INNER JOIN dept
           ON (teacher.dept=dept.id);
-- Actividad 3
select teacher.name, dept.name
from teacher
left join dept on dept=dept.id;
-- Actividad 4

-- Actividad
-- Actividad
-- Actividad
-- Actividad
-- Actividad
-- Actividad

SELF JOIN
-- Actividad 1
select count(*)
from stops
-- Actividad 2
select id
from stops
where name='Craiglockhart'
-- Actividad 3
select id, name
from stops
join route on stops.id=route.stop
where company='LRT' and num='4';
-- Actividad 4
SELECT company, num, COUNT(*)
FROM route WHERE stop=149 OR stop=53
GROUP BY company, num
HAVING COUNT(*) > 1;
-- Actividad 5
SELECT a.company, a.num, a.stop, b.stop
FROM route a JOIN route b ON
  (a.company=b.company AND a.num=b.num)
WHERE a.stop=53 and b.stop=149;
-- Actividad 6
SELECT a.company, a.num, stopa.name, stopb.name
FROM route a JOIN route b ON
  (a.company=b.company AND a.num=b.num)
  JOIN stops stopa ON (a.stop=stopa.id)
  JOIN stops stopb ON (b.stop=stopb.id)
WHERE stopa.name='Craiglockhart' and stopb.name='London Road';
-- Actividad 7
SELECT distinct a.company, a.num 
FROM route a JOIN route b ON
  (a.company=b.company AND a.num=b.num)
  JOIN stops stopa ON (a.stop=stopa.id)
  JOIN stops stopb ON (b.stop=stopb.id)
WHERE stopa.name='Haymarket' and stopb.name='Leith';
-- Actividad 8
SELECT distinct a.company, a.num 
FROM route a JOIN route b ON
  (a.company=b.company AND a.num=b.num)
  JOIN stops stopa ON (a.stop=stopa.id)
  JOIN stops stopb ON (b.stop=stopb.id)
WHERE stopa.name='Craiglockhart'  and stopb.name='Tollcross';
-- Actividad 9

-- Actividad