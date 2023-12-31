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


-------odev4----------

select distinct replacement_cost from film;

select count(distinct replacement_cost) from film;

select count(*)from film where like title 'T%' and rating='G';

select count(*)where length(country) =5);

select count (*) where like city_name '%R';



------ODEV5---------------

select * from film where like title '%M' order by lenght(title) limit 5;

select * from film where like title '%M' order by length(title) desc offset 5;

select * from customer where store_id=4 order by last_name desc limit 4;



-----ODEV6-----------

SELECT avg(rental_rate) from film ;

select count(*) from film where film_name like 'C%';

select max(length) from film where rental_rate = 0.99;

select count(distinct replacement_cost) from film where length>150;

----------odev7-----------------

select rating count(*) from film group by rating order by rating desc ;

select replacement_cost , count(*) from film group by replacement_cost having count(*)>50 order by replacement_cost; 


------odev8----------

create table employee (id integer primary key, name VARCHAR(50),birthday date,email VARCHAR(100));

insert employee into (name,birthday,email) values ('melih','20/10/1950','melih@tunc.com');
update employee set ('mahmut','10/10/1999','ihsan@tunc.com') where id =1;
delete employee where name = 'melih';

