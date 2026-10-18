# Persian Language Learning App
Software Construction and Development Project - Iteration 1

## Overview
This application is designed for Urdu-speaking learners to study Persian chapters.
For Iteration 1, this repository contains the administrator side of the app:
- UC-01: Manage Chapters and Basic Details (Member 1)
- UC-02: Configure Chapter Structure (Member 2)
- UC-03: Manage Chapter Instructional Content (Member 3)
- UC-04: Manage Chapter Glossary (Member 4)

This repository is a code skeleton: classes and method signatures are ready, and each member writes the implementation for their own use case.

## Architecture
The project follows a three-layer architecture:
- Presentation Layer: ConsoleUI, ChapterMenu, StructureMenu, ContentMenu, GlossaryMenu
- Business Logic Layer: ChapterService, ChapterStructureService, ChapterContentService, GlossaryService, ChapterValidator, GlossaryValidator
- Data Layer: ChapterDao, ComponentDao, GlossaryDao (MySQL implementations)

Design patterns used:
- Facade: LearningSystemFacade is the only class the UI talks to.
- Abstract Factory: DaoFactory creates the DAOs (MySqlDaoFactory is the concrete factory).
- DAO: database access is hidden behind the DAO interfaces.

```
UI -> LearningSystemFacade -> Services (+ Validators) -> DAO interfaces -> MySQL
```

## Who Writes What
Search for `TODO` in your files. Do not change method names or parameters without telling the team.

| Member | Use case | Files |
|---|---|---|
| Member 1 | UC-01 | ChapterService, ChapterValidator.validateTitle, MySqlChapterDao, DbConnection, MySqlDaoFactory, ChapterMenu, ConsoleUI, Main, facade UC-01 methods, ChapterServiceTest, StubChapterDao |
| Member 2 | UC-02 | ChapterStructureService, MySqlComponentDao, StructureMenu, facade UC-02 methods, ChapterStructureServiceTest, StubComponentDao |
| Member 3 | UC-03 | ChapterContentService, ChapterValidator.validateContent, ContentMenu, facade UC-03 methods, ChapterContentServiceTest |
| Member 4 | UC-04 | GlossaryService, GlossaryValidator, MySqlGlossaryDao, GlossaryMenu, facade UC-04 methods, GlossaryServiceTest, StubGlossaryDao |

The facade constructor (creating the DAOs and services) is written by Member 1.
Model classes, DAO interfaces, DaoFactory and exceptions are shared and already complete.

## Database Setup
1. Install MySQL and run `database/schema.sql`.
2. Copy `src/main/resources/db.properties.example` to `src/main/resources/db.properties`.
3. Put your own MySQL username and password in `db.properties` (this file is ignored by Git).

## How to Run in Eclipse
1. Open Eclipse and select workspace.
2. Go to File -> Import -> Maven -> Existing Maven Projects.
3. Select this folder and finish.
4. To run the app: Right-click Main.java -> Run As -> Java Application.
5. To run the tests: Right-click a test class -> Run As -> JUnit Test.

## Testing
Unit tests are written using JUnit 5 and custom stubs (no external mocking libraries used).
Stub DAOs are in `src/test/java/com/persianapp/stubs`. Each test class lists the tests to write; remove `@Disabled` when you implement one.
