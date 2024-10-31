select ename, d.loc
from emp e full outer join dept d
on e.deptno = d.deptno(+);
