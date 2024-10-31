select ename, d.loc
from emp e, dept d
where e.deptno = d.deptno(+);

select ename, d.loc
from emp e left outer join dept d
on e.deptno = d.deptno(+);
