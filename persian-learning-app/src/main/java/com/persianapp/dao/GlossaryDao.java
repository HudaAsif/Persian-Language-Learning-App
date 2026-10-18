package com.persianapp.dao;

import com.persianapp.model.GlossaryEntry;
import java.util.List;
import java.util.Optional;

/** Data access for glossary entries. */
public interface GlossaryDao {
    /** Inserts when entry.getId() == 0, otherwise updates. */
    GlossaryEntry save(GlossaryEntry entry);

    Optional<GlossaryEntry> findById(int id);

    List<GlossaryEntry> findByChapterId(int chapterId);

    /** @return true if an entry was deleted */
    boolean deleteById(int id);

    void deleteByChapterId(int chapterId);
}
