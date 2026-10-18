package com.persianapp.service;

import com.persianapp.dao.ChapterDao;
import com.persianapp.dao.GlossaryDao;
import com.persianapp.model.GlossaryEntry;
import com.persianapp.validation.GlossaryValidator;
import java.util.List;

/** UC-04: Manage chapter glossary. OWNER: Member 4 */
public class GlossaryService {
    private final ChapterDao chapterDao;
    private final GlossaryDao glossaryDao;
    private final GlossaryValidator validator;

    public GlossaryService(ChapterDao chapterDao, GlossaryDao glossaryDao, GlossaryValidator validator) {
        this.chapterDao = chapterDao;
        this.glossaryDao = glossaryDao;
        this.validator = validator;
    }

    public GlossaryEntry addEntry(int chapterId, String persianWord, String urduMeaning) { throw new UnsupportedOperationException("TODO"); }

    public List<GlossaryEntry> getEntries(int chapterId) { throw new UnsupportedOperationException("TODO"); }

    public GlossaryEntry editEntry(int entryId, String persianWord, String urduMeaning) { throw new UnsupportedOperationException("TODO"); }

    public boolean deleteEntry(int entryId, boolean confirmed) { throw new UnsupportedOperationException("TODO"); }
}
