insert into category
	values (1, 'framework'),
			(2, 'devops'),
			(3, 'architecture'),
			(4, 'database'),
			(5, 'sourcecode'),
			(6, 'ide');
		
insert into skill
	values (1, 'Angular', 1),
			(2, 'Jenkins', 2),
			(3, 'MVC', 3),
			(4, 'Postgres', 4),
			(5, 'git', 5),
			(6, 'Eclipse', 6),
			(7, 'Spring', 1),
			(8, 'Hibernate', 1),
			(9, 'Maven', 2),
			(10, 'npm', 2),
			(11, 'Tomcat', 2),
			(12, 'SOA', 3),
			(13, 'Microservices', 3),
			(14, 'Containers', 3),
			(15, 'Oracle', 4),
			(16, 'RDS', 4),
			(17, 'GitHub', 5),
			(18, 'IntelliJ', 6),
			(19, 'Visual Studio Code', 6),
			(20, 'Postman', 6),
			(21, 'React', 1);
insert into curriculum
	values (1, 'FullStack'),
			(2, '.Net'),
			(3, 'CyberSecurity');
insert into visualization
	values (1, 'HitachiConsulting'),
			(2, 'CollegeBoard'),
			(3, 'Cognizant');
insert into curriculum_skill
	values (1, 4),
			(1, 5),
			(1, 7),
			(1, 19),
			(2, 2),
			(2, 3),
			(2, 11),
			(2, 20),
			(3, 1),
			(3, 6),
			(3, 12),
			(3, 18);
insert into visualization_curriculum
	values (1, 1),
			(1, 2),
			(1, 3),
			(2, 1),
			(2, 2),
			(2, 3),
			(3, 1),
			(3, 2),
			(3, 3);