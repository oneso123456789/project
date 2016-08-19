select * from tab;

select * from member01;

select * from dept;
select * from emp;

create table customer( no number(4)  primary key,
		       name varchar2(20),
		       email varchar2(20),
		       tel varchar2(20)  );
		       
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);		       
		       
select * from customer;		

desc customer;

create table mem01(name  varchar2(20),
		   email  varchar2(20),
		   phone  varchar2(20));
		   
select * from mem01;

-- 회원가입
create table member(name varchar2(20),
		  			gender varchar2(10),
		  			jumin1 varchar2(6),
                 	jumin2 varchar2(7),
		  			address varchar2(50),
		  			buseo  varchar2(10),
                  	sports varchar2(20),
                 	music varchar2(20),
                 	movie varchar2(20),
		  			computer varchar2(20),
		  			intro varchar2(1000)
		  );
		  
select * from member;


create  table  mem02(id  varchar2(20)  primary key,
		  passwd  varchar2(20),
		  name  varchar2(20),
		  reg_date  date);





