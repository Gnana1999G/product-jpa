# Product Inventory REST API

A Spring Boot backend application for managing products using REST APIs and MySQL database integration with Spring Data JPA and Hibernate.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Eclipse IDE
- Postman

---

## Features

- Add Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product
- MySQL Database Integration
- Automatic Table Creation using Hibernate

---

## Project Structure

```text
src/main/java
 ├── controller
 │     └── ProductController
 │
 ├── model
 │     └── Product
 │
 ├── repository
 │     └── ProductRepository
 │
 ├── service
 │     └── ProductService
 │
 └── ProductJpaApplication
```

---

## REST API Endpoints

### Add Product

POST

```bash
http://localhost:8080/products
```

Request Body:

```json
{
  "name": "Laptop",
  "price": 65000,
  "quantity": 5
}
```

---

### Get All Products

GET

```bash
http://localhost:8080/products
```

---

### Get Product By ID

GET

```bash
http://localhost:8080/products/1
```

---

### Update Product

PUT

```bash
http://localhost:8080/products/1
```

Request Body:

```json
{
  "name": "Gaming Laptop",
  "price": 85000,
  "quantity": 3
}
```

---

### Delete Product

DELETE

```bash
http://localhost:8080/products/1
```

---

## Database Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## MySQL Setup

Create database:

```sql
CREATE DATABASE productdb;
```

---

## How to Run the Project

### 1. Clone Repository

```bash
git clone <your-repository-url>
```

---

### 2. Open in Eclipse

Import as:

```text
Existing Maven Project
```

---

### 3. Configure Database

Update MySQL username and password inside:

```text
src/main/resources/application.properties
```

---

### 4. Run Application

```text
Run As → Spring Boot App
```

---

### 5. Test APIs

Use:
- Postman
- Browser
- Swagger (future enhancement)

---

## Concepts Learned

- REST APIs
- Spring Boot Architecture
- Spring Data JPA
- Hibernate ORM
- Entity Mapping
- Repository Layer
- CRUD Operations
- MySQL Integration
- Dependency Injection

---

## Future Improvements

- Validation
- Exception Handling
- Swagger Documentation
- JWT Authentication
- Docker Support
- Pagination & Sorting
- Search APIs
- Cloud Deployment

---

## Sample Database Table

| id | name | price | quantity |
|----|------|--------|-----------|
| 1 | Laptop | 65000 | 5 |

---

## Author

Gattam Gnanendra

---

## GitHub Topics

```text
spring-boot
java
mysql
hibernate
jpa
rest-api
backend
maven
```
