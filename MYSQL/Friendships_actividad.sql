select users.first_name, users.last_name, user2.first_name as Amigos, user2.last_name
from users 
left join friendships on friendships.user_id=users.id
left join users as user2 on friendships.friend_id=user2.id;

select users.first_name, users.last_name, user2.first_name as Amigos, user2.last_name
from users 
left join friendships on friendships.user_id=users.id
left join users as user2 on friendships.friend_id=user2.id
where users.id=4;

select us.first_name, count(amigos.friend_id)
from users us 
join friendships amigos on us.id=amigos.user_id
group by us.id;

select conteo.first_name, max(amistades) from (
select us.first_name, count(amigos.friend_id) AS amistades
from users us 
join friendships amigos on us.id=amigos.user_id
group by us.id) as conteo ;

insert into users(id,first_name,last_name) values (10,'Joselyn','Castro');
insert into friendships (id,user_id, friend_id) value (7, 10, 2);
insert into friendships (id,user_id, friend_id) value (8, 10, 4);
insert into friendships (id,user_id, friend_id) value (9, 10, 5);
insert into friendships (id,user_id, friend_id) value (10, 2, 10);

select users.first_name, users.last_name, user2.first_name as Amigos, user2.last_name
from users 
left join friendships on friendships.user_id=users.id
left join users as user2 on friendships.friend_id=user2.id
where users.id=2 order by Amigos asc;

delete from friendships where friendships.friend_id=5 and friendships.user_id=2;
-- insert into friendships (id,user_id, friend_id) value (5, 2, 5);

select users.first_name, users.last_name, user2.first_name as Nombre_amigo, user2.last_name
from users 
left join friendships on friendships.user_id=users.id
left join users as user2 on friendships.friend_id=user2.id;