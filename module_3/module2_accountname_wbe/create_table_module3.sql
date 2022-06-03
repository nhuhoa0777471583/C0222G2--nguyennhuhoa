create database case_study_module_3;
use case_study_module_3;

-- user_role - role - user 
create table role(
id_role int primary key,
name_role varchar(50)
);
create table user(
username varchar(255) primary key,
password varchar(255)
);
create table user_role(
id_role int,
username varchar(255),
primary key (id_role,username),
foreign key(id_role) references role(id_role),
foreign key(username) references user(username)
);


-- chức vụ - trình độ học vấn - bộ phân - nhân viên
create table position_employee(
id_position int primary key,
name_position varchar(100)
);
create table education_degree(
id_education_degree int primary key,
name_education_degree varchar(50)
);
create table divition(
id_division int primary key,
name_divition varchar(50)
);
 create table employee(
id_employee  int primary key,
name_employee varchar(100),
birthday_employee date,
id_card_employee varchar(50),
salary double,
phone varchar(50),
email varchar(50),
address varchar(50),
id_position int,
id_education_degree int,
id_division int,
username varchar(255),
foreign key(id_position) references position_employee(id_position),
foreign key(id_education_degree) references education_degree(id_education_degree),
foreign key(id_division) references divition(id_division),
foreign key(username) references user(username)
);

-- loại khách - khách hàng 
create table customer_type(
id_customer_type int primary key,
name_customer_type varchar(100)
);
create table customer(
id_customer int primary key,
name_customer varchar(50),
birthday_customer date,
 gender_customer bit(1),
 id_card_customer varchar(50),
 phone varchar(50),
 email varchar(50),
 address varchar(50),
 id_customer_type int,
 foreign key(id_customer_type) references customer_type(id_customer_type)
);

-- loại dich vụ - kiểu dich vụ - dịch vụ
create table service_type(
id_service_type int primary key,
name_service_type varchar(45)
);

create table rent_type(
id_rent_type int primary key,
name_rent_type varchar(45),
cost_rent_type double
);

create table service(
id_service int primary key,
name_service varchar(50),
area int,
cost double,
max_people int,
standard_room varchar(50),
description_other_convenience varchar(50),
pool_area double,
number_of_float int,
id_rent_type int,
id_service_type int,
foreign key (id_rent_type) references rent_type(id_rent_type),
foreign key(id_service_type) references service_type(id_service_type)
);

-- hợp đồng - dịch vụ chi tiết - hơp đồng chi tiết 
create table contract(
id_contract int primary key,
start_date datetime,
end_date datetime,
deposit double,
total_money double,
id_employee int,
id_customer int,
id_service int,
foreign key (id_employee) references employee(id_employee),
foreign key (id_customer) references customer(id_customer),
foreign key (id_service) references service(id_service)
);

create table attach_service(
id_attach_service int primary key,
name_attach_service varchar(45),
cost double,
unit int ,
 status_attach_service varchar(45)
 );

create table contract_detail(
id_contract_detail int primary key,
quantity int,
id_contract int,
id_attach_service int,
foreign key (id_contract) references contract(id_contract),
foreign key (id_attach_service) references attach_service(id_attach_service));