# SimplyBanking – Java CLI Banking App

**SimplyBanking** is a command-line Java application that simulates basic banking operations. Users can:

* ✅ Create new bank accounts
* 🔐 Sign in to existing accounts
* 💰 Check account balances
* ➕ Deposit funds
* ➖ Withdraw funds

---

## 🛠️ Tech Stack

* **Language**: Java
* **Build Tool**: Maven
* **Testing**: JUnit 5

---

## ⚙️ How It Works

The project is structured into a few key components, each following clean code principles:

### `App.java` – **User Interface**

The entry point of the application. Provides a text-based menu in the console where users can:

* Choose options via numbered menu
* Enter details like name, PIN, and transaction amounts

---

### `AccountObject.java` – **Data Model**

Defines the structure of a bank account:

* Unique ID
* Account holder’s name
* Secure PIN
* Current balance

---

### `AccountService.java` – **Business Logic**

The "brains" of the system. Handles operations like:

* Creating new accounts
* Checking balance
* Depositing and withdrawing
* Verifying PINs and enforcing rules (e.g., no overdrafts)

---

### `AccountRepository.java` – **In-Memory Storage**

Responsible for storing and retrieving account data. It:

* Maintains a list of all accounts in memory
* Finds accounts by name
* Adds new accounts

---

### 🔐 Exception Handling

Uses custom exceptions for robust and clear error handling:

* `AccountNotFoundException` – Triggered when logging into a non-existent account
* `InsufficientBalanceException` – Prevents overdrafts during withdrawals

---

## 🔁 Data Flow Overview

```text
User ⇨ App.java ⇨ AccountService.java ⇨ AccountObject.java + AccountRepository.java
```

---

## ✅ Clean Code Principles in Action

### 🔹 Example #1: Repository Class (SRP)

The `AccountRepository` class cleanly follows the **Single Responsibility Principle** by isolating **all data storage and retrieval logic**.

> *“One class, one reason to change.”*

<img width="835" alt="Screenshot 2025-06-01 at 3 24 01 PM" src="https://github.com/user-attachments/assets/7ccd9979-e7b2-46d5-b947-912b1c88a17f" />

---

### 🔹 Example #2: Exception Handling

The withdrawal logic uses a **custom `InsufficientBalanceException`** to enforce a **fail-fast** policy. This makes business rules (like "no overdrafts") explicit and traceable.

<img width="939" alt="Screenshot 2025-06-01 at 3 25 00 PM" src="https://github.com/user-attachments/assets/ffbd2ff6-0a03-45d1-a1fb-be1c7152cf9d" />

---

### 🔹 Example #3: User Validation Loop

Implements **defensive programming** by confirming user identity with a PIN **before** allowing access to sensitive operations.

<img width="626" alt="Screenshot 2025-06-01 at 3 26 08 PM" src="https://github.com/user-attachments/assets/62722439-2ee1-4ef7-90a0-3efaf2e1fc5f" />

---

## 📦 Project Goals

* Practice modular, maintainable Java code
* Implement clean architecture principles
* Simulate real-world application flow
* Use unit testing for core logic verification

