create database demo;
use demo;
create table product
(id int primary key auto_increment,
code_p varchar(10),
name_p varchar(50),
price_p double,
amount_p int,
description_p varchar(50),
status_p varchar(50));

insert into product (code_p,name_p,price_p,amount_p,description_p,status_p)
value
('b1','bánh',10000,10,'bánh ngon','vẫn còn'),
('k2','kẹo',10000,10,' ngon','vẫn còn'),
('s3','sữa',10000,10,' ngon','vẫn còn'),
('c5','coca',10000,10,' ngon','vẫn còn'),
('b5','bia',10000,10,' ngon','vẫn còn');

-- CREATE UNIQUE INDEX index_name ON table_name(column 1, column 2,...);
-- tao index
explain select * from product where id=3;
 create unique index index_product on product(code_p);


explain select * from product where name_p='sữa' and price_p='10000';
 create index index_product2 on product(name_p,price_p);
 
 -- khi chưa tạo index cho name_p,price_p thì phải duyệt qua 5 cột 
 -- sau khi tạo index cho name_p,price_p thì chỉ cần duyệt 1 cột 
  alter table product drop index index_product;
  alter table product drop index index_product2;
select * from index_product;

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view view_product as 
select product.code_p, product.name_p, product.status_p
from product;
-- thêm 1 cột vào view
create or replace view view_product as 
select product.code_p, product.name_p, product.price_p, product.status_p
from product;
-- xoá view
drop view view_product;
-- hiển thị view
select*from view_product;

-- sử dụnng stored procedure 
-- tạo stored procedure 
delimiter //
create procedure get_all_product()
begin 
select * from product;
end; //
delimiter ;
-- gọi stored procedure 
call get_all_product();


-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure add_product
(
in code_add varchar(10),
in name_add varchar(50),
in price_add double,
in amount_add int,
in description_add varchar(50),
in status_add varchar(50) )
begin 
insert into product (code_p,name_p,price_p,amount_p,description_p,status_p)
value
 ( code_add , name_add , price_add , amount_add , description_add , status_add);
end //
delimiter ;
call add_product('11','bánh',10000,10,'bánh ngon','vẫn còn');
call add_product('c6','pesi',20000,200,'good','còn');


-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure edit_product
(in `id_p` int,
in`code_p` varchar(10),
in`name_p` varchar(50),
 in`price_p` double,
 in `amount` int,
in`description` varchar(50),
in`status` varchar(50) )
begin 
update product
set  
code_p = `code_p`,
name_p = `name_p`,
price_p = `price_p` ,
amount_p= `amount`,
description_p=`description`,
status_p= `status`
where id =`id_p`;
end //
delimiter ;
call edit_product(5,'a5','oreo',15000,200,'good','hết');


-- 	 xoá sản phẩm theo id
delimiter //
create procedure delete_product
(in `id_p` int)
begin
delete from  product
where id = `id_p`;
end//
delimiter ;
call delete_product(1);