![Version](https://img.shields.io/badge/Version-Portfolio%20v1-8A2BE2?labelColor=2E2E2E)
![Status](https://img.shields.io/badge/Status-Completed-8A2BE2?labelColor=2E2E2E)
![Course](https://img.shields.io/badge/Course-CS%20141%20Computer%20Science-8A2BE2?labelColor=2E2E2E)
![Course Finished](https://img.shields.io/badge/Course-Finished-8A2BE2?labelColor=2E2E2E)
![Language](https://img.shields.io/badge/Language-Java-8A2BE2?labelColor=2E2E2E)
![Duration](https://img.shields.io/badge/Duration-11%20Weeks-8A2BE2?labelColor=2E2E2E)

![Program](https://img.shields.io/badge/Program-Software%20Development%20DTA%20Associate%20Pathway-8A2BE2?labelColor=2E2E2E)
![Repository](https://img.shields.io/badge/Repository-Type%20Portfolio-8A2BE2?labelColor=2E2E2E)
![Focus](https://img.shields.io/badge/Focus-OOP%2C%20Algorithms%2C%20Data%20Structures%2C%20Recursion-8A2BE2?labelColor=2E2E2E)
![Final Project](https://img.shields.io/badge/Final%20Project-Student%20Records%20Manager-8A2BE2?labelColor=2E2E2E)
![Interface](https://img.shields.io/badge/Interface-Console%20Apps-8A2BE2?labelColor=2E2E2E)

# Learning Java - CS 141 Portfolio by mp3li

This repository documents completed coursework from an 11-week **CS 141 Computer Science (Java)** class in a **Software Development DTA associate pathway**.  
It is organized as a portfolio of objective-based projects that show progression from class design and method decomposition through collections, recursion, polymorphism, and a final multi-file Java application.

### What This Portfolio Shows:
- Foundational Java programming and problem-solving
- Object-oriented design (classes, encapsulation, constructors, inheritance, polymorphism)
- Data structures (`int[]`, `ArrayList<T>`)
- Algorithm implementation (search, update, sort, counting/statistics)
- Recursion with clear base and recursive cases
- Input validation, testing/debugging, and readable program structure

--------------------------------------------------

### Table of Contents:
<details>
<summary><em>Open Table of Contents</em></summary>

- [Portfolio Summary](#portfolio-summary)
- [How to Run Projects](#how-to-run-projects)
- [Objective Portfolio (All Objectives)](#objective-portfolio-all-objectives)
  - [Objective 1 - Classes, Encapsulation, Constructors, and Object Behavior](#objective-1---classes-encapsulation-constructors-and-object-behavior)
  - [Objective 2 - Decompose into Methods (MyBookTracker)](#objective-2---decompose-into-methods-mybooktracker)
  - [Objective 3 - Build a Multi-Class Java App](#objective-3---build-a-multi-class-java-app)
  - [Objective 4 - Arrays and ArrayList](#objective-4---arrays-and-arraylist)
  - [Objective 5 - Polymorphic Account Hierarchy and Interfaces](#objective-5---polymorphic-account-hierarchy-and-interfaces)
  - [Objective 6 - Recursion](#objective-6---recursion)
  - [Objective 7 - Final Project: Java Fundamentals Portfolio Program](#objective-7---final-project-java-fundamentals-portfolio-program)
- [Skills Demonstrated Across the Full Course](#skills-demonstrated-across-the-full-course)
- [Notes](#notes)

</details>

--------------------------------------------------

### Portfolio Summary:
<details>
<summary><em>Open Portfolio Summary</em></summary>

- Course: **CS 141 Computer Science (Java)**
- Duration: **11 weeks (completed)**
- Repository purpose: Store and present completed objective-driven Java work as a portfolio artifact
- Structure: Each folder maps to a specific course objective and includes source files plus an `Objective.txt` prompt
- Final deliverable: A complete menu-based `Student Records Manager` console app with OOP, `ArrayList`, recursion, sorting, statistics, and input validation

</details>

--------------------------------------------------

### How to Run Projects:
<details>
<summary><em>Open How to Run Projects</em></summary>

- General: Open a terminal in this repository, `cd` into the target objective folder, compile with `javac`, run with `java`.
- Objective 1 (`Classes, Encapsulation, Constructors, and Object Behavior`):
  - `javac Student.java`
  - `java Student`
- Objective 2 (`Decompose into Methods - MyBookTracker`):
  - `javac MyBookTracker.java`
  - `java MyBookTracker`
- Objective 3 (`Build a Multi‑Class Java App/car-composition-java/src`):
  - `javac com/example/app/Main.java`
  - `java com.example.app.Main`
- Objective 4 (`Arrays and ArrayList`):
  - `javac ArraysArrayList.java`
  - `java ArraysArrayList`
- Objective 5 (`Polymorphic Account Hierarchy and Interfaces`):
  - `javac *.java`
  - `java PolymorphicAccountDemo`
- Objective 6 (`Recursion`):
  - `javac RecursionPractice.java`
  - `java RecursionPractice`
- Objective 7 (`Final Project - Java Fundamentals Portfolio Program `):
  - `javac Main.java Student.java StudentManager.java`
  - `java Main`

</details>

--------------------------------------------------

### Objective Portfolio (All Objectives):

#### Objective 1 - Classes, Encapsulation, Constructors, and Object Behavior
<details>
<summary><em>Open Objective 1 Details</em></summary>

- Objective focus:
  - Design a `Student` class using private fields, constructor logic, and object behavior methods.
- Contains:
  - `Classes, Encapsulation, Constructors, and Object Behavior/Objective.txt`
  - `Classes, Encapsulation, Constructors, and Object Behavior/Student.java`
- Implementation highlights:
  - Private fields for `name`, `id`, `gpa`
  - Constructor with GPA guard (`gpa < 0` fallback handling)
  - Custom `toString()` output
  - `equals(Object obj)` based on student ID
  - Demo/test code in `main`
- Skills demonstrated:
  - Encapsulation
  - Constructor design
  - Object equality semantics
  - Class-level testing through a simple main method

</details>

#### Objective 2 - Decompose into Methods (MyBookTracker)
<details>
<summary><em>Open Objective 2 Details</em></summary>

- Objective focus:
  - Break a problem into small, single-responsibility methods and reason about loop behavior.
- Contains:
  - `Decompose into Methods - MyBookTracker/Objective.txt`
  - `Decompose into Methods - MyBookTracker/MyBookTracker.java`
- Implementation highlights:
  - `sumOfEvens(int[] nums)`-shaped method adapted to the project theme
  - `countOccurrences(int[] nums, int target)`
  - Null and empty handling for safer execution
  - Edge-case test arrays in `main`
- Skills demonstrated:
  - Method decomposition
  - Loop design and iteration tracing
  - Defensive handling for edge cases

</details>

#### Objective 3 - Build a Multi-Class Java App
<details>
<summary><em>Open Objective 3 Details</em></summary>

- Objective focus:
  - Build a multi-class, package-structured Java console app using composition, validation, and exception handling.
- Contains:
  - `Build a Multi‑Class Java App/Objective.txt`
  - `Build a Multi‑Class Java App/car-composition-java/src/com/example/app/Main.java`
  - `Build a Multi‑Class Java App/car-composition-java/src/com/example/parts/Car.java`
  - `Build a Multi‑Class Java App/car-composition-java/src/com/example/parts/Engine.java`
  - `Build a Multi‑Class Java App/car-composition-java/src/com/example/parts/Wheel.java`
  - `Build a Multi‑Class Java App/car-composition-java/src/com/example/parts/Driver.java`
  - `Build a Multi‑Class Java App/car-composition-java/src/com/example/exceptions/InvalidEngineException.java`
  - `Build a Multi‑Class Java App/car-composition-java/src/com/example/exceptions/InvalidWheelException.java`
- Implementation highlights:
  - Car composition with engine + wheel array + driver
  - User input flow to assemble objects at runtime
  - Checked/unchecked custom exception usage
  - `try/catch` for friendly input error handling
- Skills demonstrated:
  - Composition and package organization
  - Input validation
  - Exception design and handling

</details>

#### Objective 4 - Arrays and ArrayList
<details>
<summary><em>Open Objective 4 Details</em></summary>

- Objective focus:
  - Compare arrays and `ArrayList`, apply generics, and practice loop patterns.
- Contains:
  - `Arrays and ArrayList/Objective.txt`
  - `Arrays and ArrayList/ArraysArrayList.java`
- Implementation highlights:
  - `int[]` vs `ArrayList<Integer>` creation and output
  - Demonstration of dynamic growth with `ArrayList`
  - `ArrayList<String>` generic type-safety example
  - Traditional `for`, enhanced `for-each`, and `while` loops
- Skills demonstrated:
  - Data structure selection tradeoffs
  - Java generics
  - Iteration techniques

</details>

#### Objective 5 - Polymorphic Account Hierarchy and Interfaces
<details>
<summary><em>Open Objective 5 Details</em></summary>

- Objective focus:
  - Practice inheritance/polymorphism and Strategy pattern behavior swapping.
- Contains:
  - `Polymorphic Account Hierarchy and Interfaces/Objective.txt`
  - `Polymorphic Account Hierarchy and Interfaces/Account.java`
  - `Polymorphic Account Hierarchy and Interfaces/SavingsAccount.java`
  - `Polymorphic Account Hierarchy and Interfaces/CheckingAccount.java`
  - `Polymorphic Account Hierarchy and Interfaces/InterestStrategy.java`
  - `Polymorphic Account Hierarchy and Interfaces/SimpleInterest.java`
  - `Polymorphic Account Hierarchy and Interfaces/TieredInterest.java`
  - `Polymorphic Account Hierarchy and Interfaces/PolymorphicAccountDemo.java`
- Implementation highlights:
  - Base `Account` plus `SavingsAccount` and `CheckingAccount`
  - Runtime strategy swap between `SimpleInterest` and `TieredInterest`
  - `ArrayList<Account>` polymorphic processing loop
  - Behavior differences for withdrawal/interest logic by account type
- Skills demonstrated:
  - Inheritance and polymorphism
  - Interface-based strategy composition
  - Open/Closed-style extension via new strategy classes

</details>

#### Objective 6 - Recursion
<details>
<summary><em>Open Objective 6 Details</em></summary>

- Objective focus:
  - Learn and apply recursion with clear base and recursive cases.
- Contains:
  - `Recursion/Objective.txt`
  - `Recursion/RecursionPractice.java`
- Implementation highlights:
  - `factorial(int n)`
  - `sumArray(int[] arr, int index)`
  - `fibonacci(int n)`
  - In-code comments explaining base case progression
- Skills demonstrated:
  - Recursive reasoning
  - Tracing call stacks
  - Base-case correctness

</details>

#### Objective 7 - Final Project: Java Fundamentals Portfolio Program
<details>
<summary><em>Open Objective 7 Details</em></summary>

- Objective focus:
  - Deliver a complete console application demonstrating core CS 141 skills end-to-end.
- Contains:
  - `Final Project - Java Fundamentals Portfolio Program /Objective.txt`
  - `Final Project - Java Fundamentals Portfolio Program /Student.java`
  - `Final Project - Java Fundamentals Portfolio Program /StudentManager.java`
  - `Final Project - Java Fundamentals Portfolio Program /Main.java`
  - `Final Project - Java Fundamentals Portfolio Program /README.md`
- Implementation highlights:
  - Menu loop with repeat-until-quit flow
  - `ArrayList<Student>` record storage and management
  - All 8 target features implemented:
    - Add
    - List
    - Search by ID
    - Search by last name
    - Update
    - Remove
    - Sort
    - Statistics
  - Validation for duplicate IDs, numeric parsing, required fields, and score ranges
  - Purposeful recursion in manager-level search/count logic
  - Manual test coverage for the required checklist scenarios
- Skills demonstrated:
  - OOP architecture across multiple files
  - Data structure operations and algorithm flow
  - Recursion in practical context
  - Testing/debugging and robust input handling

</details>

--------------------------------------------------

### Skills Demonstrated Across the Full Course:
<details>
<summary><em>Open Skills Demonstrated Across the Full Course</em></summary>

- Java syntax and program structure
- Class design and encapsulation
- Constructors and object lifecycle
- `toString`, `equals`, and identity/equality logic
- Method decomposition and single-responsibility thinking
- Arrays and `ArrayList` usage patterns
- Generics and type safety
- Exception handling and validation
- Inheritance and polymorphism
- Interface-based Strategy pattern implementation
- Recursion design and base-case logic
- Console application UX and menu-driven control flow
- Testing/debugging against required scenarios

</details>

--------------------------------------------------

### Notes:
- This repository is a **completed course portfolio** and is organized to make objective-by-objective review easy for instructors, hiring teams, and collaborators.
- For final project specifics (features, recursion details, and testing checklist), see:
  - `Final Project - Java Fundamentals Portfolio Program /README.md`

--------------------------------------------------
