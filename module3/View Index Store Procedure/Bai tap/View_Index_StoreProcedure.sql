use a11_student;

create table products(
id int primary key,
productCode varchar(50),
productName varchar(100),
productPrice int,
productAmount int, 
productDescription varchar(255),
productStatus varchar(255));

insert into products (id, productCode, productName, productPrice, productAmount, productDescription, productStatus) 
value 
(1, 'SP001', 'Dieu hoa', 1000000, 5, 'Hang Mitsubishi', 'Made in VN'),
(2, 'SP002', 'Tu lanh', 1500000, 10, 'Hang Toshiba', 'Made in JP'),
(3, 'SP003', 'Bep dien tu', 500000, 7, 'Hang Toshiba', 'Made in TL');

create or replace view productsInformation
as
select productCode, productName, productPrice, productStatus
from products;

DELIMITER $$
create procedure showProduct()
begin
select *
from products;
end; $$
DELIMITER ;



DELIMITER $$
drop procedure insertProduct;
create procedure insertProduct(in id int, in productCode varchar(50), in productName varchar(100), in productPrice int, in productAmount int, in productDescription varchar(255), in productStatus varchar(255))
begin
insert into products (id, productCode, productName, productPrice, productAmount, productDescription, productStatus)
values(id, productCode, productName, productPrice, productAmount, productDescription, productStatus);
end; $$
DELIMITER ;

call insertProduct(5, 'SP004', 'May giat', 1000000, 5, 'Hang Fuji', 'Made in JP');

select *
from products;

DELIMITER $$
drop procedure deleteProduct;
create procedure deleteProduct(in nid int)
begin
delete from products
where id = nid;
end; $$
DELIMITER ;

call deleteProduct(4);

DELIMITER $$
create procedure updateProduct(in idn int, in nproductCode varchar(50), in nproductName varchar(100), in nproductPrice int, in nproductAmount int, in nproductDescription varchar(255), in nproductStatus varchar(255))
begin
update products
set productCode = nproductCode, productName = nproductName, productPrice = nproductPrice, productAmount = nproductAmount, productDescription = nproductDescription, productStatus = nproductStatus 
where id = idn;
end; $$
DELIMITER ;

call updateProduct(5,'SP005','May giat', 1000000, 5, 'Hang Fuji', 'Made in JP');
