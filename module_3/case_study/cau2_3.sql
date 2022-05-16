USE case_study;
-- câu 2
select * from nhan_vien where ho_ten regexp '^[H,K,T].{1,14}$';
-- câu 3
select*from khach_hang where year(curdate())-year(ngay_sinh)>18 and year(curdate())-year(ngay_sinh)<50 
and (dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng trị') ;
-- câu 4
select*from khach_hang 

-- câu 5
