drop database if exists logindb;
create database logindb;
use logindb;

create table users(
id int,
username varchar(255),
password varchar(255)
);

insert into users values
(1,"taro","2143"),
(2,"jiro","2626"),
(3,"saburo","3636"),
(4,"shiro","4646");


