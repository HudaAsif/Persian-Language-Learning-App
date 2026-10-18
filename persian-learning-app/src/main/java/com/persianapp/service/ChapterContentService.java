package com.persianapp.service;

import com.persianapp.dao.ChapterDao;
import com.persianapp.dao.ComponentDao;
import com.persianapp.model.ChapterComponent;
import com.persianapp.model.ComponentType;
import com.persianapp.validation.ChapterValidator;
import java.util.List;

/** UC-03: Manage chapter instructional content. OWNER: Member 3 */
public class ChapterContentService {
    private final ChapterDao chapterDao;
    private final ComponentDao componentDao;
    private final ChapterValidator validator;

    public ChapterContentService(ChapterDao chapterDao, ComponentDao componentDao, ChapterValidator validator) {
        this.chapterDao = chapterDao;
        this.componentDao = componentDao;
        this.validator = validator;
    }

    public List<ChapterComponent> getChapterContent(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    public ChapterComponent saveContent(int chapterId, ComponentType type, String content) { throw new UnsupportedOperationException("TODO"); }

    public void removeContent(int chapterId, ComponentType type) { throw new UnsupportedOperationException("TODO"); }

    public boolean isChapterComplete(int chapterId) { throw new UnsupportedOperationException("TODO"); }
}
