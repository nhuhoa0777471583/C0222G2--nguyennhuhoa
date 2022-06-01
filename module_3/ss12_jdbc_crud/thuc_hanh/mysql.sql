create database demo;
use demo;
create table users 
(
id int(3) not null auto_increment,
name varchar(100) not null,
email varchar(100) not null,
country varchar(100) ,
primary key (id)
);
insert into users (name, email, country)value
("hoa","hoa23@gmail.com","Viet Nam"),
("hoa1","hoa23@gmail.com","Trung quoc")