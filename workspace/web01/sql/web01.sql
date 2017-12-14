drop database if exists web01;
create database web01;
use web01;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);


insert into users values(1,"taro","123");
insert into users values(2,"jiro","2626");