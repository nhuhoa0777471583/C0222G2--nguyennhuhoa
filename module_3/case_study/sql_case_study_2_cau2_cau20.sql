use csdl_case_study;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là
-- một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.

select * from nhan_vien
where nhan_vien.ho_ten like 'H%' or nhan_vien.ho_ten like 'K%' or nhan_vien.ho_ten like 'T%'
and  char_length(nhan_vien.ho_ten) < 15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi 
-- và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select * from khach_hang
where
datediff(now(),ngay_sinh)/365 > 18
 and
 datediff(now(),ngay_sinh)/365 < 50
and
khach_hang.dia_chi like '%Đà Nẵng' or khach_hang.dia_chi like '%Quảng Trị';

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select*from khach_hang;
select*from loai_khach;
select*from hop_dong;
select
khach_hang.ma_khach_hang,
khach_hang.ho_ten,
count(hop_dong.ma_khach_hang) as so_lan_dat_phong
from khach_hang
join loai_khach on loai_khach.ma_loai_khach =khach_hang.ma_loai_khach
join hop_dong on hop_dong.ma_khach_hang= khach_hang.ma_khach_hang
where loai_khach.ten_loai_khach = 'Diamond' 
group by khach_hang.ma_khach_hang
order by so_lan_dat_phong ;

-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien
--  (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và
--  Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet)
--  cho tất cả các khách hàng đã từng đặt phòng.
--  (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select
khach_hang.ma_khach_hang,
khach_hang.ho_ten,
loai_khach.ma_loai_khach,
hop_dong.ma_hop_dong,
dich_vu.ten_dich_vu,
hop_dong.ngay_lam_hop_dong,
hop_dong.ngay_ket_thuc,
 ifnull((hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia),0) + dich_vu.chi_phi_thue  as tong_tien
from khach_hang
left join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
left join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by 
khach_hang.ma_khach_hang,
khach_hang.ho_ten,
hop_dong.ngay_ket_thuc
order by  khach_hang.ma_khach_hang;


-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, 
-- ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng 
-- thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).


select 
dich_vu.ma_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.dien_tich,
dich_vu.chi_phi_thue,
loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
join hop_dong on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
where hop_dong.ma_dich_vu not in 
(select hop_dong.ma_dich_vu from hop_dong
where month(hop_dong.ngay_lam_hop_dong) in (1,2,3) and year(hop_dong.ngay_lam_hop_dong) in (2021) )
group by dich_vu.ma_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.dien_tich,
dich_vu.chi_phi_thue,
loai_dich_vu.ten_loai_dich_vu;


-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue,
--  ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 
-- nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

select 
dich_vu.ma_dich_vu, 
dich_vu.ten_dich_vu, 
dich_vu.dien_tich,  
dich_vu.so_nguoi_toi_da,  
dich_vu.chi_phi_thue,  
loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
join hop_dong on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
where hop_dong.ma_dich_vu not in
(select hop_dong.ma_dich_vu from hop_dong 
where year(hop_dong.ngay_lam_hop_dong) in (2021))
group by dich_vu.ma_dich_vu;

-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.

select khach_hang.ho_ten from khach_hang 
union 
select khach_hang.ho_ten from khach_hang ;
 
 
select khach_hang.ho_ten from khach_hang
group by khach_hang.ho_ten
having count(khach_hang.ho_ten)>1;
 
 select distinct ho_ten from khach_hang;
 
-- 	9.	Thực hiện thống kê doanh thu theo tháng, 
--     nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
 
 select *from hop_dong;
 select *from khach_hang;
 
 
 select 
month(hop_dong.ngay_lam_hop_dong) as thang,
count(khach_hang.ma_khach_hang) as so_luong
from hop_dong
 join khach_hang on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where hop_dong.ma_hop_dong in
(select hop_dong.ma_hop_dong from hop_dong
where year(hop_dong.ngay_lam_hop_dong) in (2021)
)
group by thang
order by  thang ;


-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc,
--  tien_dat_coc, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select hop_dong.ma_hop_dong,
hop_dong.ngay_lam_hop_dong,
hop_dong.ngay_ket_thuc,
hop_dong.tien_dat_coc,
sum(hop_dong_chi_tiet.so_luong) as dich_vu_di_kem
from hop_dong
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong
group by hop_dong.ma_hop_dong,
hop_dong.ngay_lam_hop_dong;


-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng
--  bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.



select * from loai_khach;
select * from khach_hang;
select * from hop_dong;
select * from dich_vu_di_kem;
select * from hop_dong_chi_tiet;

select 
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem
from dich_vu_di_kem
 join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem= hop_dong_chi_tiet.ma_dich_vu_di_kem
 join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
 join khach_hang on hop_dong.ma_khach_hang= khach_hang.ma_khach_hang
 join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
where 
khach_hang.dia_chi like '%Vinh' or khach_hang.dia_chi like '%Quảng Ngãi'
and loai_khach.ten_loai_khach = 'Diamond';



-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu,
--  so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

select * from hop_dong;
select 
hop_dong.ma_hop_dong,
nhan_vien.ho_ten as nhan_vien,
khach_hang.ho_ten as khach_hang,
khach_hang.so_dt,
dich_vu.ten_dich_vu,
ifnull(sum(hop_dong_chi_tiet.so_luong),0) as so_luong_dich_vu_di_kem,
hop_dong.tien_dat_coc
from hop_dong
left join nhan_vien on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
left join khach_hang on khach_hang.ma_khach_hang= hop_dong.ma_khach_hang
left join dich_vu on dich_vu.ma_dich_vu= hop_dong.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
where month(hop_dong.ngay_lam_hop_dong) in (10,11,12)
group by 
hop_dong.ma_hop_dong,
nhan_vien.ho_ten ,
khach_hang.ho_ten ,
khach_hang.so_dt,
dich_vu.ten_dich_vu;


-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất 
-- bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select 
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem,
sum(hop_dong_chi_tiet.so_luong) as so_luong
from dich_vu_di_kem
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by 
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem
having  so_luong >= 15;


-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem,
--  so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).

select 
hop_dong.ma_hop_dong,
loai_dich_vu.ten_loai_dich_vu,
dich_vu_di_kem.ten_dich_vu_di_kem,
count(dich_vu_di_kem.ma_dich_vu_di_kem) as so_lan_su_dung
from hop_dong
  join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
 join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
 join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong= hop_dong.ma_hop_dong
 join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by
dich_vu_di_kem.ma_dich_vu_di_kem
having so_lan_su_dung = 1
order by  hop_dong.ma_hop_dong
;


-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, 
-- ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

select
nhan_vien.ma_nhan_vien,
nhan_vien.ho_ten,
trinh_do.ten_trinh_do,
bo_phan.ten_bo_phan,
nhan_vien.so_dt,
nhan_vien.dia_chi
from nhan_vien
 join trinh_do on nhan_vien.ma_trinh_do =trinh_do.ma_trinh_do
 join bo_phan on nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
 join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
where  year(hop_dong.ngay_lam_hop_dong) between (2020) and (2021)
group by 
nhan_vien.ma_nhan_vien,
nhan_vien.ho_ten
having 
count(hop_dong.ma_hop_dong) <= 3
order by  hop_dong.ma_hop_dong desc;


-- 16.	Xóa những Nhân viên chưa từng lập được
-- hợp đồng nào từ năm 2019 đến năm 2021.



select 
nhan_vien.ma_nhan_vien, nhan_vien.ho_ten
from  nhan_vien
left join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
where hop_dong.ma_nhan_vien not in
(select nhan_vien.ma_nhan_vien from nhan_vien
where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021)
group by 
nhan_vien.ma_nhan_vien,
nhan_vien.ho_ten;

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với 
-- Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.

select 
khach_hang.ma_khach_hang,
khach_hang.ho_ten,
loai_khach.ma_loai_khach
from khach_hang
join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
where loai_khach.ma_loai_khach = 2
and ifnull((hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia),0) + dich_vu.chi_phi_thue;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).

select 
khach_hang.ma_khach_hang,
khach_hang.ho_ten
from khach_hang
left join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
where 
year(hop_dong.ngay_lam_hop_dong) in (2020);


-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.


select * from dich_vu_di_kem;
select * from hop_dong_chi_tiet;
select * from hop_dong;

set sql_safe_updates = 0;

update dich_vu_di_kem
set dich_vu_di_kem.gia = dich_vu_di_kem.gia *2 
where dich_vu_di_kem.ma_dich_vu_di_kem in
(select update_gia.ma_dich_vu_di_kem from
(select 
dich_vu_di_kem.ma_dich_vu_di_kem,
dich_vu_di_kem.ten_dich_vu_di_kem
from dich_vu_di_kem
left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
left join hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
where
year(hop_dong.ngay_lam_hop_dong) in(2020)
group by dich_vu_di_kem.ma_dich_vu_di_kem
having
max(hop_dong_chi_tiet.so_luong) > 10) as update_gia ) ;
set sql_safe_updates = 1;


-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), 
-- ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

select ma_nhan_vien, ho_ten,email,so_dt,ngay_sinh,dia_chi from nhan_vien
union
select ma_khach_hang, ho_ten,email,so_dt,ngay_sinh,dia_chi from khach_hang;



-- 21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.

create view v_nhan_vien as
select 
nhan_vien.ho_ten as nhan_vien,
nhan_vien.dia_chi as dia_chi_nhan_vien,
khach_hang.ho_ten as khach_hang,
khach_hang.dia_chi as dia_chi_khach_hang,
hop_dong.ngay_lam_hop_dong
from nhan_vien
left join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
left join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
where 
nhan_vien.dia_chi like '%Huế' and year(hop_dong.ngay_lam_hop_dong) in (2021)
group by nhan_vien.ho_ten,
nhan_vien.dia_chi,
khach_hang.ho_ten,
khach_hang.dia_chi;

select * from v_nhan_vien;

set sql_safe_updates = 0;
update v_nhan_vien
set v_nhan_vien.dia_chi_nhan_vien = 'liên chiêu';
set sql_safe_updates = 1;
