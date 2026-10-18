package com.persianapp.model;

/** A Persian word with its Urdu meaning. Belongs to exactly one chapter. */
public class GlossaryEntry {
    private int id;             // 0 = not saved yet
    private int chapterId;
    private String persianWord;
    private String urduMeaning;

    public GlossaryEntry() { }

    public GlossaryEntry(int id, int chapterId, String persianWord, String urduMeaning) {
        this.id = id;
        this.chapterId = chapterId;
        this.persianWord = persianWord;
        this.urduMeaning = urduMeaning;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getChapterId() { return chapterId; }
    public void setChapterId(int chapterId) { this.chapterId = chapterId; }
    public String getPersianWord() { return persianWord; }
    public void setPersianWord(String persianWord) { this.persianWord = persianWord; }
    public String getUrduMeaning() { return urduMeaning; }
    public void setUrduMeaning(String urduMeaning) { this.urduMeaning = urduMeaning; }
}
