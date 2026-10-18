package com.persianapp.stubs;

import com.persianapp.dao.ComponentDao;
import com.persianapp.model.ChapterComponent;
import com.persianapp.model.ComponentType;
import java.util.List;
import java.util.Optional;

/** Test stub for ComponentDao (in-memory). Fill in only what your tests need. */
public class StubComponentDao implements ComponentDao {

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
