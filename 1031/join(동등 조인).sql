-- 사원 테이블과 부서 테이블을 조인하여
-- 사원이름, 부서 위치를 출력하시오.
-- 단, 근무지에 근무하는 사원이 없어도
-- 부서의 모든 위치를 함께 출력하시오.

select ename, d.loc
from emp e, dept d
where e.deptno = d.deptno;

select ename, d.loc
from emp e, dept d
where e.deptno(+) = d.deptno;
