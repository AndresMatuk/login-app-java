# Login Application - Java Spring Boot, JDBC and MySQL

## Description

This project is a web application developed in Java using Spring Boot that allows user authentication against a MySQL database.

The system follows the MVC (Model - View - Controller) architectural pattern and applies the component-based programming paradigm, ensuring a clear separation of responsibilities across the application.

---

## Technologies Used

- Java 17
- Spring Boot
- JDBC (Java Database Connectivity)
- MySQL
- Thymeleaf
- Bootstrap 5
- Maven
- Git and GitHub

---

## System Architecture

The application is structured using the MVC pattern:

### Model (`model`)

Responsible for data management and business logic.

- `Cliente.java`: Represents the Cliente entity (POJO)
- `TipoDocumento.java`: Enum for document types
- `Conexion.java`: Handles JDBC database connection
- `ClienteDao.java`: Data Access Object for database operations

---

### Controller (`controller`)

Handles user requests and application flow.

- `LoginController.java`:
  - Manages routes
  - Handles authentication
  - Processes user registration
  - Sends data to the view layer

---

### View (`templates`)

Responsible for the user interface.

- `login.html`: Login form
- `registro.html`: User registration form
- `perfil.html`: Displays authenticated user data
- `bienvenido.html`: Success page
- `error.html`: Error page

---

## Application Flow

1. The user accesses the login page via `GET /`
2. Credentials are entered in the form
3. Data is sent via `POST /login`
4. The controller processes the request
5. The DAO executes a SQL query using JDBC
6. If the user exists:
   - The system displays user data in `perfil.html`
7. Otherwise:
   - The error view is displayed

---

## Main Features

- User authentication
- User registration
- Use of ENUM for controlled data values
- Personalized data view (users only see their own data)
- SQL Injection prevention using `PreparedStatement`
- Responsive interface using Bootstrap

---

## Database

The application uses a MySQL database named:

login_db

### Table: `Cliente`

Fields:

| Field | Description |
|------------|------------------------|
| TipoID | Document type (ENUM) |
| NroID | Document number |
| Nombre | First name |
| Apellido | Last name |
| Usuario | Username |
| Contrasena | Password |
| NoCelular | Phone number |
| Correo | Email address |

The SQL script is available at:

/database/login_db.sql

---

## How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/AndresMatuk/login-app-java.git
```

2. Import the project into Spring Tool Suite or Eclipse

3. Configure database credentials in: Conexion.java

4. Run the application: LoginAppApplication.java

5. Open in browser: http://localhost:8080/

---

## Test Credentials

Username: admin
Password: 1234

---

## Author

**Andrés Matuk**

---

## Academic Purpose

This project was developed to demonstrate:

- Component-based programming
- MVC architecture
- Database connectivity using JDBC
- Web application development in Java
