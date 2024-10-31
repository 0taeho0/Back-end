-- 사원 테이블고 급여 등급 테이블을 조인하여
-- 이름, 월급, 급여 등급을 출력하시오.

-- 비 동등 조인
select  e.ename, e.sal, s.grade 
from emp e, salgrade s
where e.sal between s.losal and s.hisal;
