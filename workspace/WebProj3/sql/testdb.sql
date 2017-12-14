drop database if exists testdb;
create database testdb;
use testdb;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);


insert into users values(1,"taro","3425");
insert into users values(2,"hanako","325");
insert into users values(3,"jiro","425");

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);