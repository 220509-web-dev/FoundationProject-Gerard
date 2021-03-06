
drop schema if exists cartoons;
create schema cartoons;




create table cartoons.users (
  id            int generated always as identity,
  first_name    varchar not null,
  last_name     varchar not null,
  email         varchar unique not null,
  username      varchar unique not null check (length(username) >= 4),
  password varchar not null check (length(password) > 0),
 

  constraint users_pk
  primary key (id)
);

insert into cartoons.users values(default, 'Tester', 'Mctest', 'email@email.email','username1','password1');

select * from cartoons.users;



create table categories (
  id    int generated always as identity primary key,
  name  varchar unique not null
);

create table cartoons (
  id                int generated always as identity primary key,
  Title    varchar not null,
  Original_Creator       varchar not null,
  Rating        int default 1 check (Rating > 0 and Rating <= 10),
  Category_Id       int,


  constraint cartoon_category_fk
  foreign key (category_id)
  references categories(id)
);

insert  into categories values(default, 'Kids');
insert into categories values(default,'Teens');
insert into categories values(default, 'Adults');

insert into Cartoons values(default,'Volton','World Event Productions',7,4);
insert into Cartoons values(default,'Ultimate Spider-Man','Brian Micheal Bendis',8,5);
insert into Cartoons values(default,'Batman: The Brave And Bold','Bob Kane and others',9,5);
insert into Cartoons values(default,'Frankenstein jr.','Hanna-Barbera',8,5);
insert into Cartoons values(default,'ThunderCats','Tobin "Ted" Wolf',10,6);
insert into Cartoons values(default,'Avatar: The Last Airbender','Micheal Dante DiMartino, Bryan Konietzko',7,6);
insert into Cartoons values(default,'Steven Universe','Rebecca Sugar',8,4);
insert into Cartoons values(default,'RWBY','Monty Oum, Rooster Teeth',9,4);
insert into Cartoons values(default,'Hi Hi Puffy AmiYumi','Sam Register',7,6);
insert into Cartoons values(default,'Samurai Jack','Genndy Tartakovsky',6,6);
insert into Cartoons values(default,'Powerpuff Girls','Craig McCraken',5,6);
insert into Cartoons values(default,'She-Ra And The Princesses of Power','Noelle Stevenson',4,6);
insert into Cartoons values(default,'Winx Club','Rainbow Group',7,5);
insert into Cartoons values(default,'Castlevania','Warren Ellis',9,6);
insert into Cartoons values(default,'Teen Titans','Glen Murakami',9,6);

insert into users values (default,'Lenord','Williams','lionwilliams@hotmail.com','lionsrule1','bookgeek');
insert into users values (default,'Trevor','Nool','noobie@revature.com','trevorrule','clevertrevor');
insert into users values (default,'Gail','Nool','gailnool@revature.com','gailorider','pailgail');
insert into users values (default,'Alison','Calise','alison@revature.com','alisongive','nicegirl');

select * from "Cartoons".users u ;
select * from "Cartoons";
select * from categories;
select  * from users;
select * from cartoons.users;
drop 
