SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS teacher;
DROP TABLE IF EXISTS authors;
DROP TABLE IF EXISTS periodicals;
DROP TABLE IF EXISTS bag;
DROP TABLE IF EXISTS issues;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS books;

SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `users` (
  `user_id` int PRIMARY KEY AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `created_at` datetime NOT NULL,
  `authority` ENUM ('ROLE_STUDENT', 'ROLE_TEACHER', 'ROLE_LIBRARIAN') NOT NULL,
  `enabled` boolean NOT NULL DEFAULT true
);

CREATE TABLE `student` (
  `user_id` int,
  `roll_no` bigint PRIMARY KEY,
  `card_id` varchar(255),
  `dob` date,
  `yoa` date,
  `year` varchar(255),
  `dept` varchar(255),
  `course` varchar(255),
  `phone` varchar(255),
  `address` varchar(255),
  `total_fine` float,
  `remarks` varchar(255),
  `total_items` int
);

CREATE TABLE `teacher` (
  `user_id` int,
  `tid` int PRIMARY KEY AUTO_INCREMENT,
  `card_id` varchar(255),
  `dob` date,
  `yoap` date,
  `dept` varchar(255),
  `phone` varchar(255),
  `address` varchar(255),
  `total_fine` float,
  `remarks` varchar(255),
  `total_items` int
);

CREATE TABLE `items` (
  `item_id` int PRIMARY KEY AUTO_INCREMENT,
  `deleted` boolean
);

CREATE TABLE `books` (
  `item_id` int,
  `isbn` bigint PRIMARY KEY,
  `title` varchar(255),
  `category` varchar(255),
  `pub_date` date,
  `publisher` varchar(255),
  `arrival` date,
  `copies` int,
  `price` float
);

CREATE TABLE `authors` (
  `author_id` int PRIMARY KEY AUTO_INCREMENT,
  `isbn` bigint,
  `name1` varchar(255),
  `name2` varchar(255),
  `name3` varchar(255)
);

CREATE TABLE `periodicals` (
  `item_id` int,
  `issn` bigint PRIMARY KEY,
  `title` varchar(255),
  `type` varchar(255),
  `category` varchar(255),
  `pub_date` date,
  `publisher` varchar(255),
  `arrival` date,
  `copies` int,
  `price` float
);

CREATE TABLE `bag` (
  `bgid` int PRIMARY KEY AUTO_INCREMENT,
  `user_id` int,
  `item_id` int,
  `added_on` datetime
);

CREATE TABLE `issues` (
  `issue_id` int PRIMARY KEY AUTO_INCREMENT,
  `user_id` int,
  `item_id` int,
  `issued_on` datetime,
  `returned_on` datetime,
  `due_on` date,
  `status` ENUM ('issued', 'returned') DEFAULT "issued"
);

ALTER TABLE `student` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

ALTER TABLE `teacher` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

ALTER TABLE `books` ADD FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`);

ALTER TABLE `authors` ADD FOREIGN KEY (`isbn`) REFERENCES `books` (`isbn`);

ALTER TABLE `periodicals` ADD FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`);

ALTER TABLE `bag` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

ALTER TABLE `bag` ADD FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`);

ALTER TABLE `issues` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

ALTER TABLE `issues` ADD FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`);
