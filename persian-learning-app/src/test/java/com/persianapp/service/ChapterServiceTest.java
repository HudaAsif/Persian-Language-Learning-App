package com.persianapp.service;

import com.persianapp.stubs.StubChapterDao;
import com.persianapp.stubs.StubComponentDao;
import com.persianapp.stubs.StubGlossaryDao;
import com.persianapp.validation.ChapterValidator;
import com.persianapp.validation.GlossaryValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** UC-01 tests. OWNER: Member 1. Remove @Disabled from a test when you write it. */
class ChapterServiceTest {
    @BeforeEach
    void setUp() {
        // TODO create fresh stubs and the service: new ChapterService(chapterDao, componentDao, glossaryDao, validator)
    }

    @Disabled("TODO Member 1")
    @Test
    void createsChapterWithValidTitle() {
    }

    @Disabled("TODO Member 1")
    @Test
    void rejectsBlankTitle() {
    }

    @Disabled("TODO Member 1")
    @Test
    void retrievesChapter() {
    }

    @Disabled("TODO Member 1")
    @Test
    void editsChapterTitle() {
    }

    @Disabled("TODO Member 1")
    @Test
    void invalidEditKeepsOldTitle() {
    }

    @Disabled("TODO Member 1")
    @Test
    void confirmedDeleteRemovesChapter() {
    }

    @Disabled("TODO Member 1")
    @Test
    void cancelledDeleteKeepsChapter() {
    }

    @Disabled("TODO Member 1")
    @Test
    void deleteAlsoRemovesComponentsAndGlossary() {
    }
}
