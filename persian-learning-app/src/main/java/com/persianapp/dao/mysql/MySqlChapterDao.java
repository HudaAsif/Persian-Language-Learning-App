package com.persianapp.dao.mysql;

import com.persianapp.dao.ChapterDao;
import com.persianapp.model.Chapter;
import java.util.List;
import java.util.Optional;

/** MySQL implementation of ChapterDao. OWNER: Member 1 */
public class MySqlChapterDao implements ChapterDao {
    private final DbConnection db;

    public MySqlChapterDao(DbConnection db) {
        this.db = db;
    }

    @Override
    public Chapter save(Chapter chapter) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public Optional<Chapter> findById(int id) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public List<Chapter> findAll() { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean deleteById(int id) { throw new UnsupportedOperationException("TODO"); }
}
