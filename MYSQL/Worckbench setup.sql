create table compra(
id  int,
producto varchar(255),
precio varchar(255),
created_at datetime,
update_at datetime
);
create table compras(
id  int,
producto varchar(255),
precio varchar(255),
created_at datetime,
update_at datetime
);
select* from compras;
select precio from compras;
drop table compra;
select*from users;
delete from users where id=1;
update users set first_name = "Joselyn", last_name="Castro" where id ="2";
insert users(id, last_name, first_name) values ("6", "Ignacia", "Sepulveda");
select*from users;
insert compras (id, producto, precio) values ("6", "Ignacia", "1000");
insert compras (id, producto, precio) values ("6", "Ignacia", "1000");
select*from compras;
delete from compras where id=6;













