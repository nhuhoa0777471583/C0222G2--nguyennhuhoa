create database quan_li_ban_hang;
use quan_li_ban_hang;

insert into customer  value
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);
select*from customer;

insert into order_customer  value
(1,1,3/21/2006,null),
(2,2,3/23/2006,null),
(3,1,3/16/2006,null);
select*from order_customer;

insert into product  value
(1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);
select*from product;

insert into order_detail  value
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
select*from order_detail;

-- Hiển thị các thông tin  gồm oID, oDate, oPrice
select id_order,date_o,total_price_o
from order_customer;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select
order_detail.id_order, 
customer.name_customer,
product.name_product
from customer
join order_customer on customer.id_customer=order_customer.id_customer
join order_detail on order_customer.id_customer=order_detail.id_order
join product on product.id_product=order_detail.id_product;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

select customer.name_customer
from customer
join order_detail on customer.id_customer= order_detail.id_product;



