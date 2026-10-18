package com.persianapp.model;

/** A chapter. Its components and glossary entries are stored separately (see DAOs). */
public class Chapter {
    private int id;          // 0 = not saved yet, database generates it
    private String title;

    public Chapter() { }

    public Chapter(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    @Override
    public String toString() {
        return "Chapter{id=" + id + ", title='" + title + "'}";
    }
}
