# 🏦 Insurance Management System (Spring Boot + Angular + JWT)

<br/>

```
▓██   ██▓ ▄▄▄        ██████   ██████  ██▓ ███▄    █ ▓█████     ▄▄▄▄    ▄▄▄       ██░ ██  ▄▄▄      ▓█████▄  ██▓
 ▒██  ██▒▒████▄    ▒██    ▒ ▒██    ▒ ▓██▒ ██ ▀█   █ ▓█   ▀    ▓█████▄ ▒████▄    ▓██░ ██▒▒████▄    ▒██▀ ██▌▓██▒
  ▒██ ██░▒██  ▀█▄  ░ ▓██▄   ░ ▓██▄   ▒██▒▓██  ▀█ ██▒▒███      ▒██▒ ▄██▒██  ▀█▄  ▒██▀▀██░▒██  ▀█▄  ░██   █▌▒██▒
  ░ ▐██▓░░██▄▄▄▄██   ▒   ██▒  ▒   ██▒░██░▓██▒  ▐▌██▒▒▓█  ▄    ▒██░█▀  ░██▄▄▄▄██ ░▓█ ░██ ░██▄▄▄▄██ ░▓█▄   ▌░██░
  ░ ██▒▓░ ▓█   ▓██▒▒██████▒▒▒██████▒▒░██░▒██░   ▓██░░▒████▒   ░▓█  ▀█▓ ▓█   ▓██▒░▓█▒░██▓ ▓█   ▓██▒░▒████▓ ░██░
   ██▒▒▒  ▒▒   ▓▒█░▒ ▒▓▒ ▒ ░▒ ▒▓▒ ▒ ░░▓  ░ ▒░   ▒ ▒ ░░ ▒░ ░   ░▒▓███▀▒ ▒▒   ▓▒█░ ▒ ░░▒░▒ ▒▒   ▓▒█░ ▒▒▓  ▒ ░▓
 ▓██ ░▒░   ▒   ▒▒ ░░ ░▒  ░ ░░ ░▒  ░ ░ ▒ ░░ ░░   ░ ▒░ ░ ░  ░   ▒░▒   ░   ▒   ▒▒ ░ ▒ ░▒░ ░  ▒   ▒▒ ░ ░ ▒  ▒  ▒ ░
 ▒ ▒ ░░    ░   ▒   ░  ░  ░  ░  ░  ░   ▒ ░   ░   ░ ░    ░       ░    ░   ░   ▒    ░  ░░ ░  ░   ▒    ░ ░  ░  ▒ ░
 ░ ░           ░  ░      ░        ░   ░           ░    ░  ░    ░            ░  ░ ░  ░  ░      ░  ░   ░     ░
 ░ ░                                                                ░                              ░          
```
## 📌 Overview

This project is a full-stack web application developed as part of an academic exam in *Distributed Architecture and Middleware*.

It simulates an **insurance management system** where clients can subscribe to different types of insurance contracts, make payments, and manage their policies securely.

The backend is built with **Spring Boot**, and the frontend (to be added) is based on **Angular 19**. Security is handled using **Spring Security + JWT authentication**.

---

## 🚀 Key Features

### 👤 Client Management

* Create, update, delete, and retrieve clients
* Each client can have multiple insurance contracts

### 📄 Insurance Contracts

Three types of contracts:

* 🚗 Automobile Insurance
* 🏠 Housing Insurance
* ❤️ Health Insurance

Each contract includes:

* Subscription date
* Status (IN_PROGRESS, VALIDATED, TERMINATED)
* Duration
* Coverage rate
* Specific attributes depending on contract type

### 💳 Payments

* Multiple payments per contract
* Payment types:

    * Monthly
    * Annual
    * Exceptional

---

## 🔐 Security (JWT)

The application is secured using:

* Spring Security
* JSON Web Token (JWT)
* Role-based access control

### 👥 Roles:

* `ROLE_ADMIN` → full access
* `ROLE_EMPLOYE` → management access
* `ROLE_CLIENT` → restricted access

---

## 🏗️ Architecture

The backend follows a clean layered architecture:

```
Controller → Service → DTO → Repository → Database
```

### Backend Layers:

* **Entities (JPA/Hibernate)**
* **Repositories (Spring Data JPA)**
* **Service Layer (Business Logic)**
* **DTOs & Mappers**
* **REST Controllers**
* **Security Layer (JWT + Spring Security)**

---

## 🧰 Technologies Used

### Backend

* Java 21
* Spring Boot 4
* Spring Data JPA
* Spring Security
* JWT (jjwt)
* Hibernate
* MySQL / H2 Database
* Lombok
* Springdoc OpenAPI (Swagger)

### Frontend (planned)

* Angular 19
* TypeScript
* Bootstrap / Tailwind CSS
* JWT Interceptor

---

## 📡 API Documentation

Once the backend is running, Swagger UI is available at:

```
http://localhost:8085/swagger-ui/index.html
```

---

## ⚙️ How to Run the Project

### 1️⃣ Clone repository

```bash
git clone https://github.com/YOUR_USERNAME/Insurance-Management-System.git
```

---

### 2️⃣ Backend setup

```bash
cd backend
mvn spring-boot:run
```

---

### 3️⃣ Database configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/insurance_db
spring.datasource.username=root
spring.datasource.password=
```

---

### 4️⃣ Default users

| Username | Password | Role        |
| -------- | -------- | ----------- |
| admin    | 1234     | ROLE_ADMIN  |
| client   | 1234     | ROLE_CLIENT |

---

## 🔐 Authentication Flow

1. User logs in via `/auth/login`
2. Server returns JWT token
3. Token is sent in headers:

   ```
   Authorization: Bearer <token>
   ```
4. Spring Security validates token
5. Access granted based on role

---

## 📊 Project Structure

```
src/main/java/
 ├── entities
 ├── repositories
 ├── services
 ├── dto
 ├── mappers
 ├── web
 ├── security
 │    ├── jwt
 │    ├── config
 │    ├── services
 │    └── entities
 └── exceptions
```

---

## 📈 Improvements (Future Work)

* Angular 19 frontend dashboard
* Refresh token system
* Advanced role permissions
* Audit logging
* Docker deployment
* Unit & integration testing

---

## 👨‍💻 Author

* **Name:** Yassine Bahadi
* **Project:** Academic Exam – Distributed Architecture
* **Institution:** ENSET Mohammedia

---

## ⭐ Note

This project was built step-by-step with a focus on:

* Clean architecture
* Security best practices
* Scalability
* Real-world enterprise structure

---

## 📌 Status

🚧 Backend: Completed
🚧 Security: Completed
🚧 Frontend: In progress (Angular 19)

---

## 🤝 Contribution

This project is for educational purposes, but improvements are welcome.

---

## 🏁 Final Words

> “A good architecture is not the one that works, but the one that can evolve.”

---
