select ename, loc, job
from emp e , dept d
where e.deptno = d.deptno and e.job = 'ANALYST';
