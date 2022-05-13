DROP DATABASE IF EXISTS case_study;
CREATE DATABASE case_study;
USE case_study;
-- nhan vien- vi tri- trinh do- bo phan
CREATE TABLE vi_tri(
ma_vi_tri INT PRIMARY KEY,
ten_vi_tri VARCHAR(45));
INSERT INTO vi_tri
VALUE
(1,'phục vụ'),
(2,'quản lí');

select * from vi_tri;

CREATE TABLE trinh_do(
ma_trinh_do INT PRIMARY KEY,
ten_trinh_do VARCHAR(45)
);
insert into trinh_do
value(1,'trung cấp'),
(2,'cao đẳng');

select * from trinh_do;

CREATE TABLE bo_phan(
ma_bo_phan INT PRIMARY KEY,
ten_bo_phan VARCHAR(45)
);
insert into bo_phan
value(1,'hành chính'),
(2,'sale');
select * from bo_phan;

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
select * from nhan_vien;

-- khách hàng - loại khách

create table loai_khach(
ma_loai_khach int primary key,
ten_loai_khach varchar(50));
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
select *from kieu thue;

create table loai_dich_vu(
ma_dich_vu int primary key,
ten_loai_dich_vu varchar(45));
select*from loai_dich_vu;

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
 
