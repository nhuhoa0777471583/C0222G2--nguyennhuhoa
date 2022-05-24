USE case_study;


select*from loai_khach;
select*from khach_hang;

-- câu 2 Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu 
-- là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien where ho_ten regexp '^[H,K,T].{1,14}$';


-- câu 3 Hiển thị thông tin của tất cả khách hàng
-- có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
where  datediff( now(), ngay_sinh )/365 >18 
and
datediff( now(), ngay_sinh )/365 < 50
and
(dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng trị') ;

-- câu 4 Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select id_customer, ho_ten, count(id_customer) as 'so_lan_dat_phong'
 from loai_khach inner join khach_hang on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach
 where loai_khach.ma_loai_khach = 1
 group by id_customer;


-- câu 5 Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá,
-- với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng.
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select khach_hang.id_customer,
khach_hang.ho_ten,
loai_khach.ten_loai_khach,
hop_dong.ma_hop_dong,
dich_vu.ten_dich_vu,
hop_dong.ngay_lam_hop_dong,
hop_dong.ngay_ket_thuc,
dich_vu.chi_phi_thue +  ifnull((hop_dong_chi_tiet.so_luong *dich_vu_di_kem.gia),0) as tong_tien
from  khach_hang
left join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
left join hop_dong on khach_hang.id_customer = hop_dong.id_customer
left join dich_vu on dich_vu.id_dich_vu =hop_dong.id_dich_vu
left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem= hop_dong_chi_tiet.ma_dich_vu_di_kem#
group by khach_hang.id_customer,
khach_hang.ho_ten,
loai_khach.ten_loai_khach,
hop_dong.ma_hop_dong,
dich_vu.ten_dich_vu;


-- cau 6. Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue,
-- ten_loai_dich_vu của tất cả các loại dịch vụ 
-- chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select 
dich_vu.id_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.dien_tich,
dich_vu.chi_phi_thue,
loai_dich_vu.ten_loai_dich_vu
from dich_vu 
join loai_dich_vu on dich_vu.ma_dich_vu = loai_dich_vu.ma_dich_vu
join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
where hop_dong.id_dich_vu not in(
select hop_dong.id_dich_vu from hop_dong 
where month(hop_dong.ngay_lam_hop_dong) in (1,2,3)
 and year(hop_dong.ngay_lam_hop_dong) in (2021))
group by dich_vu.id_dich_vu;
 
select*from hop_dong;

-- cau 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue,
--  ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 
-- nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
select 
dich_vu.id_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.dien_tich,
dich_vu.so_nguoi_toi_da,
dich_vu.chi_phi_thue,
loai_dich_vu.ten_loai_dich_vu
from dich_vu 
join loai_dich_vu on dich_vu.ma_dich_vu = loai_dich_vu.ma_dich_vu
join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
where hop_dong.id_dich_vu not in(
select hop_dong.id_dich_vu from hop_dong 
where year(hop_dong.ngay_lam_hop_dong) in (2021))
group by dich_vu.id_dich_vu;

-- cau 8	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- cach1
select ho_ten from khach_hang 
union
select ho_ten from khach_hang;
-- cách 2
select  distinct  ho_ten from khach_hang;
-- cách 3
select ho_ten from khach_hang
group by ho_ten;

-- 9.	Thực hiện thống kê doanh thu theo tháng,
--  nghĩa là tương ứng với mỗi tháng trong năm 2021 
--  thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
select*from hop_dong;
select*from khach_hang;

select month(hop_dong.ngay_lam_hop_dong)  as thang,
 count(khach_hang.id_customer) as so_luong_dat_phong
from khach_hang
join hop_dong on khach_hang.id_customer = hop_dong.id_customer
where hop_dong.ngay_lam_hop_dong in
(select hop_dong.ngay_lam_hop_dong from hop_dong where
 year(hop_dong.ngay_lam_hop_dong) in (2021))
group by thang order by thang;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select
hop_dong.ma_hop_dong,
hop_dong.ngay_lam_hop_dong,
hop_dong.ngay_ket_thuc,
hop_dong.tien_dat_coc,
sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem 
from hop_dong
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on  hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by (hop_dong.ma_hop_dong) ;

-- 	11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi 
-- những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select*from dich_vu_di_kem;
select*from khach_hang;
select*from loai_khach;


select
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem
from dich_vu_di_kem 
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem= hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong on hop_dong_chi_tiet.ma_hop_dong= hop_dong.ma_hop_dong
join khach_hang on hop_dong.id_customer = khach_hang.id_customer
join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
where 
(loai_khach.ten_loai_khach ='Diamond' 
and 
(khach_hang.dia_chi like  '%Vinh' or khach_hang.dia_chi like '%Quảng Ngãi'))
group by 
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem;

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), 
-- so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem),
--  tien_dat_coc của tất cả các dịch vụ đã từng được
--  khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
-- select *from dich_vu;

select
 hop_dong.ma_hop_dong,
 nhan_vien.ho_ten as nhan_vien,
 khach_hang.ho_ten as khach_hang,
 khach_hang.so_dt,
 dich_vu.id_dich_vu,
 dich_vu.ten_dich_vu,
sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem ,
 hop_dong.tien_dat_coc
from hop_dong
join nhan_vien on hop_dong.id_employee= nhan_vien.id_employee
join khach_hang on hop_dong.id_customer = khach_hang.id_customer
join dich_vu on hop_dong.id_dich_vu= dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong
where
month(hop_dong.ngay_lam_hop_dong) in (10,11,12) and year(hop_dong.ngay_lam_hop_dong) in (2020)
group by 
hop_dong.ma_hop_dong;



-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dich vụ có số lần sử dụng nhiều như nhau).
select
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem,
sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem
from  dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group by 
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem
having 
so_luong_dich_vu_di_kem = (select max(hop_dong_chi_tiet.so_luong) from hop_dong_chi_tiet)
order by so_luong_dich_vu_di_kem ;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
--  Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
--  (được tính dựa trên việc count các ma_dich_vu_di_kem).

select * from dich_vu_di_kem;
select * from loai_dich_vu;

select 
hop_dong.ma_hop_dong,
loai_dich_vu.ten_loai_dich_vu,
dich_vu_di_kem.ten_dich_vu_di_kem,
count(dich_vu_di_kem.ma_dich_vu_di_kem) as so_lan_su_dung
from 
hop_dong
 join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
 join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem= dich_vu_di_kem.ma_dich_vu_di_kem
 join dich_vu on dich_vu.id_dich_vu= hop_dong.id_dich_vu
 join loai_dich_vu on loai_dich_vu.ma_dich_vu= dich_vu.ma_dich_vu
group by 
dich_vu_di_kem.ma_dich_vu_di_kem
having so_lan_su_dung = 1
order by hop_dong.ma_hop_dong  ;


-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, 
-- ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, 
-- dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

select 
nhan_vien.id_employee,
nhan_vien.ho_ten,
trinh_do.ten_trinh_do,
bo_phan.ten_bo_phan,
nhan_vien.so_dien_thoai,
nhan_vien.dia_chi
from nhan_vien
join trinh_do on nhan_vien.ma_trinh_do= trinh_do.ma_trinh_do
inner join bo_phan on nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
inner join hop_dong on nhan_vien.id_employee= hop_dong.id_employee
where (year(hop_dong.ngay_lam_hop_dong) between 2020 and 2021 )
group by nhan_vien.id_employee
having count(hop_dong.ma_hop_dong) <= 3 
order by hop_dong.ma_hop_dong desc;


-- select * from nhan_vien;
-- select * from bo_phan;
-- select * from trinh_do;
-- select 
-- nhan_vien.id_employee,
-- nhan_vien.ho_ten,
-- trinh_do.ten_trinh_do,
-- bo_phan.ten_bo_phan,
-- nhan_vien.so_dien_thoai,
-- nhan_vien.dia_chi
-- from nhan_vien
--  join trinh_do on nhan_vien.ma_trinh_do= trinh_do.ma_trinh_do
-- left join bo_phan on nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
-- left join hop_dong on nhan_vien.id_employee= hop_dong.id_employee
-- group by nhan_vien.id_employee 
--  ;

-- select 
-- nhan_vien.id_employee,
-- nhan_vien.ho_ten,
-- trinh_do.ten_trinh_do,
-- bo_phan.ten_bo_phan,
-- nhan_vien.so_dien_thoai,
-- nhan_vien.dia_chi
-- from nhan_vien
-- inner join trinh_do on nhan_vien.ma_trinh_do= trinh_do.ma_trinh_do
-- inner join bo_phan on nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
-- inner join hop_dong on nhan_vien.id_employee= hop_dong.id_employee
-- where (year(hop_dong.ngay_lam_hop_dong) between 2020 and 2021 )
-- group by nhan_vien.id_employee
-- having count(hop_dong.ma_hop_dong) <= 3 
-- order by hop_dong.ma_hop_dong desc;


-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.

select id_employee, ho_ten
from nhan_vien
where id_employee not in (select
nhan_vien.id_employee
from nhan_vien
join hop_dong on nhan_vien.id_employee = hop_dong.id_employee
where 
year(hop_dong.ngay_lam_hop_dong) >= 2019 and year(hop_dong.ngay_lam_hop_dong) <= 2021
group by
nhan_vien.id_employee);

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.

select* from khach_hang ;
set sql_safe_updates = 0;

update khach_hang
set khach_hang.ma_loai_khach = 1
where khach_hang.ma_loai_khach in 
(select abc.ma_loai_khach
 from (
 select 
hop_dong.ma_hop_dong,
hop_dong.ngay_lam_hop_dong,
khach_hang.id_customer,
khach_hang.ho_ten,
loai_khach.ma_loai_khach,
loai_khach.ten_loai_khach,
dich_vu.id_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.chi_phi_thue + ifnull((hop_dong_chi_tiet.so_luong *dich_vu_di_kem.gia),0) as tong_tien
from hop_dong
join khach_hang on hop_dong.id_customer = khach_hang.id_customer
join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
where 
year(hop_dong.ngay_lam_hop_dong) in (2021) 
and loai_khach.ma_loai_khach= 2
group by 
hop_dong.ma_hop_dong
)
 as abc);
set sql_safe_updates = 1;

select* from khach_hang ;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).

select* from khach_hang ;
select* from hop_dong;

set sql_safe_updates = 0;
delete from khach_hang 
where khach_hang.id_customer in
(select kh.id_customer 
from (select 
khach_hang.id_customer,
khach_hang.ho_ten,
hop_dong.ngay_ket_thuc
from
khach_hang
join hop_dong on khach_hang.id_customer = hop_dong.id_customer
where 
year(hop_dong.ngay_ket_thuc) < 2021) as kh);
set sql_safe_updates = 1;

-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
-- sai cách
select * from dich_vu_di_kem;

set sql_safe_updates = 0;
update dich_vu_di_kem
set dich_vu_di_kem.gia = dich_vu_di_kem.gia *2
where dich_vu_di_kem.ma_dich_vu_di_kem in 
(select dv.ma_dich_vu_di_kem
from
( select
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem,
dich_vu_di_kem.gia,
hop_dong_chi_tiet.so_luong,
hop_dong.ngay_lam_hop_dong
from dich_vu_di_kem
inner join hop_dong_chi_tiet 
on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
inner join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
where year (hop_dong.ngay_lam_hop_dong) in (2020)
having hop_dong_chi_tiet.so_luong> 10 ) as dv) ;
set sql_safe_updates = 1;



-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống,
--  thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

select * from khach_hang;
select * from nhan_vien;

select nhan_vien.id_employee,
nhan_vien.ho_ten,
nhan_vien.email
,nhan_vien.so_dien_thoai,
nhan_vien.ngay_sinh,
nhan_vien.dia_chi 
from nhan_vien
union
select khach_hang.id_customer,
khach_hang.ho_ten,
khach_hang.email,
khach_hang.so_dt,
khach_hang.ngay_sinh,
khach_hang.dia_chi 
from khach_hang

