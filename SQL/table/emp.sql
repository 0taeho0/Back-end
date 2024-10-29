create table emp (
	empno number(4) not null,
	ename varchar2(10) not null,
	job varchar2(9),
	mgr number(4),
	hiredate date,
	sal number(7, 2),
	comm number(7, 2),
	deptno number(2),
	constraints emp_pk primary key(empno),
	constraints emp_dept_fk foreign key(deptno) references dept(deptno)
);
