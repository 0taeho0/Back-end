create table dept (
	deptno number(2) not null,
	dname varchar2(14) not null,
	loc varchar2(13),
	constraints dept_pk primary key(deptno)
);
