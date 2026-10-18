# Persian Language Learning App
Software Construction and Development Project - Iteration 1

## Overview
This application is designed for Urdu-speaking learners to study Persian chapters.
For Iteration 1, this repository contains the administrator side of the app:
- UC-01: Manage Chapters and Basic Details
- UC-02: Configure Chapter Structure
- UC-03: Manage Chapter Instructional Content
- UC-04: Manage Chapter Glossary

## Architecture
The project follows a three-layer architecture:
- Presentation Layer: Urdu user interface for the administrator
- Business Logic Layer: ChapterService, ChapterStructureService, ChapterContentService, GlossaryService (with validation)
- Data Layer: ChapterRepository and GlossaryRepository (MySQL storage)

## How to Run in Eclipse
1. Open Eclipse and select workspace.
2. Go to File -> Import -> Existing Projects into Workspace.
3. Select this folder and finish.
4. Create the MySQL database using the provided schema file and update the database username and password in the config.
5. To run the app: Right-click Main.java -> Run As -> Java Application.
6. To run the tests: Right-click the test class (for example ChapterServiceTest.java) -> Run As -> JUnit Test.

## Testing
Unit tests are written using JUnit 5 and custom stubs (no external mocking libraries used).
Tests verify chapter operations, chapter structure and ordering, Persian and Urdu content handling, and glossary management, including validation and deletion with confirmation.
