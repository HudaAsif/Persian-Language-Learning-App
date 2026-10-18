package com.persianapp.dao;

import com.persianapp.model.ChapterComponent;
import com.persianapp.model.ComponentType;
import java.util.List;
import java.util.Optional;

/** Data access for chapter components. */
public interface ComponentDao {
    /** Inserts when component.getId() == 0, otherwise updates. */
    ChapterComponent save(ChapterComponent component);

    /** Components of a chapter, sorted by displayOrder. */
    List<ChapterComponent> findByChapterId(int chapterId);

    Optional<ChapterComponent> findByChapterIdAndType(int chapterId, ComponentType type);

    /**
     * Replaces the whole structure of a chapter in one go (all or nothing).
     * Used by UC-02 so that a failed save never leaves a half-saved structure.
     */
    void replaceAll(int chapterId, List<ChapterComponent> components);

    void deleteById(int id);

    void deleteByChapterId(int chapterId);
}
