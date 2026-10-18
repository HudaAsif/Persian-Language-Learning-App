package com.persianapp.dao;

import com.persianapp.model.Chapter;
import java.util.List;
import java.util.Optional;

/** Data access for chapters. */
public interface ChapterDao {
    /** Inserts when chapter.getId() == 0, otherwise updates. Returns the saved chapter (with id). */
    Chapter save(Chapter chapter);

    Optional<Chapter> findById(int id);

    List<Chapter> findAll();

    /** @return true if a chapter was deleted */
    boolean deleteById(int id);
}
