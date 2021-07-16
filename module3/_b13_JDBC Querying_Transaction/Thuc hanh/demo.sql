create database demo;

use demo;

create table users (
id int(3) not null auto_increment primary key,
name varchar(120) not null,
email varchar(220) not null,
country varchar(120));

insert into users (name, email, country) value 
('Minh', 'minh@codegym.vn', 'VietNam'),
('Kante','kante@che.uk','Kenia');

delimiter $$
create procedure get_user_by_id(IN user_id INT)
begin
SELECT users.name, users.email, users.country
    FROM users
    where users.id = user_id;
end; $$
delimiter ;

delimiter $$
create procedure insert_user(IN user_name varchar(50), IN user_email varchar(50), IN user_country varchar(50))
begin
 INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);
end; $$
delimiter ;

create table permision (
id int(3) not null auto_increment primary key,
name varchar(120) not null);

insert into permision (name) value
('add'),
('edit'),
('delete'),
('view');

create table user_permision (
permision_id int(3),
user_id int(3));


 
 





