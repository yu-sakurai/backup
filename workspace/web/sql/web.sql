drop database if exists web;
create database web;
use web;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values(1,"taro","1616");
insert into users values(2,"jiro","2626");
insert into users values(3,"saburo","3636");