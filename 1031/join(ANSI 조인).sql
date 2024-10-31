-- ANSI 조인
select ename, d.loc
from emp e right outer join dept d
on e.deptno = d.deptno;
