DROP DATABASE IF EXISTS case_study;
CREATE DATABASE case_study;
USE case_study;
-- nhan vien- vi tri- trinh do- bo phan
CREATE TABLE vi_tri(
ma_vi_tri INT PRIMARY KEY,
ten_vi_tri VARCHAR(45));
INSERT INTO vi_tri
VALUE
(1,'Nhân Viên'),
(2,'quản lí');
select * from vi_tri;

USE case_study;
CREATE TABLE trinh_do(
ma_trinh_do INT PRIMARY KEY,
ten_trinh_do VARCHAR(45)
);
insert into trinh_do
value
(1,'Trung Cấp'),
(2,'Cao Đẳng'),
(3,'Đại Học'),
(4,'sau Đại Học');
select * from trinh_do;
USE case_study;
CREATE TABLE bo_phan(
ma_bo_phan INT PRIMARY KEY,
ten_bo_phan VARCHAR(45)
);
insert into bo_phan
value
(1,'Sale-Marketing'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Quản lý');
select * from bo_phan;
USE case_study;
CREATE TABLE nhan_vien(
id_employee INT PRIMARY KEY,
ho_ten VARCHAR(100),
ngay_sinh DATE,
so_cmnd VARCHAR(50),
luong DOUBLE,
so_dien_thoai INT,
email VARCHAR(50),
dia_chi VARCHAR(50),
id_vi_tri INT ,
id_trinh_do INT,
id_bo_phan INT
);
insert into nhan_vien value
(1,'Nguyễn Văn An','1970-11-07','456231786','10000000','0901234121','annguyen@gmail.com','295 Nguyễn Tất Thành Đà Nẵng'),
(2,'Lê Văn Bình','	1997-04-09','654231234','7000000','	0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng'),
(3,'Hồ Thị Yến	','1995-12-12','999231723','14000000','	0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ Gia Lai'),
(4,'Võ Công Toản','1980-04-04','123231365','17000000','	0374443232','toan0404@gmail.com	','77 Hoàng Diệu Quảng Trị'),
(5,'Nguyễn Bỉnh Phát','1999-12-09','454363232','6000000','	0902341231','	phatphat@gmail.com	','43 Yên Bái, Đà Nẵng'),
(6,'Khúc Nguyễn An Nghi','2000-11-08','964542311','7000000','0978653213','	annghi20@gmail.com','	294 Nguyễn Tất Thành, Đà Nẵng'),
(7,'Nguyễn Hữu Hà','1993-01-01','534323231','8000000','0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế'),
(8,'Nguyễn Hà Đông','1989-09-03','234414123','9000000','0642123111','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội'),
(9,'Tòng Hoang','1982-09-03','256781231	','6000000','0245144444','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng'),
(10,'Nguyễn Công Đạo','1994-01-08','75543434','8000000','0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai');
select * from nhan_vien;

-- khách hàng - loại khách

create table loai_khach(
ma_loai_khach int primary key,
ten_loai_khach varchar(50));
insert into loai_khach value
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');
select * from loai_khach;

create table khach_hang(
id_customer int primary key,
id_loai_khach int,
ho_ten varchar(50),
ngay_sinh date,
 gioi_tinh bit(1),
 so_cmnd varchar(50),
 so_dt varchar(50),
 email varchar(50),
 dia_chi varchar(50)
);
insert into khanh_hang value
(1,'Nguyễn Thị Hào','1970-11-07','0','643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng'),
(2,'Phạm Xuân Diệu','1992-08-08','	1','865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị'),
(3,'Trương Đình Nghệ','1990-02-27','1','488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh'),
(4,'Dương Văn Quan','1981-07-08','1','543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng'),
(5,'Hoàng Trần Nhi Nhi','	1995-12-09','0','795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai'),
(6,'Tôn Nữ Mộc Châu','2005-12-06','	0','732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng'),
(7,'Nguyễn Mỹ Kim','1984-04-08','0','856453123','0912345698','kimcuong84@gmail.com ','K123/45 Lê Lợi, Hồ Chí Minh'),
(8,'Nguyễn Thị Hào','	1999-04-08','0	','965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum'),
(9,'Trần Đại Danh','1994-07-01','1','432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi'),
(10,'Nguyễn Tâm Đắc','1989-07-01','	1','344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng');
select * from khach_hang;

-- dịch vụ- kiểu thue- loai dich vu
create table dich_vu(
id_dich_vu int primary key,
ten_dich_vu varchar(50),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da int,
ma_kieu_thue int,
ma_dich_vu int,
 tieu_chuan_phong varchar(50),
 mo_ta_tien_nghi_khac varchar(50),
dien_tich_ho_boi double,
so_tang int
);

select * from dich_vu;

create table kieu_thue(
ma_kieu_thue int primary key,
ten_kieu_thue varchar(45));
select *from kieu_thue;
insert into kieu_thue value
(1,'year'),
(2,'month'),
(3,'day'),
(4,'hour');
create table loai_dich_vu(
ma_dich_vu int primary key,
ten_loai_dich_vu varchar(45));
select*from loai_dich_vu;
insert into loai_dich_vu value
(1,'Villa'),
(2,'House'),
(3,'Room');

-- hop dong - hop dong chi tiet- dich vu di kèm 
create table hop_dong(
ma_hop_dong int primary key,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
tien_dat_coc double,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int);
select*from hop_dong;

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key,
ma_hop_dong int,
ma_dich_vu_di_kem int);
select*from hop_dong_chi_tiet;

create table dich_vu_di_kem(
ma_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(10),
 trang_thai varchar(45));
 select *from dich_vu_di_kem;
 insert into dich_vu_di_kem value
 (1,'Karaoke','10000','giờ','tiện nghi, hiện tại'),
 (2,'Thuê xe máy','10000','chiếc','hỏng 1 xe'),
 (3,'Thuê xe đạp','20000','chiếc','tốt'),
 (4,'Buffet buổi sáng','15000','suất','đầy đủ đồ ăn, tráng miệng'),
 (5,'Buffet buổi trưa','90000','suất','đầy đủ đồ ăn, tráng miệng'),
 (6,'Buffet buổi tối','16000','suất','đầy đủ đồ ăn, tráng miệng');
