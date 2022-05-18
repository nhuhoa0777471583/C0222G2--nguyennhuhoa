use quan_li_sinh_vien;

select address, count(id_student) as so_luong_hoc_vien 
from student group by address;

select student.id_student, student.name_student, avg(mark)
 from student 
 join mark on student.id_student=mark.id_student 
 group by student.id_student, student.name_student;
 
 select student.id_student, student.name_student, avg(mark)
 from student 
 join mark on student.id_student=mark.id_student 
 group by student.id_student, student.name_student
 having avg(mark)>5;
 
 select student.id_student, student.name_student, avg(mark)
 from student 
 join mark on student.id_student=mark.id_student 
 group by student.id_student, student.name_student
 having avg(mark)>= all(select avg(mark) from mark group by	mark.id_student);