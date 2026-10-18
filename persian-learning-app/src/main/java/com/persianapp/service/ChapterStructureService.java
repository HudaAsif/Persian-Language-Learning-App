package com.persianapp.service;

import com.persianapp.dao.ChapterDao;
import com.persianapp.dao.ComponentDao;
import com.persianapp.model.ChapterComponent;
import com.persianapp.model.ComponentType;
import java.util.List;

/** UC-02: Configure chapter structure. OWNER: Member 2 */
public class ChapterStructureService {
    private final ChapterDao chapterDao;
    private final ComponentDao componentDao;

    public ChapterStructureService(ChapterDao chapterDao, ComponentDao componentDao) {
        this.chapterDao = chapterDao;
        this.componentDao = componentDao;
    }

    public List<ComponentType> getSupportedComponents() { throw new UnsupportedOperationException("TODO"); }

    public List<ChapterComponent> getStructure(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    public List<ChapterComponent> configureStructure(int chapterId, List<ComponentType> orderedTypes) { throw new UnsupportedOperationException("TODO"); }
}
