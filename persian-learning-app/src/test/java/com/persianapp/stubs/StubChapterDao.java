package com.persianapp.stubs;

import com.persianapp.dao.ChapterDao;
import com.persianapp.model.Chapter;
import java.util.List;
import java.util.Optional;

/** Test stub for ChapterDao (in-memory). Fill in only what your tests need. */
public class StubChapterDao implements ChapterDao {

    @Override
    public Chapter save(Chapter chapter) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public Optional<Chapter> findById(int id) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public List<Chapter> findAll() { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean deleteById(int id) { throw new UnsupportedOperationException("TODO"); }
}
