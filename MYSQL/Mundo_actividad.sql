select countries.name, languages.language, languages.percentage 
from countries 
join languages on countries.id=languages.country_id 
where language= 'Slovene' order by percentage desc;

select countries.name, count(cities.id) as ciudades 
from countries 
join cities on countries.id = cities.country_id 
group by countries.id order by count(cities.id) desc;

select cities.name as "Ciudades de Mexico",cities.population as Población 
from cities 
where (cities.country_id=136) and (cities.population > 500000) order by population desc;

select countries.name as País, languages.language as Idioma, languages.percentage as Porcentaje 
from countries 
join languages on countries.id= languages.country_id 
where percentage >89 order by percentage desc;

select countries.name as País, countries.surface_area as Superficie, countries.population as Poblacion 
from countries 
where (countries.surface_area <501) and (countries.population > 100000);

select countries.name as País, countries.government_form as "Forma de gobierno", countries.life_expectancy as "Expectativas de vida" 
from countries 
where (countries.government_form='Constitutional Monarchy') and (countries.life_expectancy>75);

select countries.name as País, cities.name as Ciudad, cities.district as Distrito, cities.population as Poblacion 
from countries 
join cities on countries.id=cities.country_id 
where (cities.district='Buenos Aires') and (cities.population > 500000);

select countries.region as Region, count(countries.id) as Paises 
from countries 
group by countries.region order by count(countries.id) desc;