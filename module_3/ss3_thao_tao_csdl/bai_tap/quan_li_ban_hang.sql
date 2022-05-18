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
product.name_product
from customer
join order_customer on customer.id_customer=order_customer.id_customer
join order_detail on order_customer.id_order=order_detail.id_order
join product on product.id_product=order_detail.id_product;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select
customer.name_customer 
from customer
left join order_customer on customer.id_customer = order_customer.id_customer
where order_customer.id_order is null;

select *from customer;
select *from order_customer;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)

select 
order_customer.id_order,
order_customer.date_o,
(order_detail.order_qty * product.product_price) as tong_tien
from order_customer
join order_detail on order_customer.id_order= order_detail.id_order
join product on order_detail.id_product= product.id_product
;

select*from order_detail;