# 📦 Online Electronic Store

## 📖 Overview

The **Online Electronic Store** is a web-based application that allows users to browse and purchase electronic products. The platform provides functionality for both **customers** and **administrators**, enabling a seamless shopping experience.

---

## 🚀 Features

- **User Registration & Login** (Customers & Admins)
- **Product Management** (Add, Update, Delete Products)
- **Customer Dashboard** (Browse & Purchase Products)
- **Admin Panel** (Manage Users & Orders)
- **Secure Authentication System**
- **Responsive Web Design**

---

## 🏗️ Technologies Used

- **Frontend:** HTML, CSS, JavaScript
- **Backend:** Java (J2EE, Servlets, JSP)
- **Database:** Oracle SQL (PL/SQL)
- **IDE:** Eclipse
- **Version Control:** Git & GitHub

---

# 🛠 How to Run This Project

## Prerequisites

Before running the **Online Electronic Store**, ensure you have the following installed:

- **Java JDK 8+**
- **Eclipse IDE** (or any Java-supported IDE)
- **Apache Tomcat (Version 9 or below)** *(For Tomcat 10+, see special note)*
- **Oracle Database**
- **Git** (for version control, if needed)

---

## 📂 Setup Instructions

### 1️⃣ Extract the Project

1. Download the project ZIP file.
2. Unzip and extract it to your preferred directory.

---

### 2️⃣ Create Database Tables

Run the following SQL queries in **Oracle SQL** to create the required tables:

#### **Product Table**

```sql
CREATE TABLE product (
    PCODE VARCHAR2(25) PRIMARY KEY,
    PNAME VARCHAR2(25),
    PCOMPANY VARCHAR2(25),
    PPRICE VARCHAR2(25),
    PQTY VARCHAR2(25)
);
```

#### **Admin Table**

```sql
CREATE TABLE admin (
    UNAME VARCHAR2(25) PRIMARY KEY,
    PWRD VARCHAR2(25),
    FNAME VARCHAR2(25),
    LNAME VARCHAR2(25),
    ADDR VARCHAR2(25),
    MID VARCHAR2(25),
    PHNO VARCHAR2(25)
);
```

#### **Customer Table**

```sql
CREATE TABLE customer (
    UNAME VARCHAR2(25) PRIMARY KEY,
    PWRD VARCHAR2(25),
    FNAME VARCHAR2(25),
    LNAME VARCHAR2(25),
    ADDR VARCHAR2(25),
    MID VARCHAR2(25),
    PHNO VARCHAR2(25)
);
```

---

### 3️⃣ Add Admin Credentials (Mandatory)

Since admin registration isn't available via UI, manually insert admin credentials into the **admin** table:

```sql
INSERT INTO admin (UNAME, PWRD, FNAME, LNAME, ADDR, MID, PHNO)  
VALUES ('admin', 'admin123', 'Xyz', 'Acb', 'Hyd', 'admin@example.com', '1234567890');
```

---

### 4️⃣ Configure Database Connection

1. Open `DBInfo.java`.
2. Update database credentials as per your Oracle DB setup:
   ```java
   public String DBUrl="jdbc:oracle:thin:@localhost:1521:orcl";
   public String DBUserName="Your_Username";
   public String DBPwd="Your_Password"; 
   ```

---

### 5️⃣ Configure Tomcat Server

1. Add **Tomcat server** in Eclipse.
2. Add the **`servlet-api.jar`** (already included, but check version).
3. If using **Tomcat 10+**, replace **`javax.servlet.*`** with **`jakarta.servlet.*`** in all servlet pages.

---

### 6️⃣ Run the Project 🚀

1. Start the **Oracle Database**.
2. Run the **Tomcat server** from Eclipse.
3. Open your browser and go to:
   ```
   http://localhost:8086/OnlineElectronicStore/
   ```
4. Login as an **admin** (use inserted credentials) or **register as a customer**.

🎉 Your **Online Electronic Store** is now running successfully!

---

# 💡 Troubleshooting

- **Database Connection Issue?** Check `DBInfo.java` for correct username/password.
- **Tomcat Error?** Ensure **servlet-api.jar** or **Jakarta API** (for Tomcat 10+) is added.
- **Page Not Found?** Verify the deployment path matches your project folder.

---

## 🔗 Author

📧 **SRIDHAR CHINTHALA** – [chinthalasridhar70@gmail.com](mailto\:chinthalasridhar70@gmail.com)

---

## License

This project is licensed under the [MIT] License - see the LICENSE.md file for details

