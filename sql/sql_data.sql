drop table employee;
drop table department;
drop sequence emp_seq;
drop sequence dept_seq;

create table employee(
id varchar2(30) not null,
kid number(10) not null,
deptid varchar2(30) not null,
ename varchar2(30) not null,
created_date timestamp not null,
modified_date timestamp not null
);

CREATE SEQUENCE emp_seq start with 1 increment by 1;

insert into employee values('e1', emp_seq.nextval, 'd1', 'aaa', current_timestamp, current_timestamp);
insert into employee values('e2', emp_seq.nextval, 'd2', 'bbb', current_timestamp, current_timestamp);
insert into employee values('e3', emp_seq.nextval, 'd3', 'ccc', current_timestamp, current_timestamp);
insert into employee values('e4', emp_seq.nextval, 'd4', 'ddd', current_timestamp, current_timestamp);
insert into employee values('e5', emp_seq.nextval, 'd2', 'eee', current_timestamp, current_timestamp);

commit;

select * from employee;

create table department(
id varchar2(30) not null,
kid number(10) not null,
dname varchar2(30),
created_date timestamp not null,
modified_date timestamp not null
);

CREATE SEQUENCE dept_seq start with 1 increment by 1;

insert into department values('d1', dept_seq.nextval, 'DeptA', current_timestamp, current_timestamp);
insert into department values('d2', dept_seq.nextval, 'DeptB', current_timestamp, current_timestamp);
insert into department values('d3', dept_seq.nextval, 'DeptC', current_timestamp, current_timestamp);
insert into department values('d4', dept_seq.nextval, 'DeptD', current_timestamp, current_timestamp);

commit;

select * from department;