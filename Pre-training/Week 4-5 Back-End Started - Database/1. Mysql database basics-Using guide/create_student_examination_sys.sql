DROP DATABASE IF EXISTS student_examination_sys;
CREATE DATABASE student_examination_sys;
USE student_examination_sys;
CREATE TABLE student 
(
	id varchar(3) not null, 
	name varchar(20) null,
	age int null,
    sex varchar(6) null,
    primary key(id)
);
INSERT INTO student ( id, name, age, sex ) VALUES ( '001', 'zhangsan', 18, 'male');
INSERT INTO student ( id, name, age, sex ) VALUES ( '002', 'lisi', 20, 'female');

CREATE TABLE subject
(
	id varchar(4) not null, 
	subject varchar(20) null,
	teacher varchar(20) null,
    description varchar(50) null,
    primary key(id)
);
INSERT INTO subject ( id, subject, teacher, description ) VALUES ( '1001', 'Chinese', 'Mr. Wang', 'the exam is easy');
INSERT INTO subject ( id, subject, teacher, description ) VALUES ( '1002', 'math', 'Miss Liu', 'the exam is difficult');

CREATE TABLE score
(
	id varchar(1) not null, 
	student_id varchar(3) null,
	subject_id varchar(4) null,
    score float null,
    primary key(id),
    foreign key(student_id) REFERENCES student(id),
    foreign key(subject_id) REFERENCES subject(id)
);
INSERT INTO score ( id, student_id, subject_id, score ) VALUES ( '1', '001', '1001', 80);
INSERT INTO score ( id, student_id, subject_id, score ) VALUES ( '2', '002', '1002', 60);
INSERT INTO score ( id, student_id, subject_id, score ) VALUES ( '3', '001', '1001', 70);
INSERT INTO score ( id, student_id, subject_id, score ) VALUES ( '4', '002', '1002', 60.5);