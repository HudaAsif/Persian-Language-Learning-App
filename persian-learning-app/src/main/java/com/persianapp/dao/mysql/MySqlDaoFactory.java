package com.persianapp.dao.mysql;

import com.persianapp.dao.ChapterDao;
import com.persianapp.dao.ComponentDao;
import com.persianapp.dao.DaoFactory;
import com.persianapp.dao.GlossaryDao;

/** ABSTRACT FACTORY (concrete): creates the MySQL DAOs. OWNER: Member 1 */
public class MySqlDaoFactory implements DaoFactory {
    private final DbConnection db = new DbConnection();

    @Override
    public ChapterDao createChapterDao() { throw new UnsupportedOperationException("TODO"); }

    @Override
    public ComponentDao createComponentDao() { throw new UnsupportedOperationException("TODO"); }

    @Override
    public GlossaryDao createGlossaryDao() { throw new UnsupportedOperationException("TODO"); }
}
