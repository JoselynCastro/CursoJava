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

