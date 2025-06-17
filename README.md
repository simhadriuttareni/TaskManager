
### ✅ `README.md`

```markdown
# 📝 TaskManager API

A Spring Boot REST API for managing tasks — designed for CRUD operations with PostgreSQL integration.

## 🚀 Features

- ✅ Create, Read, Update, and Delete (CRUD) tasks
- ✅ RESTful API endpoints
- ✅ PostgreSQL database integration
- ✅ Layered architecture (Controller, Service, Repository)
- ✅ Tested with Postman
- ✅ Follows best practices (Exception handling, Validation, etc.)

## 🔧 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

## 📁 Project Structure

```

taskmanager/
├── controller/
│   └── TaskController.java
├── model/
│   └── Task.java
├── repository/
│   └── TaskRepository.java
├── service/
│   └── TaskService.java
├── application.properties
└── TaskManagerApplication.java

````

## ⚙️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/simhadriuttareni/TaskManager.git
cd TaskManager
````

### 2. Configure PostgreSQL

Make sure PostgreSQL is running locally and update your `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/testdb
spring.datasource.username=postgres
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 3. Run the app

```bash
./mvnw spring-boot:run
```

Or run it from your IDE (IntelliJ, Eclipse, VS Code, etc.)

## 📬 API Endpoints

| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| GET    | `/api/tasks`      | Get all tasks       |
| GET    | `/api/tasks/{id}` | Get a task by ID    |
| POST   | `/api/tasks`      | Create a new task   |
| PUT    | `/api/tasks/{id}` | Update a task by ID |
| DELETE | `/api/tasks/{id}` | Delete a task by ID |

## 📮 Sample JSON

```json
{
  "title": "Finish Spring Boot Project",
  "description": "Push the final code to GitHub",
  "completed": false
}
```

## 📌 Todo

* [ ] Add JWT Authentication
* [ ] Add Swagger API docs
* [ ] Deploy to cloud (Render / Railway / AWS)

## 💡 Author

**Simhadri Uttareni**
🔗 [GitHub](https://github.com/simhadriuttareni)

---

```

---

