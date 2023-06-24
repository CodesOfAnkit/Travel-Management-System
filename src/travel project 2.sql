create database travelmanagement

use travelmanagement

create table login(username varchar(30), name varchar(30), password varchar(30));

show tables

select * from login;

ALTER TABLE login RENAME COLUMN password TO Password; 

create table customer (username varchar(20), id varchar(20), number varchar(20), name varchar(30), gender varchar(20), country varchar(30), address varchar(50), phone varchar(30), email varchar(50));

select * from customer;

create table bookpackage (username varchar(20), id varchar(20), number varchar(20), name varchar(30), country varchar(30), address varchar(50), phone varchar(30), email varchar(50), package varchar(30), person varchar(100), price varchar(200));

select * from bookpackage;

ALTER TABLE bookpackage RENAME COLUMN package TO packg; 

create table bookhotel (username varchar(20), name varchar(30), id varchar(20), number varchar(20),Hotels varchar(50), person varchar(50), Days varchar(30), Rooms varchar(50), Food varchar(30), price varchar(200), phone varchar(30));

select * from bookhotel;