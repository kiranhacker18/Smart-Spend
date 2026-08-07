# 💰 SmartSpend

SmartSpend is a full-stack personal finance management web application that helps users track their income and expenses through a clean and responsive dashboard. It provides secure user authentication, real-time balance calculations, and transaction management using a lightweight Spring Boot backend and a modern HTML, CSS, and JavaScript frontend.

---

## 🚀 Features

* 🔐 User Signup & Login
* 💵 Add Income and Expense Transactions
* 📋 View Transaction History
* 📊 Real-Time Balance, Income & Expense Summary
* 🗑️ Delete Transactions
* 👤 User-Specific Data Isolation
* 🌙 Responsive Dark-Themed UI

---

## 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot 3
* Spring Data JPA
* Hibernate
* H2 In-Memory Database
* Maven

### Frontend

* HTML5
* CSS3
* JavaScript (ES6)
* Fetch API

---

## 📂 Project Structure

```text
SmartSpend/
├── src/
│   ├── main/
│   │   ├── java/com/example/smartspend/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── DemoApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           ├── auth.html
│   │           └── index.html
├── pom.xml
└── README.md
```

---

## ⚙️ Getting Started

### Prerequisites

* Java 17 or later
* Maven

### Clone the Repository

```bash
git clone https://github.com/kiranhacker18/Smart-Spend.git
cd Smart-Spend
```

### Run the Application

```bash
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## 🌐 Access the Application

Open your browser and visit:

```
http://localhost:8081/auth.html
```

---

## 🗄️ Database

The project uses an **H2 In-Memory Database**.

H2 Console:

```
http://localhost:8081/h2-console
```

Connection Details:

```
JDBC URL : jdbc:h2:mem:testdb
Username : sa
Password : password
```

---

## 📡 REST API Endpoints

### Authentication

| Method | Endpoint           | Description         |
| ------ | ------------------ | ------------------- |
| POST   | `/api/auth/signup` | Register a new user |
| POST   | `/api/auth/login`  | Login user          |

### Transactions

| Method | Endpoint                 | Description          |
| ------ | ------------------------ | -------------------- |
| GET    | `/api/transactions`      | Get all transactions |
| POST   | `/api/transactions`      | Add a transaction    |
| DELETE | `/api/transactions/{id}` | Delete a transaction |


---

## 🔮 Future Enhancements

* JWT Authentication
* Password Encryption (BCrypt)
* MySQL/PostgreSQL Support
* Edit Transactions
* Search & Filter Transactions
* Monthly Reports
* Charts & Analytics
* Export Transactions (PDF/Excel)

---

## 👨‍💻 Author

**Kiran T R**

* GitHub: https://github.com/kiranhacker18

---

## 📄 License

This project is developed for educational and learning purposes.
