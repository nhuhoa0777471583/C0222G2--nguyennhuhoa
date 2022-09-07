create database demo_sprint_2;

use demo_sprint_2;

create table category (
id int auto_increment primary key,
name varchar(255)
);

create table product (
id int auto_increment primary key,
cost int,
create_date date,
image varchar(255),
`is_deleted` bit(1) default 0,
made_in varchar(255),
name varchar(255),
price double,
price_sale double,
specifications varchar(255),
status_product varchar(255),
`category_id` int default null,
foreign key (`category_id`) references `category` (`id`)
);

INSERT INTO `category` (`id`, `name`) VALUES 
(1,'Laptop'),
(2,'Điện thoại'),
(3,'Tivi'),
(4,'Tủ lạnh'),
(5,'Đồ gia dụng'),
(6,'Đồ điện');


INSERT INTO `product` 
(`id`, `cost`, `create_date`, `image`, `is_delete`, `made_in`, `name`, `price`,`price_sale`,`specifications` ,`status_product`, `id_category`) VALUES 
(1, 100, '2022-03-02', 'https://todaypc.vn/image/catalog/csm-xps-15-left-angle-black-4e2d97a989.jpg', 0, 'TQ', 'Lenovo 14', 20000000,18000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(2, 100, '2022-03-02', 'https://laptop365.vn/pic/product/dell-xps-13-9380-4-1602066716-1_637544748158395295.jpg', 0, 'TQ', 'Acer 14', 20000000,18000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 60 Hz, 300 nits, IPS LCD LED Backlit, True Tone', 'còn hàng', 1),
(3, 100, '2022-03-02', 'https://suanhanh247.com/wp-content/uploads/2021/07/6531_54516_laptop_msi_gaming_ge66_raider_10sfs_474vn_xam_bac_8.jpg', 0, 'TQ', 'Acer 21', 22000000,18000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(4, 100, '2022-03-02', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZJH5RyBNox_HoWlAm57-QuRDVaaPCfa47qAdxAI6R2Fx1eEFXIjeRBlG6BrOFIHP72PA&usqp=CAU', 0, 'TQ', 'Lenovo 22', 20000000,15000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(5, 100, '2022-03-02', 'https://image.thanhnien.vn/w1024/Uploaded/2022/wpxlcqjwq/2022_01_05/xp-s1-6867.jpg', 0, 'TQ', 'HP 14', 5000000,45990000,'15.6 inch, 1920 x 1080 Pixels, IPS, 60 Hz, 300 nits, IPS LCD LED Backlit, True Tone', 'còn hàng', 1),
(6, 100, '2022-03-02', 'https://laptop365.vn/pic/product/dell-xps-13-9380-4-1602066716-1_637544748158395295.jpg', 0, 'TQ', 'HP 16', 10000000,5000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(7, 100, '2022-03-02', 'https://st.quantrimang.com/photos/image/2020/06/24/laptop-hp-tot-nhat-5.jpg', 0, 'TQ', 'HP 18', 21000000,18500000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(8, 100, '2022-03-02', 'https://img.websosanh.vn/v2/users/review/images/ixjn78mu4c2n0.jpg?compress=85', 0, 'TQ', 'HP 20', 22000000,18500000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(9, 100, '2022-03-02', 'https://image.thanhnien.vn/w1024/Uploaded/2022/wpxlcqjwq/2022_01_05/xp-s1-6867.jpg', 0, 'TQ', 'HP 22', 24000000,18500000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(10, 100, '2022-03-02', 'https://todaypc.vn/image/catalog/csm-xps-15-left-angle-black-4e2d97a989.jpg', 0, 'TQ', 'Asus gamming', 35000000,18500000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(11, 100, '2022-03-02', 'https://cdn-img-v2.webbnc.net/uploadv2/web/11/11347/media/2019/01/10/03/01/1547089714_p_setting_fff_1_90_end_600.png', 0, 'TQ', 'Asus gamming pro', 40000000,18500000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(12, 100, '2022-03-02', 'https://24hstore.vn/upload_images/images/laptop%20sinh%20vien%202.png', 0, 'TQ', 'Asus gamming pro', 40000000,32000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 6),
(13, 100, '2022-03-02', 'https://suanhanh247.com/wp-content/uploads/2021/07/6531_54516_laptop_msi_gaming_ge66_raider_10sfs_474vn_xam_bac_8.jpg', 0, 'TQ', 'Asus gamming pro vip', 50000000,42000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(14, 100, '2022-03-02', 'https://useful.vn/wp-content/uploads/1559892084898_9178533.jpg', 0, 'TQ', 'Asus văn phòng', 15000000,7000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(15, 100, '2022-03-02', 'https://cdn.24h.com.vn/upload/2-2022/images/2022-06-02/2-1654153632-730-width740height463.jpg', 0, 'TQ', 'Macbook Ari', 22000000,17000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(16, 100, '2022-03-02', 'https://cdn.tgdd.vn/Files/2022/02/07/1414212/macbook-pro-2021-dim_1280x720-800-resize.jpg', 0, 'TQ', 'Macbook Pro Max', 46000000,33000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
(17, 100, '2022-05-02', 'https://cdn.24h.com.vn/upload/1-2021/images/2021-03-05/image23-1614932308-390-width630height430.jpg', 0, 'TQ', 'Iphone 11', 22000000,19000000,'6.6 inch, Dynamic AMOLED 2X, FHD+, 1080 x 2340 Pixels', 'còn hàng', 2),
(18, 100, '2022-05-02', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyTFXgg3mUZmLkWQRDCp0V5feTRrjXSf73XRpZoDNB4Uk3xmP_KzrlnRAE2OmC6pKnMiQ&usqp=CAU', 0, 'TQ', 'Iphone 11 Pro', 26000000,22000000,'6.6 inch, Dynamic AMOLED 2X, FHD+, 1080 x 2340 Pixels', 'còn hàng', 2),
(19, 100, '2022-05-02', 'https://cdn.24h.com.vn/upload/1-2021/images/2021-03-05/image14-1614932308-48-width630height400.jpg', 0, 'TQ', 'Iphone 11 Pro Max', 30000000,28000000,'6.6 inch, Dynamic AMOLED 2X, FHD+, 1080 x 2340 Pixels', 'còn hàng', 2),
(20, 100, '2022-05-02', 'https://cdn.24h.com.vn/upload/1-2021/images/2021-03-05/image23-1614932308-390-width630height430.jpg', 0, 'TQ', 'Iphone 12', 23000000,21000000,'6.6 inch, Dynamic AMOLED 2X, FHD+, 1080 x 2340 Pixels', 'còn hàng', 2),
(21, 100, '2022-05-02', 'https://cdn.24h.com.vn/upload/1-2021/images/2021-03-05/image14-1614932308-48-width630height400.jpg', 0, 'TQ', 'Iphone 13', 27000000,22000000,'6.6 inch', 'còn hàng', 2),
(22, 100, '2022-05-02', 'https://minmobile.b-cdn.net/image/catalog/tin-tuc/9-1-2020/9-1-2020/nen-mua-iphone-11-iphone-11-pro-iphone-11-pro-max-nao.jpg', 0, 'TQ', 'Iphone 13 Pro Max', 40000000,33000000,'6.6 inch', 'còn hàng', 2),
(23, 100, '2022-05-02', 'https://cdn.24h.com.vn/upload/1-2022/images/2022-02-11/image6-1644544198-476-width660height450.jpg', 0, 'TQ', 'SumSung S8', 55999000,50000000,'6.6 inch, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 2),
(24, 100, '2022-05-02', 'https://www.truesmart.com.vn/img/image/Thuha/Galaxy%20Z%20Fold2.jpg', 0, 'TQ', 'SS Galaxy S21 FE', 15000000,10000000,'6.6 inch, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 2),
(25, 100, '2022-05-02', 'https://image-us.24h.com.vn/upload/3-2021/images/2021-08-23/1-1629656884-26-width660height440.jpg', 0, 'TQ', 'SS Galaxy Z Fold4 5G', 42900000,39999000,'6.6 inch, Anti-glare LED-backlit', 'còn hàng', 2),
(26, 100, '2022-05-02', 'https://cdn.tgdd.vn/Products/Images/42/271717/oppo-reno7-z-5g-thumb-1-1-600x600.jpg', 0, 'TQ', 'Oppo Ren8 5G', 22000000,19000000,'6.6 inch', 'còn hàng', 2),
(27, 100, '2022-05-02', 'https://toanmobile.vn/userdata/8264/wp-content/uploads/2021/10/oppo-reno6-z-5g-aurora-1-600x600.jpg', 0, 'TQ', 'Oppo Find X', 22000000,18888000,'6.6 inch', 'còn hàng', 2);

INSERT INTO `app_role` (`role_name`) VALUES ('ADMIN');
INSERT INTO `app_role` (`role_name`) VALUES ('USER');

INSERT INTO `app_user` (`password`, `user_name`, `creation_date`) VALUES
 ('$2a$10$IL2WaXZmZLChaV2yoBbS4erqkc9HSjdIEVnbjFYLscSqP7GyMJuCO', 'admin', '2022-08-08'),
 ('$2a$10$IL2WaXZmZLChaV2yoBbS4erqkc9HSjdIEVnbjFYLscSqP7GyMJuCO', 'user', '2022-08-09');

INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '2');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '1');

-- select product.id, product.cost, product.`create_date`, product.`image`,
--  product.`is_delete`, product.`made_in`, product.`name`,
--  product.`price`,product.`specifications` ,product.`status_product`, category.`name` from product
-- join category on product.id_category = category.id where category.`name` like "%laptop%";
--
-- select product.id, product.cost, product.`create_date`, product.`image`,
--  product.`is_delete`, product.`made_in`, product.`name`,
--  product.`price`,product.`specifications` ,product.`status_product`, category.`name` from product
-- join category on product.id_category = category.id where category.`name` like "%Điện thoại%";
