insert into department(department_id, department_name) values (1, 'Business');
insert into department(department_id, department_name) values (2, 'Computer Engineering');
insert into department(department_id, department_name) values (3, 'Math');
insert into department(department_id, department_name) values (4, 'History');
insert into department(department_id, department_name) values (5, 'Physics');

insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522818921','Umut', 'Okur', 1);
insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522813921','Selim', 'Beyaz', 2);
insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522814921','Mehmet', 'Yılmaz', 4);
insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522815921','Ayşe', 'Erdoğan', 5);
insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522816921','Deniz', 'Kelam', 3);
insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522817921','Mahmut', 'Ertem', 5);
insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522811921','Ferit', 'Yemen', 4);
insert into student(student_id, first_name, last_name, department_id) values ('b55c92c7-8463-4e3b-af2d-41a522812921','Burak', 'Kılıç', 2);

insert into instructor(instructor_id, first_name, last_name, department_id) values ('a55c92c7-8463-4e3b-af2d-41a522812921', 'Merve', 'Topbas', 5);
insert into instructor(instructor_id, first_name, last_name, department_id) values ('c55c92c7-8463-4e3b-af2d-41a522812921', 'Elif', 'Yılmaz', 1);
insert into instructor(instructor_id, first_name, last_name, department_id) values ('d55c92c7-8463-4e3b-af2d-41a522812921', 'Ahmet', 'Veli', 3);

insert into lecture(lecture_id, lecture_code, lecture_name, instructor_id, department_id) values('a51c92c7-8463-4e3b-af2d-41a522812921', 'BUS101','Introduction to Business', 'c55c92c7-8463-4e3b-af2d-41a522812921', 1);
insert into lecture(lecture_id, lecture_code, lecture_name, instructor_id, department_id) values('a42c92c7-8463-4e3b-af2d-41a522812921', 'PHY101','Introduction to Physics', 'a55c92c7-8463-4e3b-af2d-41a522812921', 5);
insert into lecture(lecture_id, lecture_code, lecture_name, instructor_id, department_id) values('a33c92c7-8463-4e3b-af2d-41a522812921', 'CENG201','OOP Programming', 'd55c92c7-8463-4e3b-af2d-41a522812921', 2);
insert into lecture(lecture_id, lecture_code, lecture_name, instructor_id, department_id) values('a24c92c7-8463-4e3b-af2d-41a522812921', 'MATH303','Complex Analysis', 'd55c92c7-8463-4e3b-af2d-41a522812921', 3);

insert into grade(grade_id, grade_point, letter_grade, lecture_id, student_id) values ('b55c92c7-8463-4e3b-af2d-41a522812923', 78.5, 'BB', 'a51c92c7-8463-4e3b-af2d-41a522812921', 'b55c92c7-8463-4e3b-af2d-41a522813921');
insert into grade(grade_id, grade_point, letter_grade, lecture_id, student_id) values ('b55c92c7-8463-4e3b-af2d-41a522812924', 92.5, 'AA', 'a42c92c7-8463-4e3b-af2d-41a522812921', 'b55c92c7-8463-4e3b-af2d-41a522813921');
insert into grade(grade_id, grade_point, letter_grade, lecture_id, student_id) values ('b55c92c7-8463-4e3b-af2d-41a522812925', 78.5, 'BB', 'a42c92c7-8463-4e3b-af2d-41a522812921', 'b55c92c7-8463-4e3b-af2d-41a522816921');
insert into grade(grade_id, grade_point, letter_grade, lecture_id, student_id) values ('b55c92c7-8463-4e3b-af2d-41a522812926', 78.5, 'BB', 'a33c92c7-8463-4e3b-af2d-41a522812921', 'b55c92c7-8463-4e3b-af2d-41a522816921');
insert into grade(grade_id, grade_point, letter_grade, lecture_id, student_id) values ('b55c92c7-8463-4e3b-af2d-41a522812927', 78.5, 'BB', 'a24c92c7-8463-4e3b-af2d-41a522812921', 'b55c92c7-8463-4e3b-af2d-41a522817921');