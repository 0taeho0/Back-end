select ename, loc, job
from emp e join dept d
USING (deptno) 
where e.job = 'ANALYST';
