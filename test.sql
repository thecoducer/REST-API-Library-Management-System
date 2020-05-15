use test_db;

insert into members(username, email, password, fname, created_at, role) values ("thecoducer", "mayukh5741@gmail.com", "4as6d494", "Mayukh Datta", "2020-05-11", "student");

select * from members;

insert into mem_status(mem_id, status, expire_on) values (1, "allowed", "2021-05-11");
insert into mem_status(mem_id, status, expire_on) values (2, "pending", "2021-05-11");

select * from mem_status;

select fname, role, status from members natural join mem_status;

insert into student(mem_id, roll_no, dob, yoa, year, dept, course, phone, address) values(1, 65, "1997-12-24", "2016-08-12", "4", "CSE", "BTech", "98300", "bataitala");

select * from student;

delete from student where mem_id = 1;

show engines;




