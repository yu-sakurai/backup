drop database if exists loginsql;
create database loginsql;
use loginsql;

create table users(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert into users values
(1,"taro","132"),
(4,"hanako","1332"),
(5,"tro","13g2"),
(6,"jiro","1h32");