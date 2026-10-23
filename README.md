STUDENT MANAGEMENT SYSTEM
Project Overview
The Student Management System is a Core Java console application developed for Task 1 of the Auspify Software Development Internship. It helps users manage student records through a menu-driven interface.
Features
- Add a student record
- View all student records
- Update a student's details
- Delete a student record
- Validate basic input and prevent duplicate student IDs
- Display messages for invalid menu choices and student IDs
Technologies Used
- Java
- ArrayList for in-memory record storage
- Scanner for console input
Project Files
- Student.java — defines the student record and its fields.
- StudentManagementSystem.java — contains the menu and CRUD operations.
Requirements
- Java Development Kit (JDK) installed
- Command Prompt or a terminal
- A code editor such as Visual Studio Code (optional)
How to Compile and Run
Open a terminal in the folder containing both Java files.

Compile:
javac Student.java StudentManagementSystem.java
Run:
java StudentManagementSystem
How to Use
When the program starts, choose an option from the menu:
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Follow the prompts to enter the student ID, name, age, and course.
Testing
Test the following scenarios:
- Add a student with a unique ID.
- View student records.
- Update an existing student's details.
- Delete an existing student.
- Attempt to update or delete a student ID that does not exist.
- Attempt to add a duplicate student ID.
- Enter an invalid menu option.
Limitations
Student records are stored in memory using an ArrayList. Records are cleared when the application exits. Database storage and a graphical interface are not included in this version.


Internship Task
Auspify Technologies — Software Development Internship
Task 1: Student Management System
Author
Erelli Ushasree