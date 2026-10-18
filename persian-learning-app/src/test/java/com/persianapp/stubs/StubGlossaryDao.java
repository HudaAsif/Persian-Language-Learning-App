package com.persianapp.stubs;

import com.persianapp.dao.GlossaryDao;
import com.persianapp.model.GlossaryEntry;
import java.util.List;
import java.util.Optional;

/** Test stub for GlossaryDao (in-memory). Fill in only what your tests need. */
public class StubGlossaryDao implements GlossaryDao {

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
