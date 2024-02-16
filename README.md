# kafatech-api
___
### Spring Boot

---
This project provides to create grade records for students..

___
The application has 2 apis
* GradeAPI
* DepartmentAPI
* LectureAPI
* InstructorAPI
* StudentAPI

```html
POST /api/grades/createGrade - creates a new grade for existing student
GET /api/grades/findGradeById/{gradeId} - retrieves a grade
GET /api/grades/getAll - retrieves all grades
DELETE /deleteGradeById/{gradeId} - delete grade by id

GET /api/departments/getAll - retrieves all departments

GET /api/instructors/getAll - retrieves all instructors
GET /api/instructors/findInstructorById/{instructorId} - delete instructor by id

GET /api/lectures/getAll - retrieves all lectures
GET /api/lectures/getLectureById/{lectureId} - get lecture by id
GET /api/lectures/getLectureByCode/{lectureCode} - get lecture by lecture code

POST /api/students/createStudent - creates a new student
GET /api/students/findStudentById/{studentId} - retrieves a student
GET /api/students/getAll - retrieves all students

```


### Tech Stack

---
- Java 17
- Spring Boot
- Spring Data JPA
- Restful API
- Docker
- Docker compose

### Prerequisites

---
- Maven
- Docker

### Run & Build

---
There are 2 ways of run & build the application.

#### Docker Compose

For docker compose usage, docker images already push to docker.io

You just need to run `docker-compose up` command
___
*$PORT: 8080*
```ssh
$ cd account
$ docker-compose up
```

#### Maven
___
*$PORT: 8080*
```ssh
$ cd account/account-api
$ mvn clean install
$ mvn spring-boot:run

```

### Swagger UI will be run on this url
`http://localhost:${PORT}/swagger-ui.html`
