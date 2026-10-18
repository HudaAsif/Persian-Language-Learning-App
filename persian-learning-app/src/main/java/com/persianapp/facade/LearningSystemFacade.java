package com.persianapp.facade;

import com.persianapp.dao.DaoFactory;
import com.persianapp.model.Chapter;
import com.persianapp.model.ChapterComponent;
import com.persianapp.model.ComponentType;
import com.persianapp.model.GlossaryEntry;
import com.persianapp.service.ChapterContentService;
import com.persianapp.service.ChapterService;
import com.persianapp.service.ChapterStructureService;
import com.persianapp.service.GlossaryService;
import java.util.List;

/**
 * FACADE: the only class the UI talks to. Each method should just call the matching service.
 * No business logic here.
 */
public class LearningSystemFacade {
    private ChapterService chapterService;
    private ChapterStructureService structureService;
    private ChapterContentService contentService;
    private GlossaryService glossaryService;

    /** TODO Member 1: create DAOs from the factory, then create the 4 services. */
    public LearningSystemFacade(DaoFactory factory) {
    }

    // ----- UC-01 chapters (Member 1) -----
    public Chapter createChapter(String title) { throw new UnsupportedOperationException("TODO"); }
    public List<Chapter> getAllChapters() { throw new UnsupportedOperationException("TODO"); }
    public Chapter getChapter(int chapterId) { throw new UnsupportedOperationException("TODO"); }
    public Chapter renameChapter(int chapterId, String newTitle) { throw new UnsupportedOperationException("TODO"); }
    public String getDeleteWarning(int chapterId) { throw new UnsupportedOperationException("TODO"); }
    public boolean deleteChapter(int chapterId, boolean confirmed) { throw new UnsupportedOperationException("TODO"); }

    // ----- UC-02 structure (Member 2) -----
    public List<ComponentType> getSupportedComponents() { throw new UnsupportedOperationException("TODO"); }
    public List<ChapterComponent> getStructure(int chapterId) { throw new UnsupportedOperationException("TODO"); }
    public List<ChapterComponent> configureStructure(int chapterId, List<ComponentType> orderedTypes) { throw new UnsupportedOperationException("TODO"); }

    // ----- UC-03 content (Member 3) -----
    public List<ChapterComponent> getChapterContent(int chapterId) { throw new UnsupportedOperationException("TODO"); }
    public ChapterComponent saveContent(int chapterId, ComponentType type, String content) { throw new UnsupportedOperationException("TODO"); }
    public void removeContent(int chapterId, ComponentType type) { throw new UnsupportedOperationException("TODO"); }
    public boolean isChapterComplete(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    // ----- UC-04 glossary (Member 4) -----
    public GlossaryEntry addGlossaryEntry(int chapterId, String persianWord, String urduMeaning) { throw new UnsupportedOperationException("TODO"); }
    public List<GlossaryEntry> getGlossary(int chapterId) { throw new UnsupportedOperationException("TODO"); }
    public GlossaryEntry editGlossaryEntry(int entryId, String persianWord, String urduMeaning) { throw new UnsupportedOperationException("TODO"); }
    public boolean deleteGlossaryEntry(int entryId, boolean confirmed) { throw new UnsupportedOperationException("TODO"); }
}
