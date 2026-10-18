package com.persianapp.model;

/** One selected component of a chapter, with its content and position. */
public class ChapterComponent {
    private int id;             // 0 = not saved yet
    private int chapterId;
    private ComponentType type;
    private String content;     // Persian / Urdu text, may be empty until the admin fills it
    private int displayOrder;   // 1, 2, 3 ... (position inside the chapter)

    public ChapterComponent() { }

    public ChapterComponent(int id, int chapterId, ComponentType type, String content, int displayOrder) {
        this.id = id;
        this.chapterId = chapterId;
        this.type = type;
        this.content = content;
        this.displayOrder = displayOrder;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getChapterId() { return chapterId; }
    public void setChapterId(int chapterId) { this.chapterId = chapterId; }
    public ComponentType getType() { return type; }
    public void setType(ComponentType type) { this.type = type; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public int getDisplayOrder() { return displayOrder; }
    public void setDisplayOrder(int displayOrder) { this.displayOrder = displayOrder; }
}
