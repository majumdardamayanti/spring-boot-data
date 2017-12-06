
drop table if exists stock;

create table stock(
	stock_id int,
	company_name varchar2(50),
	symbol varchar2(10),
	price decimal(10,2)
);

insert into stock values (1, 'VMWARE', 'VMW', 56.05);
insert into stock values (2, 'AT&T', 'T', 38.80);
insert into stock values (3, 'FACEBOOK', 'FB', 112.45);