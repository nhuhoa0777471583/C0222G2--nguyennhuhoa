DROP DATABASE IF EXISTS  quan_li_sinh_vien;
create database quan_li_sinh_vien;
use quan_li_sinh_vien;

create table class(
id_class int not null  primary key auto_increment,
name_class varchar(60) not null,
start_date datetime not null,
status bit );

create table student(
id_student int not null primary key auto_increment,
name_student varchar(30) not null,
address varchar(50),
phone varchar(20),
status bit ,
id_class int not null,
foreign key (id_class) references class(id_class));

create table subject(
id_sub int not null primary key auto_increment,
name_sub varchar(50) not null,
creadit tinyint not null default 1 check (creadit>=1),
status bit default 1
);

create table mark(
id_mark int not null primary key auto_increment,
id_sub int not null,
id_student int not null,
unique key(id_sub,id_student),
mark float default 0 check (mark between 0 and 100),
exam_time tinyint default 1,
foreign key (id_sub) references subject (id_sub),
foreign key (id_student) references student (id_student)
);
use quan_li_sinh_vien;


select*from student; 
select name_student from student where name_student like 'H%';

select*from class; 
select name_class, start_date from class where month(start_date)=12;

select*from subject ;
select id_sub, name_sub,creadit from subject where 3<creadit and creadit<10;

set sql_safe_updates =0;
update student
set id_class =2 where name_student='Hung' and id_student = 2;
set sql_safe_updates =0;

select*from student ;

select student.name_student,subject.name_sub,mark.mark 
from student 
join subject on student.id_student=subject.id_sub
join mark on student.id_student=mark.id_mark
order by mark desc , name_student  ; 

