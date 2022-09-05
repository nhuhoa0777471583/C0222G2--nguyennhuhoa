use thi_module_6;

INSERT INTO `position` (`id`, `name_position`) VALUES 
(1, 'Quản Lí'),
(2, 'Nhân Viên');

INSERT INTO `employee` (`id`, `code_employee`,`name`, `id_position`) VALUES 
(1, 'E-01','Hòa', 1),
(2, 'E-01','Bảo', 1),
(3, 'E-01','Tuyến', 2),
(4, 'E-01','Tài', 2),
(5, 'E-01','Đảm', 2);

INSERT INTO `book` (`id`, `author`,`category`, `creation_date`) VALUES 
(1, 'Hòa', 'Ma','2022-12-01'),
(2, 'Bảo', 'Thiếu Nhi','2022-12-01'),
(3, 'Phúc', 'Báo','2022-12-01');

INSERT INTO `drink` (`id`, `made_in`, `yes_no_gas`) VALUES 
(1, 'VN', 'có gas'),
(2, 'TQ', 'không có gas');

INSERT INTO `food` (`id`, `care_sugar_or_salty`, `made_in`) VALUES 
(1, 'bánh ngọt', 'VN'),
(2, 'bánh mặn', 'TQ');

INSERT INTO `product_type` (`id`, `id_book`, `id_drink`, `id_food`) VALUES 
(1, 1, 1, 1),
(2, 1, 2, 2),
(3, 2, 1, 1);


INSERT INTO `product` (`id`, `code_product`, `creation_date`, `price`, `status_product`,`is_deleted`, `id_product_type`) VALUES 
(1, 'P-001', '2022-02-01', '100', 'còn',0, 1),
(2, 'P-002', '2022-02-01', '100', 'còn',0, 2),
(3, 'P-003', '2022-02-01', '100', 'còn',0, 3);

INSERT INTO `product` ( `code_product`, `creation_date`, `price`, `status_product`,`is_deleted`, `id_product_type`) VALUES 
( 'P-004', '2022-02-01', '100', 'còn',0, 1),
( 'P-005', '2022-02-01', '100', 'còn',0, 2),
( 'P-006', '2022-02-01', '100', 'còn',0, 3),
( 'P-007', '2022-02-01', '100', 'còn',0, 1),
( 'P-007', '2022-02-01', '100', 'còn',0, 2),
( 'P-009', '2022-02-01', '100', 'còn',0, 3),
( 'P-0010', '2022-02-01', '100', 'còn',0, 3);

INSERT INTO `order_product` (`id`, `code_service`, `cost`, `date_order`, `name_customer`, `id_product`) VALUES 
(1, 'O-1111', 2, '2022-08-24', 'Hòa', 1),
(2, 'O-222', 4, '2022-08-24', 'Bảo', 2),
(3, 'O-211', 2, '2022-08-24', 'Tuyến', 1);



select * from product;




