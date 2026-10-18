package com.persianapp.dao.mysql;

import com.persianapp.dao.ComponentDao;
import com.persianapp.model.ChapterComponent;
import com.persianapp.model.ComponentType;
import java.util.List;
import java.util.Optional;

/** MySQL implementation of ComponentDao. OWNER: Member 2 (Member 3 also uses it) */
public class MySqlComponentDao implements ComponentDao {
    private final DbConnection db;

    public MySqlComponentDao(DbConnection db) {
        this.db = db;
    }

    @Override
    public ChapterComponent save(ChapterComponent component) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public List<ChapterComponent> findByChapterId(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public Optional<ChapterComponent> findByChapterIdAndType(int chapterId, ComponentType type) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public void replaceAll(int chapterId, List<ChapterComponent> components) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public void deleteById(int id) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public void deleteByChapterId(int chapterId) { throw new UnsupportedOperationException("TODO"); }
}
