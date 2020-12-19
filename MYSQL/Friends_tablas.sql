- MySQL dump 10.13 Distrib 5.7.12, para Win64 (x86_64)
-
- Anfitrión: localhost Base de datos: amigos
- ------------------------------------------------ ------
- Versión del servidor 5.7.19

/ *! 40101 SET @OLD_CHARACTER_SET_CLIENT = @@ CHARACTER_SET_CLIENT * /;
/ *! 40101 SET @OLD_CHARACTER_SET_RESULTS = @@ CHARACTER_SET_RESULTS * /;
/ *! 40101 SET @OLD_COLLATION_CONNECTION = @@ COLLATION_CONNECTION * /;
/ *! 40101 ESTABLECER NOMBRES utf8 * /;
/ *! 40103 SET @OLD_TIME_ZONE = @@ TIME_ZONE * /;
/ *! 40103 SET TIME_ZONE = '+ 00:00' * /;
/ *! 40014 SET @OLD_UNIQUE_CHECKS = @@ UNIQUE_CHECKS, UNIQUE_CHECKS = 0 * /;
/ *! 40014 SET @OLD_FOREIGN_KEY_CHECKS = @@ FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 * /;
/ *! 40101 SET @OLD_SQL_MODE = @@ SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' * /;
/ *! 40111 SET @OLD_SQL_NOTES = @@ SQL_NOTES, SQL_NOTES = 0 * /;

-
- Estructura de la mesa para la mesa "amistades"
-

DROP TABLE SI EXISTE "amistades";
/ *! 40101 SET @saved_cs_client = @@ character_set_client * /;
/ *! 40101 SET character_set_client = utf8 * /;
CREAR TABLA `amistades` (
  `id` int (11) NOT NULL AUTO_INCREMENT,
  `user_id` int (11) DEFAULT NULL,
  `friend_id` int (11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  CLAVE PRIMARIA (`id`),
  CLAVE `user_id_idx` (` user_id`),
  CLAVE `friend_id_idx` (` friend_id`)
) ENGINE = MyISAM AUTO_INCREMENT = 7 CHARSET POR DEFECTO = latin1;
/ *! 40101 SET character_set_client = @saved_cs_client * /;

-
- Volcado de datos para la tabla "amistades"
-

BLOQUEAR TABLAS `amistades` ESCRIBIR;
/ *! 40000 ALTER TABLE `amistades` DESHABILITAR TECLAS * /;
INSERTAR EN LOS VALORES de `amistades` (1,1,2, '2019-02-08 11: 13: 27', NULL), (2,1,3, '2019-02-08 11: 14: 03', NULL ), (3,1,4, '2019-02-08 11: 14: 38', NULL), (4,2,4, '2019-02-08 11: 15: 11', NULL), (5 , 2,5, '2019-02-08 11: 15: 23', NULL), (6,5,3, '2019-02-08 11: 16: 02', NULL);
/ *! 40000 ALTER TABLE `amistades` HABILITAR TECLAS * /;
DESBLOQUEAR TABLAS;

-
- Estructura de tabla para la tabla `usuarios`
-

DROP TABLE IF EXISTS `users`;
/ *! 40101 SET @saved_cs_client = @@ character_set_client * /;
/ *! 40101 SET character_set_client = utf8 * /;
CREAR TABLA `usuarios` (
  `id` int (11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar (45) DEFAULT NULL,
  `last_name` varchar (45) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  CLAVE PRIMARIA (`id`)
) ENGINE = MyISAM AUTO_INCREMENT = 6 CHARSET POR DEFECTO = latin1;
/ *! 40101 SET character_set_client = @saved_cs_client * /;

-
- Volcado de datos para la tabla `usuarios`
-

BLOQUEAR TABLAS `usuarios` ESCRIBIR;
/ *! 40000 ALTER TABLE `usuarios` DESHABILITAR TECLAS * /;
INSERT INTO `users` VALUES (1, 'Amy', 'Giver', '2019-02-08 11: 12: 11', NULL), (2, 'Eli', 'Byers', '2019-02-08 11: 12: 11 ', NULO), (3,' Grande ',' Pájaro ',' 2019-02-08 11: 12: 11 ', NULO), (4,' Kermit ',' La rana ',' 2019-02-08 11:12: 11 ', NULL), (5,' Marky ',' Mark ',' 2019-02-08 11: 12: 11 ', NULL);
/ *! 40000 ALTER TABLE `usuarios` ENABLE KEYS * /;
DESBLOQUEAR TABLAS;
/ *! 40103 SET TIME_ZONE = @ OLD_TIME_ZONE * /;

/ *! 40101 SET SQL_MODE = @ OLD_SQL_MODE * /;
/ *! 40014 SET FOREIGN_KEY_CHECKS = @ OLD_FOREIGN_KEY_CHECKS * /;
/ *! 40014 SET UNIQUE_CHECKS = @ OLD_UNIQUE_CHECKS * /;
/ *! 40101 SET CHARACTER_SET_CLIENT = @ OLD_CHARACTER_SET_CLIENT * /;
/ *! 40101 SET CHARACTER_SET_RESULTS = @ OLD_CHARACTER_SET_RESULTS * /;
/ *! 40101 SET COLLATION_CONNECTION = @ OLD_COLLATION_CONNECTION * /;
/ *! 40111 SET SQL_NOTES = @ OLD_SQL_NOTES * /;

- Volcado completado el 2019-02-08 11:20:17