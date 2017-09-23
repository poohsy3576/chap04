
use world;

select * from tbl_dept;
select * from tbl_emp;


UPDATE emp
   SET GENDER = 'M'
 WHERE GENDER = 'm';
 
 select * from emp;
 
commit;
 
insert into tbl_dept
select * from dept;

delete from tbl_dept where deptno = 50;

insert into tbl_emp
(comm, deptno, empno, ename, gender, hiredate, job, mgr, sal)
select comm, deptno, empno, ename, gender, hiredate, job ,mgr ,sal from emp;

select * from tbl_dept;
select * from tbl_emp;