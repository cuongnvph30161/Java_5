CREATE DATABASE asm;
USE asm;

CREATE TABLE accounts(
username varchar(50) primary key,
pass_word varchar(50),
full_name varchar(50),
email varchar(50),
photo varchar(50),
activated int,
admin bit,
);


CREATE TABLE orders(
id int identity(1,1) primary key,
username varchar(50) foreign key references accounts(username),
create_date date,
addresss varchar(100),
);


CREATE TABLE order_details(
id int identity(1,1) primary key,
order_id int foreign key references orders(id),
product_id int foreign key references products(id),
price float,
quantily int,
);

select * from order_details 
where id=24;

CREATE TABLE products(
id int identity(1,1) primary key,
names varchar(50),
images varchar(100),
price float,
create_date date ,
available bit,
category int foreign key references categories(id),
);

CREATE TABLE categories(
id int identity(1,1) primary key,
names varchar(50),
);
select id from categories where names ='NguyenVanCuong'

ALTER TABLE categories
ADD CONSTRAINT unique_names UNIQUE (names);

