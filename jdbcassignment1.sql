create database sampleDB;
show databases;
use sampleDB;
create table product(id int, name varchar(20),price int);
describe product;
insert into product values
(101,"Pen",50),
(102,"Key board",500),
(103,"Mouse",500),
(104,"Pen Drive",400),
(105,"USB Cable",200);
select * from product;
update product set price=100 where id=101;
update product set name="Wireless Mouse" where id=103;
select * from product;
delete from product where id=104;
delete from product where id=105;
select * from product;