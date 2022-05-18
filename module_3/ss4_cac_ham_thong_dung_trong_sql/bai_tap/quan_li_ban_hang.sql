use quan_li_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select name_sub,max(creadit) from subject ;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select subject.id_sub,subject.name_sub, mark.mark
from subject
 join mark on subject.id_sub=mark.id_sub
where mark.mark in (select max(mark.mark) from mark) ;


-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.id_student,student.name_student,student.address, avg(mark.mark) as diem_trung_binh
from student 
join mark on  student.id_student=mark.id_student 
group by student.id_student,student.name_student 
order by  diem_trung_binh desc ;

