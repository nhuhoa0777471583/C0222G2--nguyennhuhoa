
-- create database demo_sprint_2;
use demo_sprint_2;


INSERT INTO `category` ( `name`, `image`, `quantity`) VALUES 
('Laptop','https://cdn.hubs.vn/pv-blog/2020/09/Dell-XPS-15-1024x572.jpg', 999),
('Điện thoại', 'https://images.fpt.shop/unsafe/fit-in/60x60/filters:quality(90):fill(transparent)/fptshop.com.vn/Uploads/images/2022/iconcate/icon-mobile.png', 999),
('PC-Lắp ráp', 'https://images.fpt.shop/unsafe/fit-in/60x60/filters:quality(90):fill(transparent)/fptshop.com.vn/Uploads/images/2022/iconcate/icon-laptop.png', 999),
('Máy tính bảng', 'https://cdn.tgdd.vn/Products/Images/522/274155/ipad-air-5-wifi-cellular-tim-thumb-600x600.jpg', 999),
('Đồng hồ','https://cdn.sforum.vn/sforum/wp-content/uploads/2021/08/apple-watch-series-7-2.jpg', 999),
('Phụ kiện','https://namlongphukien.com/wp-content/uploads/2020/07/phu-kien-dien-thoai-iphone-quan-2.jpg', 999),
('Màn hình','https://cdn.tgdd.vn/hoi-dap/1280707/man-hinh-laptop-4k-uhd-la-gi-800x397.jpg', 999),
('Máy lọc nước','https://cdn.tgdd.vn/Products/Images/3385/193282/kangaroo-kg10a3-190522-021701-600x600.jpg', 999),
('Loa','https://cdn.tgdd.vn/Products/Images/2162/230641/loa-tivi-bluetooth-mozard-m103-nau-ava-600x600.jpg', 999),
('Nồi chiên','https://cdn.tgdd.vn/Products/Images/9418/217569/Kangaroo%20KG52AF1A-0-600x600.jpg', 999),
('Máy giặt','https://cdn.tgdd.vn/Products/Images/1944/212636/beko-wcv9649xwst-12-300x300.jpg', 999),
('Điều hòa','https://shop.nagakawa.com.vn/media/product/587_info___r2h12__1_.jpg', 999);


INSERT INTO `product` 
(`id`, `quantity`, `create_date`, `image`, `is_delete`, `made_in`, `name`, `price`,`price_sale`,`specifications` ,`status_product`, `id_category`) VALUES 
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
(12, 100, '2022-03-02', 'https://24hstore.vn/upload_images/images/laptop%20sinh%20vien%202.png', 0, 'TQ', 'Asus gamming pro', 85000000,79000000,'15.6 inch, 1920 x 1080 Pixels, IPS, 144 Hz, Anti-glare LED-backlit', 'còn hàng', 1),
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
INSERT INTO `product` 
(`id`, `quantity`, `create_date`, `image`, `is_delete`, `made_in`, `name`, `price`,`price_sale`,`specifications` ,`status_product`, `id_category`) VALUES 
(28, 100, '2022-05-02', 'https://cdn.tgdd.vn/Products/Images/42/234621/Xiaomi-12-xam-thumb-mau-600x600.jpg', 0, 'TQ', 'Xiaomi Mi 11', 5988000,4988000,'6.6 inch', 'còn hàng', 2),
(29, 100, '2022-05-02', 'https://didongviet.vn/pub/media/catalog/product//x/i/xiaomi-11t-128gb-didongviet.jpg', 0, 'TQ', 'Xiaomi 11T', 6789000,3542000,'6.6 inch', 'còn hàng', 2),
(30, 100, '2022-05-02', 'https://asia-exstatic-vivofs.vivo.com/PSee2l50xoirPK7y/1658210760660/769410d3168557560e69da984419d51e.png', 0, 'TQ', 'Vivo Y02s', 8000000,5555000,'6.6 inch', 'còn hàng', 2),
(31, 100, '2022-05-02', 'https://www.nguyenkim.com/images/detailed/770/10050029-dien-thoai-vivo-y21-4gb-64gb-trang-1.jpg', 0, 'TQ', 'Vivo Y21', 4000000,3500000,'6.6 inch', 'còn hàng', 2);

INSERT INTO `app_role` (`role_name`) VALUES ('ADMIN');
INSERT INTO `app_role` (`role_name`) VALUES ('USER');

INSERT INTO `app_user` (`password`, `user_name`, `creation_date`) VALUES
 ('$2a$10$IzCBmgzFSLMZ3km0s3EkV.Dr3FG0XJmvPZzUVxKwMTLdy1fjTEXSS', 'admin', '2022-08-08'),
 ('$2a$10$IzCBmgzFSLMZ3km0s3EkV.Dr3FG0XJmvPZzUVxKwMTLdy1fjTEXSS', 'user', '2022-08-09');

INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '2');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '1');

INSERT INTO `customer` (`id`, `address`,`email`, `image`, `is_delete`, `name`, `phone_number`, `user_id`) VALUES 
(1, 'Đà Nẵng','nguyennhuhoa2303@gmail.com', 'abc', 0, 'Hòa', '0123456789', 2),
(2, 'Đà Nằng','nguyennhuhoa2303@gmail.com', 'abc', 0, 'Như Hòa', '099999988', 1);

