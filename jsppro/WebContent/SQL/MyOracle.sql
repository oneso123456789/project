select * from tab;
select * from seq;

-- JSTL scott/tiger
create table test(
	num number,
	name varchar2(10),
	primary key(num) );


--회원 관리
select * from member0;

create table member0(
	id varchar2(20) primary key,
	pw varchar2(20) not null,
	name varchar2(20) not null,
	vclass varchar2(20) not null,
	phone varchar2(30)
);
	


-- 자료실
create table upload( num number,
        writer varchar2(20) not null,
	    email varchar2(30),
        subject varchar2(50) not null,
        passwd varchar2(20) not null,
	    reg_date date not null,
	    readcount number default 0,
	    ref number not null,
	    re_step number not null,
	    re_level number not null,
	    content long not null,
	    ip varchar2(20) not null,
	    filename varchar2(30),
	    constraint upload_pk primary key(num) );

create sequence upload_seq increment by 1 
			  start with 1
			  nocycle;



--답변형 게시판
create table board( 
		num number,                	
		writer varchar2(20) not null,
	    email varchar2(30),
        subject varchar2(50) not null,
        passwd varchar2(20) not null,
		reg_date date not null,
		readcount number default 0,
		ref number not null,
		re_step number not null,
		re_level number not null,
		content varchar2(2000) not null,
		ip varchar2(20) not null,
		constraint board_pk primary key(num) );

create sequence board_seq 
	start with 1
	increment by 1
	nocache;


	
-- 일반 게시판
create table board0( num number primary key,
                     writer varchar2(20) not null,
	    	         email varchar2(30),
                     subject varchar2(50) not null,
                     passwd varchar2(20) not null,
		        	 reg_date date not null,
		        	 readcount number default 0,			
		        	 content varchar2(2000) not null,
		        	 ip varchar2(20) not null );

create sequence board0_seq
	start with 1
	increment by 1
	nocache;

insert into board0 values(board0_seq.nextval,
'안화수','test@naver.com','제목','1234',sysdate,0,
'내용부분','192.168.30.78');	



-- 방명록
create table GUESTBOOK (
    GUESTBOOK_ID NUMBER,
    REGISTER     DATE         NOT NULL,
    NAME      VARCHAR2(20) NOT NULL,
    EMAIL        VARCHAR2(40) NOT NULL,
    PASSWORD     VARCHAR2(20),
    CONTENT      VARCHAR2(2000) NOT NULL,
    CONSTRAINT GUESTBOOK_PK PRIMARY KEY (GUESTBOOK_ID) );

create sequence guestbook_seq 
	increment by 1
	start with 1
	nocache;

insert into guestbook 
	values(guestbook_seq.nextval,sysdate,'안화수',
	'guardian23@naver.com','1234','내용입니다.');

select * from member1;


-- totoro 계정으로 생성
create  table  member1(
			id varchar2(12) primary key,
            passwd varchar2(12) not null,
		    name varchar2(10) not null,	
		    reg_date timestamp not null );


select * from member1;
-- scott 계정으로 생성
create  table  member1( 
		    id varchar2(12) primary key,
            passwd varchar2(12) not null,
			name varchar2(10) not null,
			jumin1 varchar2(6) not null,
			jumin2 varchar2(7) not null,
			email varchar2(30),
			blog varchar2(50),
			reg_date date not null);