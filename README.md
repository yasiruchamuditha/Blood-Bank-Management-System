# 🩸 Blood Bank Management System

A desktop-based **Blood Bank Management System** built with Java Swing and MySQL, designed to manage the core operations of a national blood bank. The system supports three distinct user roles — **Donors**, **Medical Staff**, and **Admins** — and covers the full lifecycle of blood donation, storage, and distribution.

> Developed as a semester project for **Enterprise Application Development – 1** under the **Diploma in Software Engineering**.

---

## 📋 Table of Contents

- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [Prerequisites](#-prerequisites)
- [Database Setup](#-database-setup)
- [Installation & Running](#-installation--running)
- [Project Structure](#-project-structure)
- [User Roles](#-user-roles)
- [Database Schema](#-database-schema)
- [Author](#-author)

---

## ✨ Features

- **Multi-role authentication** — separate login/signup flows for Donors, Medical Staff, and Admins
- **Password recovery** — security-question-based forgotten password reset
- **Appointment scheduling** — donors can book donation appointments at blood bank centres
- **Donation management** — record and track individual donation events with health metrics
- **Blood inventory** — real-time storage tracking for all 8 blood groups
- **Blood distribution** — transaction records for distributing blood to hospitals/patients
- **Organisation management** — register and manage hospitals and partner organisations
- **Email notifications** — automated confirmation emails on registration (javax.mail)
- **Reports & analytics** — printable JasperReports and JFreeChart-powered charts
- **Data validation** — input validation throughout all forms

---

## 🛠 Technology Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| GUI | Java Swing (JFrame) |
| Architecture | MVC (Model–View–Controller) |
| Build tool | Apache Ant |
| IDE | NetBeans |
| Database | MySQL 8.0+ |
| DB connector | MySQL Connector/J 8.0.30 |
| Reporting | JasperReports 6.3.0 |
| Charts | JFreeChart 1.0.19 |
| Email | javax.mail |
| UI extras | SwingX 0.9.1 |
| AOP/DI | Spring Framework 3.0.6 |

---

## ✅ Prerequisites

- **Java 17** or higher ([Download](https://www.oracle.com/java/technologies/downloads/))
- **MySQL Server 8.0+** ([Download](https://dev.mysql.com/downloads/mysql/))
- **NetBeans IDE** (recommended) or any Java IDE
- **Apache Ant** (bundled with NetBeans, or install separately)
- Required JAR libraries (see `BloodBankManagementSystem/` project lib references):
  - `mysql-connector-java-8.0.30.jar`
  - JasperReports 6.3.0 and its dependencies
  - JFreeChart 1.0.19
  - Spring Framework 3.0.6
  - SwingX 0.9.1
  - javax.mail

---

## 🗄 Database Setup

1. Open your MySQL client (MySQL Workbench, CLI, etc.).
2. Create the database:
   ```sql
   CREATE DATABASE NationalBloodBank;
   ```
3. Import the provided SQL dump:
   ```bash
   mysql -u root -p NationalBloodBank < Database-nationalbloodbank/nationalbloodbank.sql
   ```
4. *(Optional)* If your MySQL user or password differs from the defaults, update the connection details in:
   ```
   BloodBankManagementSystem/src/Model/dbConnection.java
   ```
   ```java
   // Default configuration
   String url  = "jdbc:mysql://localhost:3306/NationalBloodBank";
   String user = "root";
   String pass = "";   // change if your root user has a password
   ```

---

## 🚀 Installation & Running

### Option A — NetBeans IDE

1. Clone or download this repository.
2. Open **NetBeans** → **File → Open Project** → select `BloodBankManagementSystem/`.
3. Add all required JAR files to the project's library.
4. Right-click the project → **Clean and Build**.
5. Right-click the project → **Run**.

### Option B — Apache Ant (command line)

```bash
cd BloodBankManagementSystem
ant clean build
java -jar dist/BloodBankManagementSystem.jar
```

> **Note:** Ensure all dependency JARs are on the classpath or in the `lib/` directory referenced by `build.xml`.

---

## 📁 Project Structure

```
Blood-Bank-Management-System/
├── BloodBankManagementSystem/          # Main Java application (NetBeans project)
│   ├── src/
│   │   ├── View/                       # GUI screens (25+ JFrame classes) + images & reports
│   │   ├── Model/                      # Database operations & business logic (19 classes)
│   │   ├── Controller/                 # Event handlers (18 classes)
│   │   └── bloodbankmanagementsystem/  # Application entry point
│   ├── dist/
│   │   └── BloodBankManagementSystem.jar  # Compiled runnable JAR
│   ├── build.xml                       # Ant build script
│   └── manifest.mf
├── Database-nationalbloodbank/
│   └── nationalbloodbank.sql           # Full MySQL database dump
└── README.md
```

---

## 👥 User Roles

| Role | Capabilities |
|---|---|
| **Donor** | Register, log in, book/view donation appointments, view donation history, update profile, password recovery |
| **Medical Staff** | Register, log in, verify donors, record donations, manage appointments, view blood inventory |
| **Admin** | Manage staff accounts, manage organisations, approve transactions, view analytics & reports, full system oversight |

---

## 🗃 Database Schema

| Table | Description |
|---|---|
| `donor` | Donor personal details (NIC, name, DOB, blood group, contact, email) |
| `medicalstaff` | Medical staff records (NIC, name, department, credentials) |
| `admin` | Admin credentials and information |
| `donation` | Individual donation records (donor, blood type, health metrics, quantity, location) |
| `donorappointment` | Appointment bookings (donor, date/time, centre, blood group) |
| `organization` | Registered hospitals and partner organisations |
| `storage` | Blood bag inventory per blood group |
| `transcation` | Blood distribution/transaction records (patient, date, hospital, issuing officer) |
| `securityquestion` | Password-recovery security questions (3 per user) |
| `donororganization` | Links donors to organisation-run donation campaigns |

---

## 👤 Author

**Yasiru Chamuditha**
- 🔗 [linktr.ee/yasiruchamuditha](https://linktr.ee/yasiruchamuditha)
- 📁 [GitHub Repository](https://github.com/yasiruchamuditha/Blood-Bank-Management-System)

---

*This project was developed as part of the **Enterprise Application Development – 1** module under the Diploma in Software Engineering.*
