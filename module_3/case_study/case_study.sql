DROP DATABASE IF EXISTS case_study;
CREATE DATABASE case_study;
USE case_study;
-- nhan vien- vi tri- trinh do- bo phan
CREATE TABLE vi_tri(
ma_vi_tri INT PRIMARY KEY,
ten_vi_tri VARCHAR(45));

CREATE TABLE trinh_do(
ma_trinh_do INT PRIMARY KEY,
ten_trinh_do VARCHAR(45)
);

CREATE TABLE bo_phan(
ma_bo_phan INT PRIMARY KEY,
ten_bo_phan VARCHAR(45)
);

CREATE TABLE nhan_vien(
id_employee INT PRIMARY KEY,
ho_ten VARCHAR(100),
ngay_sinh DATE,
so_cmnd VARCHAR(50),
luong DOUBLE,
so_dien_thoai INT,
email VARCHAR(50),
dia_chi VARCHAR(50),
ma_vi_tri INT ,
ma_trinh_do INT,
ma_bo_phan INT,
foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
);
-- khách hàng - loại khách

create table loai_khach(
ma_loai_khach int primary key,
ten_loai_khach varchar(50));

create table khach_hang(
id_customer int primary key,
ho_ten varchar(50),
ngay_sinh date,
 gioi_tinh bit(1),
 so_cmnd varchar(50),
 so_dt varchar(50),
 email varchar(50),
 dia_chi varchar(50),
 ma_loai_khach int,
 foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
);


-- dịch vụ- kiểu thue- loai dich vu
create table dich_vu(
id_dich_vu int primary key,
ten_dich_vu varchar(50),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da int,
tieu_chuan_phong varchar(50),
mo_ta_tien_nghi_khac varchar(50),
dien_tich_ho_boi double,
so_tang int,
ma_kieu_thue int,
ma_dich_vu int,
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key(ma_dich_vu) references loai_dich_vu(ma_dich_vu));


create table kieu_thue(
ma_kieu_thue int primary key,
ten_kieu_thue varchar(45));

create table loai_dich_vu(
ma_dich_vu int primary key,
ten_loai_dich_vu varchar(45));

-- hop dong - hop dong chi tiet- dich vu di kèm 
create table hop_dong(
ma_hop_dong int primary key,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
tien_dat_coc double,
id_employee int,
id_customer int,
id_dich_vu int,
foreign key (id_employee) references nhan_vien(id_employee),
foreign key (id_customer) references khach_hang(id_customer),
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);


create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key,
so_luong int,
ma_hop_dong int,
ma_dich_vu_di_kem int,
foreign key (ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem));

create table dich_vu_di_kem(
ma_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(10),
 trang_thai varchar(45));

