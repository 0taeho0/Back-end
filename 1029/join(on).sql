select ename, loc, job
from emp e join dept d
on e.deptno = d.deptno 
where e.job = 'ANALYST';
