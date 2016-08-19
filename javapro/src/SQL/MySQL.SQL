show databases;

show tables;

select * from mem;

create table mem01(name  varchar(20),
		   email  varchar(20),
		   phone  varchar(20));
		   
select * from mem01;

-- 고객 정보 테이블
create table customer( no int(4)  primary key, 
		       name varchar(20),
		       email varchar(20),
		       tel varchar(20) );

alter table customer add(address varchar(50));
alter table customer add(reg_date timestamp);

select * from customer;

create table board(
	num int(4) auto_increment primary key,
	name varchar(20),
	email varchar(30),
	subject varchar(50));
	
insert into board(name,email,subject) 
   values('안화수','test@naver.com','제목 입니다.');
	
select * from board;	






