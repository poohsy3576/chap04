select * from tbl_dept;
select * from tbl_emp;

insert into TBL_DEPT
select * from dept;

delete from tbl_dept where deptno = 50;

insert into tbl_emp
(comm, deptno, empno, ename, gender, hiredate, job, mgr, sal)
select comm, deptno, empno, ename, gender, hiredate, job ,mgr ,sal from emp;