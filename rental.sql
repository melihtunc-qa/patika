select title,description from film;

select * from film where length>60 and length<75;

select * from film where rental_rate=0.99 and (replacement_cost=12.99 or replacement=cost = 28.99);

select * from film where length<50 and not ( rental_rate=2.99 or rental_rate=4.99);

---odev2----


select * from film where replacement_cost between 12.99 and 16.99;

select first_name,last_name from actor where first_name in ('Penelope','Nick','Ed');

select * from film where (rental_rate in(0.99,2.99,4.99)) and (replacement_cost in (12.99,15.99,28.99));

-----odev3---------


select country from country where country like 'A%a';

select country from country where (length>6) and (like '%n');

select title from film where lower(title) like '&t&' or upper(title) like '%T%' limit 4;

select * from film where like 'C%' and (length>90 and rental_rate=2.99);


