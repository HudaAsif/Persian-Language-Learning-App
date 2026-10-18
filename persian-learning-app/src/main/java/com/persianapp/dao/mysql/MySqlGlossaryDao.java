package com.persianapp.dao.mysql;

import com.persianapp.dao.GlossaryDao;
import com.persianapp.model.GlossaryEntry;
import java.util.List;
import java.util.Optional;

/** MySQL implementation of GlossaryDao. OWNER: Member 4 */
public class MySqlGlossaryDao implements GlossaryDao {
    private final DbConnection db;

    public MySqlGlossaryDao(DbConnection db) {
        this.db = db;
    }

    @Override
    public GlossaryEntry save(GlossaryEntry entry) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public Optional<GlossaryEntry> findById(int id) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public List<GlossaryEntry> findByChapterId(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean deleteById(int id) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public void deleteByChapterId(int chapterId) { throw new UnsupportedOperationException("TODO"); }
}
