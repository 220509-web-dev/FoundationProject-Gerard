/*
This table will archieve data from your favorite video games. 
*/

create schema favorite_videogames;

set search_path to favorite_videogames;

create table users (
id		int generated always as identity,
first_name	varchar(255), 
last_name 	varchar(255), 
email 		varchar(255), 
user_name 	varchar(255),

primary key (id)

);

/usr/lib/postgresql/14/bin/psql