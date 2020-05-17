/* 
-------------------------------------------
---------------Table: users----------------
-------------------------------------------
*/

INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('komal','komal@gmail.com','$2a$10$sECcNcUc5OoGzU3QHZVXOOadlB3r3w83hQQdJRP42l8Ah6o0Zg1V2','Komal Singh', '2020-05-13 02:22:21', 'ROLE_STUDENT');
INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('sanjay','sanjay@gmail.com','$2a$10$mSTm8TRFTE5Gv4p7VYufd.rfUR2F5CWPVaiZw6QBNmpZZwnTkdh7C','Sanjay Roy', '2020-05-13 02:22:21', 'ROLE_STUDENT');
INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('aamir','aamir@gmail.com','$2a$10$P3FTeAMLMBZF9EJfiYqbmezBBCVhVSwWX6PeV1SNqs3EwMhrSVRNW','Aamir Aziz', '2020-05-13 02:22:21', 'ROLE_STUDENT');
INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('esha25','esha@gmail.com','$2a$10$lv0Zt7GrCq0TTbsXFwGJuen4Tryt705jxUULH/rjkffXIEudjev9S','Esha Ghosh', '2020-05-13 02:22:21', 'ROLE_STUDENT');
INSERT INTO users(username,email,password,fname,created_at,authority,enabled) VALUES ('sunil','sunil@gmail.com','$2a$10$l2iO5xxgzWl.nSc1QFaJKeT3osu1X9IJyYghORuuaHDnYVAD9ZaN.','Sunil Banerjee', '2020-05-13 02:22:21', 'ROLE_STUDENT',false);
INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('zeeshan','zeeshan@gmail.com','$2a$10$/99aAlQlcuoebAFSkIKcW.q8lFqUdMcfzkh9p9pcd/kRi7moNPWLu','Zeeshan Malik', '2020-05-13 02:22:21', 'ROLE_TEACHER');
INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('lisa','lisa@gmail.com','$2a$10$svGC/6R.S0PAcNQBV8Xmz.4N0m3/Rag2a5wrXujOtNxb993jnQ9b2','Lisa Waters', '2020-05-13 02:22:21', 'ROLE_TEACHER');
INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('santanu','santanu@gmail.com','$2a$10$YwX3me7yCgy7HggYe.vHq.iBPhJYG7OTQNJf38GiBXgh9NPA865de','Santanu Mukherjee', '2020-05-13 02:22:21', 'ROLE_TEACHER');
INSERT INTO users(username,email,password,fname,created_at,authority,enabled) VALUES ('moumita','moumita@gmail.com','$2a$10$MhcBbV7w60Mx/sk4whe6MuQZwnuTRf7Gyhsrbb0Jp5czA4XIfUsae','Moumita Ghosh', '2020-05-13 02:22:21', 'ROLE_TEACHER',false);
INSERT INTO users(username,email,password,fname,created_at,authority) VALUES ('madhura969','madhura@gmail.com','$2a$10$yE02XHuMS.b0sm1ZpvcqN.7CmDzinlnN5oyaM5p1NYoWHVjHu2HKi','Madhura Sengupta', '2020-05-13 02:22:21', 'ROLE_TEACHER');
INSERT INTO users(username, email, password, fname, created_at, authority) VALUES ('mayukh', 'mayukh5741@gmail.com', '$2a$10$.e7lgarn7kp8GsgJJvEv9.0KATw3KLTZxrKjzgEbUbEAnpupphQA2', 'Mayukh Datta', '2020-05-13 02:22:21', 'ROLE_LIBRARIAN');
INSERT INTO users(username, email, password, fname, created_at, authority) VALUES ('koumik', 'koumik@gmail.com', '$2a$10$qF3UV683/.BTfVZNnwPYEOBx/9t.wIQFhxc9F60MuXoUIBqF6n1Ei', 'Koumik Dasgupta', '2020-05-13 02:22:21', 'ROLE_LIBRARIAN');

/* 
-------------------------------------------
--------------Table: students--------------
-------------------------------------------
*/

INSERT INTO students(user_id,roll_no,dob,yoa,year,dept,course,phone,address) VALUES (1,16800116001,'1997-02-15','2016-07-28',4,'Computer Science and Engineering','BTech',9373305080,'H.D Road, Delhi');
INSERT INTO students(user_id,roll_no,dob,yoa,year,dept,course,phone,address) VALUES (2,16800117023,'1998-04-03','2017-07-29',3,'Electronics and Communication Engineering','BTech',9439519465,'76, Deep Building, Kolkata');
INSERT INTO students(user_id,roll_no,dob,yoa,year,dept,course,phone,address) VALUES (3,16800118012,'1997-05-04','2017-07-30',3,'Information Technology','BTech',9438248871,'M House, Tana Street, Chennai');
INSERT INTO students(user_id,roll_no,dob,yoa,year,dept,course,phone,address) VALUES (4,16800116045,'1997-12-16','2016-07-23',4,'Electronics and Communication Engineering','BTech',9726228735,'A-5, Shalimar Road, Patna');
INSERT INTO students(user_id,roll_no,dob,yoa,year,dept,course,phone,address) VALUES (5,16800119011,'1996-09-07','2018-08-01',2,'Computer Science and Engineering','MTech',9718029217,'J K Society, H Nagar, Kolkata');

/* 
-------------------------------------------
--------------Table: teachers--------------
-------------------------------------------
*/

INSERT INTO teachers(user_id,dob,yoap,dept,phone,address) VALUES (6,'1994-10-03','2016-07-27','Computer Science and Engineering',8119745402,'90, R J Nagar, Delhi');
INSERT INTO teachers(user_id,dob,yoap,dept,phone,address) VALUES (7,'1994-07-12','2015-11-04','Electronics and Communication Engineering',9381273596,'H 186/3, P Street, Kolkata');
INSERT INTO teachers(user_id,dob,yoap,dept,phone,address) VALUES (8,'1995-03-02','2015-10-20','Computer Science and Engineering',9122513511,'31/1, M.S Lane, Bangalore');
INSERT INTO teachers(user_id,dob,yoap,dept,phone,address) VALUES (9,'1995-02-04','2016-05-17','Mechanical Engineering',8441701930,'109, Kaked East, Kolkata');
INSERT INTO teachers(user_id,dob,yoap,dept,phone,address) VALUES (10,'1995-07-24','2016-08-03','Information Technology',9933399459,'A-134, S. K Nagar, Kolkata');


/* 
-------------------------------------------
---------------Table: items----------------
-------------------------------------------
*/

INSERT INTO items(item_id) VALUES (1), (2), (3), (4), (5), (6), (7), (8), (9), (10), (11), (12), (13), (14), (15), (16), (17), (18), (19), (20);

/* 
-------------------------------------------
---------------Table: books----------------
-------------------------------------------
*/

INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (1,9789386768728,'Fundamentals of Automata Theory','Science','2019-04-09','I.K International Publishing House','2019-05-12',70,456.80);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (2,9789386768865,'Programming in C','Science','2018-09-15','I.K International Publishing House','2019-05-12',100,476.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (3,9789350195611,'Introduction to Computer','Science','2011-07-03','Reader''s Zone','2011-08-10',80,296.50);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (4,1860920497,'The Grass Is Always Greener','Fiction','1994-02-17','Modern Times Pvt Ltd','2009-08-11',20,260.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (5,9780133970777,'Fundamentals of Database Systems','Science','2015-06-18','Pearson','2015-08-03',70,896.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (6,9789380674322,'Client Server Computing','Science','2012-02-19','Sun India Publications','2012-03-15',30,564.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (7,9789351633891,'.NET Framework & C#','Science','2015-10-20','Sun India Publications','2009-09-13',30,436.25);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (8,9789380674321,'Data Structure Using C','Science','2012-02-21','Thakur Publications','2015-08-17',50,300.50);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (9,9780679745587,'In Cold Blood','Non-Fiction','1994-06-22','Vintage','2011-07-23',25,872.59);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (10,9780679721013,'Hiroshima','Non-Fiction','1989-04-02','Vintage','2011-07-23',30,456.67);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (11,9780345600123,'Adventures of Huckleberry Finn','Fiction','1991-02-24','Modern Publishing & Kids Books','2011-07-24',20,537.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (12,9789356237012,'India after Gandhi','History','2007-07-24','HarperCollins','2011-07-24',25,467.90);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (13,9789345670014,'Engineering Physics','Science','2012-02-16','Scitech Publications','2016-06-16',50,231.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (14,9782367701456,'Engineering Mechanics','Science','2012-07-28','McGrawHill','2012-08-03',75,420.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (15,9782450123789,'Brief History of Time','History','1988-03-01','Bantam Books','2009-08-01',15,239.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (16,9781581730500,'A Tale Of Two Cities','Fiction','1998-05-12','Sweetwater Press','2012-08-02',20,578.9);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (17,9780465096763,'Wealth, Poverty and Politics','Politics','2016-09-01','Basic Books','2016-11-16',20,506.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (18,9780140120493,'The Great Indian Novel','Fiction','1989-04-01','Penguin Books','2010-05-06',25,410.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (19,9780143031031,'The Discovery of India','History','1946-11-14','Jawaharlal Nehru Memorial Fund','2015-02-25',30,450.00);
INSERT INTO books(item_id,isbn,title,category,pub_date,publisher,arrival,copies,price) VALUES (20,9781787330672,'21 Lessons for the 21st Century','History','2018-08-30','Jonathan Cape','2019-01-02',50,625.00);

/* 
-------------------------------------------
--------------Table: authors---------------
-------------------------------------------
*/

INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (1,9789386768728,'Narendra Kr','Santosh K Sharma','Alok Agrawal');
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (2,9789386768865,'Satya Prakash Yadav',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (3,9789350195611,'Amit Garg',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (4,1860920497,'Jeffrey Archer',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (5,9780133970777,'Ramez Elmasri',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (6,9789380674322,'Lalit Kumar',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (7,9789351633891,'Sharad Kumar Verma',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (8,9789380674321,'Sharad Kumar Verma',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (9,9780679745587,'Truman Capote',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (10,9780679721013,'John Hersey',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (11,9780345600123,'Twain','Mark',NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (12,9789356237012,'Ramchandra Guha',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (13,9789345670014,'Palanisamy',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (14,9782367701456,'Timoshonko','Young',NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (15,9782450123789,'Stephen Hawking',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (16,9781581730500,'Charles Dickens',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (17,9780465096763,'Sowell','Thomas',NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (18,9780140120493,'Shashi Tharoor',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (19,9780143031031,'Jawaharlal Nehru',NULL,NULL);
INSERT INTO authors(author_id,isbn,name1,name2,name3) VALUES (20,9781787330672,'Yuval Noah Harari',NULL,NULL);
