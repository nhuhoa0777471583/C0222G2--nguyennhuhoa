create database quan_li_ban_hang;

use quan_li_ban_hang;

create table customer
(id_customer int primary key,
name_customer varchar(50),
age int );

create table order_customer
(id_order int primary key,
id_customer int,
date_o date,
total_price_o double,
foreign key(id_customer) references customer(id_customer));


create table product
(id_product int primary key,
name_product varchar(50),
product_price double);

create table order_detail
(id_order int ,
id_product int ,
order_qty int,
foreign key(id_order) references order_customer(id_order),
foreign key(id_product) references product(id_product)
);

