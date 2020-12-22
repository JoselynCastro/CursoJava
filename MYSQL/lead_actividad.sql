Select monthname(charged_datetime) as mes, Sum(amount) as Total
from billing
where charged_datetime >= '2012/03/01' and charged_datetime <= '2012/03/31';

Select billing.client_id, Sum(amount) as Total
from billing
where client_id=2;

select sites.domain_name as Dominios, sites.client_id as Cliente
from sites
where sites.client_id=10;

select sites.client_id, count(domain_name) as Dominios, monthname(created_datetime)as mes,  year(created_datetime) as año
from sites
where sites.client_id=1 group by mes;
select sites.client_id, count(domain_name) as Dominios, monthname(created_datetime)as mes,  year(created_datetime) as año
from sites
where sites.client_id=20 group by mes;

select domain_name as Dominio, count(leads_id) as 'Clientes Potenciales', Date_format(registered_datetime,'%M/%d/%y')
from sites
left join leads on leads.site_id = sites.site_id
where registered_datetime >= '2011/01/01' and registered_datetime <= '2011/02/15' group by leads_id; 

select concat(clients.first_name," ",clients.last_name) as Cliente, count(leads_id) as 'Clientes Potenciales'
from clients
inner join sites on clients.client_id= sites.client_id
inner join leads on leads.site_id=sites.site_id
where registered_datetime >= '2011/01/01' and registered_datetime <= '2011/12/31' group by Cliente;

select concat(clients.first_name," ",clients.last_name) as Cliente, monthname(registered_datetime)as mes, count(leads_id) as 'Clientes Potenciales'
from clients
inner join sites on clients.client_id= sites.client_id
inner join leads on leads.site_id=sites.site_id
where registered_datetime >= '2011/01/01' and registered_datetime <= '2011/06/31' group by leads_id;

select concat(clients.first_name," ",clients.last_name) as Cliente, domain_name as Dominio,Date_format(registered_datetime,'%M-%d-%y') as Registro, count(leads_id) as 'Clientes Potenciales'
from clients
inner join sites on clients.client_id= sites.client_id
inner join leads on leads.site_id=sites.site_id
where registered_datetime >= '2011/01/01' and registered_datetime <= '2011/12/31' group by Dominio order by clients.client_id asc;

select concat(clients.first_name," ",clients.last_name) as Cliente, domain_name as Dominio,count(leads_id) as 'Clientes Potenciales'
from clients
inner join sites on clients.client_id= sites.client_id
inner join leads on leads.site_id=sites.site_id
group by Dominio order by clients.client_id asc;

Select concat(clients.first_name," ",clients.last_name) as Cliente,year(charged_datetime) as Año, monthname(charged_datetime) as Mes, SUM(amount) as Total
from billing
inner join clients on clients.client_id=billing.client_id
group by Año, Mes, clients.client_id
order by clients.client_id asc; -- corregir

select concat(clients.first_name," ",clients.last_name) as Cliente, group_concat(domain_name,' ','/') as Dominio
from clients
inner join sites on clients.client_id= sites.client_id
group by Cliente
order by clients.client_id asc;