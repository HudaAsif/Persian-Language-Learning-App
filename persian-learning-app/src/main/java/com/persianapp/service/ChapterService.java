package com.persianapp.service;

import com.persianapp.dao.ChapterDao;
import com.persianapp.dao.ComponentDao;
import com.persianapp.dao.GlossaryDao;
import com.persianapp.model.Chapter;
import com.persianapp.validation.ChapterValidator;
import java.util.List;

/** UC-01: Manage chapters and basic details. OWNER: Member 1 */
public class ChapterService {
    private final ChapterDao chapterDao;
    private final ComponentDao componentDao;
    private final GlossaryDao glossaryDao;
    private final ChapterValidator validator;

    public ChapterService(ChapterDao chapterDao, ComponentDao componentDao,
                          GlossaryDao glossaryDao, ChapterValidator validator) {
        this.chapterDao = chapterDao;
        this.componentDao = componentDao;
        this.glossaryDao = glossaryDao;
        this.validator = validator;
    }

    public Chapter createChapter(String title) { throw new UnsupportedOperationException("TODO"); }

    public List<Chapter> getAllChapters() { throw new UnsupportedOperationException("TODO"); }

    public Chapter getChapter(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    public Chapter renameChapter(int chapterId, String newTitle) { throw new UnsupportedOperationException("TODO"); }

    public String getDeleteWarning(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    public boolean deleteChapter(int chapterId, boolean confirmed) { throw new UnsupportedOperationException("TODO"); }
}
