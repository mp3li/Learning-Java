# Student Records Manager

Student Records Manager is a menu-based Java console application that stores and manages student records using an `ArrayList`. The program supports common record-management tasks including add, list, search, update, remove, sort, and statistics. It demonstrates key Java fundamentals: OOP design with multiple classes, algorithmic problem-solving, recursion, and input validation.

## How to Run

1. Open a terminal in this folder:
   `Final Project - Java Fundamentals Portfolio Program`
2. Compile:
   `javac Main.java Student.java StudentManager.java`
3. Run:
   `java Main`

## Implemented Features

- Add a student
- List all students
- Search by Student ID
- Search by Last Name
- Update student information
- Remove a student
- Sort students by ID or by last name
- Compute statistics:
  - Average score
  - Highest score student
  - Count above threshold score

## Input Validation Included

- Rejects duplicate student IDs
- Handles non-numeric input for menu choices, IDs, and scores
- Prevents empty first/last names
- Enforces valid ranges (menu options, positive IDs, score between 0 and 100)

## Recursion Usage

Recursion is used in `StudentManager` in two meaningful places:

- `findStudentByIdRecursive(...)` recursively searches students by ID
- `countAboveThresholdRecursive(...)` recursively counts students above a score threshold

Both methods use a clear base case (`index >= students.size()`) and recursive progression (`index + 1`).

## Example Records Used for Testing

- `1001, Ava Johnson, 88.5`
- `1002, Liam Chen, 92.0`
- `1003, Mia Lopez, 79.5`

These are preloaded when the program starts.

## Testing Checklist (8 Cases)

1. Add a student successfully
2. Attempt to add a duplicate ID (rejected)
3. List students with multiple entries
4. Search existing student by ID
5. Search non-existing student by ID (not found)
6. Update a student and confirm changes
7. Remove an existing student and confirm removal
8. Enter invalid menu input (letters) and confirm no crash
