use sakila;

/*5.1*/

select c.first_name, c.last_name, a.address, ct.city 
from customer c
inner join address a 
on c.address_id = a.address_id 
inner join city ct 
on a.city_id = ct.city_id 
where a.district = 'California';

/*5.2*/

select film.title
from film  
inner join film_actor  
on film.film_id = film_actor.film_id 
inner join actor  
on actor.actor_id = film_actor.actor_id 
where actor.first_name = 'JOHN';

/*5.3*/

select a.city_id, a.address, ad.address
from address a 
inner join address ad 
on a.city_id = ad.city_id and a.address <> ad.address 
group by a.city_id;

/*Запросы к своей базе данных*/

/*1 запрос*/

use sitilink;

select t.id_tovara, t.artikul, t.cena, d.id_categorias_dostavki, d.categoria_dostavki 
from  tovars t  
inner join categorias_dostavki d 
on d.categoria_dostavki = d.categoria_dostavki 
inner join tovars c  
on t.cena = t.cena
where  t.cena < 10000 limit 40;

/*2 запрос*/

select s.id_Sotrudnika, s.FIO, s.birthday, d.Nazvanie_doljnosti 
from  sotrudniki s  
inner join doljnoctii d 
on d.Nazvanie_doljnosti = d.Nazvanie_doljnosti 
where d.Nazvanie_doljnosti in ('menedjer','yborshik');