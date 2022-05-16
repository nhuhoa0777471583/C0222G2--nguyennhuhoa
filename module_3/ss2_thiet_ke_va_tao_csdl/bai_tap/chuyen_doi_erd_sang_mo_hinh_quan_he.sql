create database du_lieu_quan_he;
use du_lieu_quan_he;

-- bảng phiếu xuất
create table phieu_xuat
(id_px int primary key,
ngay_xuat date);

-- bảng vật tư
create table vat_tu
(id_vat_tu int primary key,
ten_vat_tu varchar(50));

-- bảng phiếu nhập
create table phieu_nhap
(id_pn int primary key,
ngay_nhap date);

-- 1 chi_tiet_phieu_xuat
create table chi_tiet_phieu_xuat
(id_px int,
id_vat_tu int,
primary key(id_px,id_vat_tu),
dg_xuat varchar(50),
sl_xuat varchar(50),
foreign key (id_px) references phieu_xuat(id_px),
foreign key (id_vat_tu) references vat_tu(id_vat_tu));


-- 2 chi_tiet_phieu_nhap
create table chi_tiet_phieu_nhap
(id_pn int,
id_vat_tu int,
primary key(id_pn,id_vat_tu),
dg_nhap varchar(50),
sl_nhap varchar(50),
foreign key (id_pn) references phieu_nhap(id_pn),
foreign key (id_vat_tu) references vat_tu(id_vat_tu)
);

create table don_dh
(id_dh int primary key,
ngay_dh date,
id_ncc int ,
foreign key (id_ncc) references nha_cung_cap(id_ncc));

-- 3 chi_tiet_don_dat_hang
create table chi_tiet_don_dat_hang
(id_vat_tu int,
id_dh int,
primary key (id_vat_tu,id_dh),
foreign key (id_vat_tu) references vat_tu(id_vat_tu),
foreign key (id_dh) references don_dh(id_dh));

create table nha_cung_cap
(id_ncc int ,
ten_ncc varchar(100),
dia_chi varchar(100),
id_sdt int,
primary key(id_ncc, id_sdt),
foreign key (id_sdt) references phone(id_sdt));

create table phone
(id_sdt int primary key ,
phone varchar(10));

