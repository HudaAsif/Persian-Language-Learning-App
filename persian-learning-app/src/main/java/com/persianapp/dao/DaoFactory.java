package com.persianapp.dao;

/**
 * ABSTRACT FACTORY: creates the whole family of DAOs.
 * Today there is one family (MySQL). A different storage (e.g. files) would
 * only need another DaoFactory, the rest of the app stays the same.
 */
public interface DaoFactory {
    ChapterDao createChapterDao();

    ComponentDao createComponentDao();

    GlossaryDao createGlossaryDao();
}
