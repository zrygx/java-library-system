# Library Management System 📚

A command-line Java application that simulates a basic library system. It allows users to manage a collection of books using an interactive menu.

## Features
- **Add Books:** Add new books with a title and author.
- **View Library:** Display all books and their current status (Available / Checked Out). Includes an empty-state check.
- **Check Out:** Check out a book by title. Prevents checking out a book that is already checked out.
- **Return:** Return a checked-out book. Prevents returning a book that is already available.
- **Search:** Uses case-insensitive search to easily find books.

## Concepts Used
- **Object-Oriented Programming (OOP):** Separation of concerns between the `Book` blueprint and the `LibrarySystem` logic.
- **Encapsulation:** Private fields in the `Book` class accessed via getters.
- **Data Structures:** `ArrayList` to manage an unlimited number of books.
- **Control Flow:** `while` loops, `switch` statements, and enhanced `for` loops.
- **Input Validation:** Buffer clearing and empty-state checking.