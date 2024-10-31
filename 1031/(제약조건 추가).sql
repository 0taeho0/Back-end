alter table EMP add constraint EMP_MGR_FK foreign key(mgr)
references emp(empno);
