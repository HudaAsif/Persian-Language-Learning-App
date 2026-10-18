-- Persian Language Learning App - Iteration 1 schema
-- Run once in MySQL:  source database/schema.sql;

CREATE DATABASE IF NOT EXISTS persian_app
  CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE persian_app;

CREATE TABLE IF NOT EXISTS chapter (
  chapter_id INT AUTO_INCREMENT PRIMARY KEY,
  title      VARCHAR(255) NOT NULL
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS chapter_component (
  component_id   INT AUTO_INCREMENT PRIMARY KEY,
  chapter_id     INT NOT NULL,
  component_type VARCHAR(40) NOT NULL,
  content        TEXT,
  display_order  INT NOT NULL,
  UNIQUE (chapter_id, component_type),
  FOREIGN KEY (chapter_id) REFERENCES chapter(chapter_id) ON DELETE CASCADE
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS glossary_entry (
  entry_id     INT AUTO_INCREMENT PRIMARY KEY,
  chapter_id   INT NOT NULL,
  persian_word VARCHAR(255) NOT NULL,
  urdu_meaning VARCHAR(255) NOT NULL,
  FOREIGN KEY (chapter_id) REFERENCES chapter(chapter_id) ON DELETE CASCADE
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Later iterations: exercise, question, answer tables go here.
