create database quan_ly_diem_thi;
use quan_ly_diem_thi;

create table hoc_sinh(
ma_hoc_sinh varchar(20) primary key,
ten_hoc_sinh varchar(50) ,
ngay_sinh datetime,
lop varchar(20),
gt varchar(20));
select*from hoc_sinh;

create table mon_hoc(
ma_mon_hoc varchar(20) primary key,
ten_mon_hoc varchar(50) );
select*from mon_hoc;

create table bang_diem(
ma_hoc_sinh varchar(20),
ma_mon_hoc varchar(20),
diem_thi int,
ngay_kt datetime,
primary key (ma_hoc_sinh, ma_mon_hoc),
foreign key (ma_hoc_sinh) references hoc_sinh(ma_hoc_sinh),
foreign key (ma_mon_hoc) references mon_hoc(ma_mon_hoc)
);
select*from bang_diem;

create table giao_vien(
ma_giao_vien  varchar(20) primary key,
ten_gv varchar(20),
sdt varchar(10)
);
select*from giao_vien;
alter table mon_hoc add ma_giao_vien varchar(20);
alter table mon_hoc add constraint fk_ma_giao_vien foreign key(ma_giao_vien) references giao_vien(ma_giao_vien);