create database quan_li_sinh_vien;
use quan_li_sinh_vien;

create table class(
id_class int not null  primary key auto_increment,
name_class varchar(60) not null,
start_date datetime not null,
status bit not null);

create table student(
id_student int not null primary key auto_increment,
name_student varchar(50) not null,
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
id_sub int not null unique key,
id_student int not null unique key,
mark float default 0 check (mark between 0 and 100),
exam_time tinyint default 1,
foreign key (id_sub) references subject (id_sub),
foreign key (id_student) references student (id_student));
