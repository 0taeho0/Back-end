-- 사원 테이블 자기 자신의 테이블과 조인하여
-- 이름, 직업, 해당 사원이 관리자 이름, 관리자 직업을
-- 출력하시오

select e1.ename, e1.job, e2.ename, e2.job
from emp e1, emp e2
where e1.mgr = e2.empno;
