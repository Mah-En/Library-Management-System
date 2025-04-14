# Library Management System

## 📚 Introduction
This application is developed to simulate a basic library management system. It enables both users and librarians to interact with a digital library environment through the command line.

---

## 🎯 Objectives
- Enable new users to register and login to the library system.
- Allow users to browse books, borrow them, and return them.
- Provide librarians the ability to manage book inventory and user access.
- Support searching books and checking their availability.
- Maintain a record of all users, librarians, and books in the system.

---

## 🛠️ Project Tasks

1. Forked the repository and cloned it locally. Created a new branch before development.
2. Completed and implemented core classes:
   - `Book` – Book details and accessors
   - `User` – Library members with credentials and borrowed books
   - `Librarian` – Admin role with management privileges
   - `Library` – Central system managing all entities
3. Implemented the interactive CLI using the `Main` class:
   - **Users** can register, login, logout, borrow, and return books.
   - **Librarians** can login, logout, add/remove books and manage users.
4. Enforced username uniqueness and password-based authentication.
5. Maintained collections of all books, users, and librarians with in-memory data structures.
6. Used Git for version control:
   - Committed changes incrementally with meaningful messages.
   - Merged feature branch into `develop`.
   - Pushed all changes to the GitHub fork.

---

## 📦 System Overview

### Class Structure

| Class      | Description |
|------------|-------------|
| `Book`     | Represents a book with title, author, year, and ISBN. |
| `User`     | Handles user login data and manages borrowed books. |
| `Librarian`| Stores librarian credentials. |
| `Library`  | Core class that maintains collections of books, users, and librarians, and provides all main operations. |
| `Main`     | CLI interface, handles interaction logic between user and system. |

---

## 🧪 Functionalities

### 👤 User Operations
- Register or login
- Borrow books
- Return books
- View available books
- Logout

### 🔐 Librarian Operations
- Login and authentication
- Add new books or increase quantity
- Remove books or decrease quantity
- Add/remove users and librarians
- Logout

---

## 🧾 Sample Code Snippet

```java
if (!library.doesBookExist(name, author, year, isbn)) {
    System.err.println("This book doesn't exist!");
} else {
    library.removeBook(name, author, year, isbn);
}
```

This code checks if a book exists in the library before removing a copy from the system.

---

## ✅ Evaluation

- ✔️ Code compiles and executes without errors.
- ✔️ Object-Oriented Programming principles are applied properly.
- ✔️ Good use of encapsulation and access modifiers.
- ✔️ Code is clean, readable, and well-commented.
- ✔️ Git is used for version control with structured commits and proper branching.

---

## 🚀 Future Improvements
- Integrate persistent storage using a database or file system.
- Develop a GUI using JavaFX or Swing.
- Implement user roles and permissions more securely.
- Track book due dates and overdue fines.

---
