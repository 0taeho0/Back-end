select ename, loc, job
from emp e NATURAL JOIN dept d
where e.job = 'ANALYST';
