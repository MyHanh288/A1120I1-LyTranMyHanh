create table customers(
 customername varchar(50),
 phone int,
 city varchar(50),
 country varchar(50) );

select * from  customers;
insert into  customers(customername,phone,city,country) value ('Hanh',0905883488,'DaNang','VietNam');
insert into  customers(customername,phone,city,country) value ('Ishii',0904227898,'Tokyo','NhatBan');

select  * from customers where city  in ('Tokyo');