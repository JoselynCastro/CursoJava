mysql -u root -p --iniciar en la consola
CREATE DATEBASE Joselyn_castro; --crea la base de datos
USE nombre_base; --Usa esa base
SHOW databases; --muestra las bases existentes
DROP database nombre_base; --elimina una base de datos
CREATE TABLE nombre_tabla( -- crear tabla
    id INT, --nombre y atributo de la tabla (FILAS)
    nombre VARCHAR(255),
    apellido VARCHAR(255),
);
SHOW TABLES; --muestra las tablas
INSERT INTO nombre_tabla (nombre_columna, nombre_columna,nombre_columna) values ("dato","dato", "dato");
-- inserta valores a una tabla (ejemplos)
    INSERT INTO personas (id, nombre,apellido) VALUES (1, "alexis", "quezada");
    INSERT INTO personas (id, nombre,apellido) VALUES (2, "isra", "palma");

DESCRIBE nombre_tabla; -- DESCRIBE una tabla;

SELECT * FROM nombre_tabla;-- CONSULTA DE REGISTROS
SELECT nombre_columna FROM nombre_tabla;
SELECT nombre_columna, nombre_columna FROM nombre_tabla;

SELECT * FROM nombre_tabla -- FILTRAR
WHERE nombre_columna < dato --where id < 2
;

SELECT * FROM nombre_tabla;
WHERE nombre_columna LIKE '%a%';LIKE --> Semejante a
-- like contine  la "a"
SELECT * FROM personas 
WHERE nombre LIKE 'a%';-- like empieza en "a"

SELECT * FROM personas 
WHERE nombre LIKE '%a';-- like termina en "a"

SELECT * FROM personas 
WHERE apellido LIKE '%alma';---- like termina en "alma"

--Combinar filas de 2 o mas tablas, segun una columna relacionada entre ellas
SELECT nombre_tabla.nombre_columna, nombre_tabla.nombre_columna, nombre_tabla2.nombre_columna --tablas/columnas de las que quiero obtener los datos
FROM nombre_tabla --desde q tabla empiezo
JOIN nombre_tabla ON nombre_tabla.id = nombre_tabla2.id; -- vinculación de tablas (se puede añadir más de un JOIN)

--Combinar filas de 2 o mas tablas????
SELECT nombre_tabla.nombre_columna, nombre_tabla.nombre_columna, nombre_tabla2.nombre_columna --tablas/columnas de las que quiero obtener los datos
FROM nombre_tabla --desde q tabla empiezo
LEFT JOIN nombre_tabla ON nombre_tabla.id = nombre_tabla2.id; -- vinculación de tablas (se puede añadir más de un JOIN)

--Agrupar filas con mismos valores en filas de resumen
Select nombre_tabla.nombre_columna, nombre_tabla.nombre_columna, SUM (nombre_tabla2.nombre_columna -- en esta línea se incluye la operación
from nombre_tabla
JOIN nombre_tabla ON nombre_tabla.id = nombre_tabla2.id;
Group by nombre_tabla.id;

--Agrupar texto
Select GROUP_CONCAT(' ';nombre_tabla.nombre_columna), AS nuevonombre_tabla.nombre_columna, nombre_tabla2.nombre_columna -- ene sta línea se incluye la concatenación
from nombre_tabla
JOIN nombre_tabla ON nombre_tabla.id = nombre_tabla2.id;
Group by nombre_tabla.id;

--
Select COUNT(nombre_tabla.nombre_columna), nombre_tabla.nombre_columna -- 
from nombre_tabla
JOIN nombre_tabla ON nombre_tabla.id = nombre_tabla2.id;
Group by nombre_tabla.id;
