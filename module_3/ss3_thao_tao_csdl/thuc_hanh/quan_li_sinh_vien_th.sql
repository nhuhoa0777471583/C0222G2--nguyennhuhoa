use quan_li_sinh_vien;
select*from student;
SELECT *
FROM student
WHERE status = true;

SELECT *
FROM subject
WHERE creadit < 10;

SELECT student.id_student, student.name_student, class.name_class
FROM student join class  on student.id_student = class.id_class;

SELECT  student.id_student, student.name_student, class.name_class
FROM student join class  on student.id_student = class.id_class
WHERE class.name_class = 'A1';

SELECT student.id_student, student.name_student,subject.name_sub, mark.mark
FROM student 
join mark on student.id_student = mark.id_student 
join subject on student.id_student = subject.id_sub