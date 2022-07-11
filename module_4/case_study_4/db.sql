SELECT * FROM case_study_m4.customer;
use case_study_m4;

select facility.name_facility,
customer.name_customer,
contract.start_date,
contract.end_date,
attach_facility.name,
contract.deposit 
from contract
join customer on customer.id = contract.id_customer
join facility on facility.id = contract.id_facility
join contract_detail on contract_detail.id_contract = contract.id
join attach_facility on attach_facility.id = contract_detail.id_attach_facility;













insert into customer_type value
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');
insert into customer value
(1,'Quảng Trị','2002-03-25','caoly02@gmail.com',0,'865342123','Cao Thị Phương Ly','0954333333',3);
insert into customer value
(2,'K77/22 Thái Phiên, Quảng Trị','1992-08-08','xuandieu92@gmail.com',1,'865342123','Phạm Xuân Diệu','0954333333',3);
insert into customer value
(3,'K323/12 Ông Ích Khiêm, Vinh','1990-02-27','nghenhan2702@gmail.com',1,'488645199','Trương Đình Nghệ','0373213122',1);
insert into customer value
(4,'K453/12 Lê Lợi, Đà Nẵng','1981-07-08','caoly@gmail.com',1,'543432111','Cao Thị Phương ly','0490039241',3);
insert into customer value
(5,'224 Lý Thái Tổ, Gia Lai','1981-07-08','duongquan@gmail.com',1,'543432111','Tôn Nữ Mộc Châu','0490039241',4),
(6,'37 Yên Thế, Đà Nẵng','1981-07-08','duongquan@gmail.com',1,'543432111','Nguyễn Mỹ Kim','0490039241',5),
(7,'K123/45 Lê Lợi, Hồ Chí Minh','1981-07-08','duongquan@gmail.com',1,'543432111','Nguyễn Thị Hào','0490039241',1),
(8,'55 Nguyễn Văn Linh, Kon Tum','1981-07-08','duongquan@gmail.com',1,'543432111','Trần Đại Danh','0490039241',4);

insert into rent_type value 
(1,'year'),
(2,'month'),
(3,'day'),
(4,'hour');

insert into facility_type value
(1,'villa'),
(2,'house'),
(3,'room');

insert into facility value
(1,"buffe sáng",100,1000,"Có hồ bơi",10,"Villa Beach Front",2,100,"vip",1,1),
(2,"1",1111,1111,"1",11,"vinpearland hoi an",1,1,"1",2,2),
(3,"cafe sáng",100,2000,"Có thêm bếp nướng",10,"Villa Beach Front",0,100,"vip",3,2),
(4,"buffe trưa",50,3000,"Có hồ bơi",10,"Room Beach Front",2,100,"vip",3,3),
(5,"buffe sáng",50,4500,"Có thêm bếp nướng",10,"Room Twin 01",0,100,"vip",3,3),
(6,"bữa sáng",200,5000,"Có thêm bếp nướng",10,"Villa Twin 01",0,100,"vip",2,1),
(7,"bufe trưa",150,6000,"Có hồ bơi",10,"Villa Beach Front",2,100,"vip",2,1),
(8,"buffe tối",320,7500,"Có tivi",10,"Hours Beach Front",2,100,"vip",1,2),
(9,"bữa sáng",300,2300,"Có thêm bếp nướng",10,"Room Beach Front",2,100,"vip",2,3),
(10,"cafe sáng",100,8100,"Có hồ bơi",10,"Villa Beach Front",2,100,"vip",1,1);



insert into position
value
(1, 'lễ tân'),
(2,'phục vụ'),
(3,'chuyên viên'),
(4,'giám sát'),
(5,'quản lí'),
(6,'giám đốc');

insert into education
value
(1,'Trung Cấp'),
(2,'Cao Đẳng'),
(3,'Đại Học'),
(4,'Sau Đại Học');

insert into division
value
(1,'Sale-Marketing'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Quản lý');

insert into employee
value
(1,"295 Nguyễn Tất Thành, Đà Nẵng","1970-11-07","annguyen@gmail.com","456231786","Nguyễn Văn An","0901234121",10000000,2,2,3);
insert into employee
value
(2,"22 Yên Bái, Đà Nẵng","1970-11-07","binhlv@gmail.com","654231234","Lê Văn Bình","0934212314",7000000,2,2,3),
(3,"77 Hoàng Diệu, Quảng Trị","1970-11-07","binhlv@gmail.com","654231234","Lê Văn Bình","0934212314",7000000,2,2,3),
(4,"4 Nguyễn Chí Thanh, Huế","1970-11-07","binhlv@gmail.com","654231234","Lê Văn Bình","0934212314",7000000,2,2,3),
(5,"Đà Nẵng","1970-11-07","binhlv@gmail.com","654231234","Tòng Hoang","0934212314",7000000,2,2,3),
(6," Đà Nẵng","1970-11-07","binhlv@gmail.com","654231234","Nguyễn Bỉnh Phát","0934212314",7000000,2,2,3),
(7,"Hồ Chí Minh","1970-11-07","binhlv@gmail.com","654231234","Hồ Thị Yế","0934212314",7000000,2,2,3),
(8,"Hà Nội","1970-11-07","binhlv@gmail.com","654231234","Võ Công Toản","0934212314",7000000,2,2,3);

insert into attach_facility
value
(1,10000,'Karaoke','tiện nghi, hiện tại','giờ'),
(2,10000,'massa','còn','giờ'),
(3,20000,'Thuê xe đạp','chiếc','tốt'),
(4,15000,'Buffet buổi sáng','đầy đủ đồ ăn, tráng miệng','suất'),
(5,90000,'Buffet buổi trưa','đầy đủ đồ ăn, tráng miệng','suất'),
(6,16000,'Buffet buổi tối','đầy đủ đồ ăn, tráng miệng','suất');


insert into contract_detail
value
(1,5,2,4),
(2,8,2,5),
(3,15,2,3),
(4,1,3,1);


insert into contract
value
(1,0,'2020-12-08','2020-12-08',3,1,5),
(2,200000,'2020-07-14','2020-07-21',7,3,6),
(3,50000,'2021-03-15','2021-03-17',3,4,5),
(4,100000,'2021-01-14','2021-01-18',7,5,9),
(5,0,'2021-07-14','2021-07-15',7,2,8);
-- (6,0,'2021-06-01','2021-06-03',7,7,6),
-- (7,100000,'2021-09-02','2021-09-05',7,4,4),
-- (8,150000,'2021-06-17','2021-06-18',3,4,1),
-- (9,0,'2020-11-19','2020-11-19',3,4,3),
-- (10,0,'2021-04-12','2021-04-14',10,3,5),
-- (11,0,'2021-04-25','2021-04-25',2,2,1),
-- (12,0,'2021-05-25','2021-05-27',7,10,1);



