create database electric_bill;
use electric_bill;
create table electricity_connection_type(id int primary key,connection_name varchar(20) not null);
desc electricity_connection_type;
create table slab(id int primary key, connection_id int not null,from_unit int not null,to_unit int not null,rate double not null,constraint connection_id_FK foreign key(connection_id)references electricity_connection_type(id));
desc slab;
create table building_type(id int primary key,name varchar(100) not null,connection_type1_id int(20) not null,constraint connection_type1_id_FK foreign key(connection_type1_id)references electricity_connection_type(id));
desc building_type;
create table buildings(id int primary key,owner_name varchar(100) not null,address varchar(100) not null,contact_number int not null,building_id  int not null,email_address varchar(100) not null,constraint building_id_FK foreign key(building_id) references buildings(id));
desc buildings;
create table meter(id int primary key,meter_num varchar(100)not null,building_id int not null);
desc meter;
create table bill(id int primary key,meter_id int not null,month int not null,year int not null,due_date DATE not null,total_units int not null,payable_amount double not null,is_payed int not null,payment_date DATE not null,fine_amount double not null);
desc bill;
select LENGTH(owner_name) AS LengthOfName from buildings order by owner_name;
select min(LENGTH(owner_name)),contact_name from buildings order by owner_name;
select owner_name,contact_number,email_address,CONCAT(owner_name,'-',contact_number'-',email_address)as contact_details from building order by owner_name;
select substring(meter_num,1,3) as building_id from meter order by building_id;
desc meter;
select left(owner_name,3) as name_code from buildings order by owner_name;
select left(contact_number,3) as name_code from buildings order by owner_name;
select owner_name from buildings WHERE owner_name like '%di' order by owner_name;
select COUNT(is_payed) from bill where months(months)=10;
select SUM(fine_amount) from bill where payment_date between 2017/10/01 and 2017/11/01;



