package com.persianapp.service;

import com.persianapp.stubs.StubChapterDao;
import com.persianapp.stubs.StubComponentDao;
import com.persianapp.stubs.StubGlossaryDao;
import com.persianapp.validation.ChapterValidator;
import com.persianapp.validation.GlossaryValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** UC-04 tests. OWNER: Member 4. Remove @Disabled from a test when you write it. */
class GlossaryServiceTest {
    @BeforeEach
    void setUp() {
        // TODO create fresh stubs and the service: new GlossaryService(chapterDao, glossaryDao, validator)
    }

    @Disabled("TODO Member 4")
    @Test
    void addsValidEntry() {
    }

    @Disabled("TODO Member 4")
    @Test
    void rejectsMissingPersianWord() {
    }

    @Disabled("TODO Member 4")
    @Test
    void rejectsMissingUrduMeaning() {
    }

    @Disabled("TODO Member 4")
    @Test
    void editsEntry() {
    }

    @Disabled("TODO Member 4")
    @Test
    void invalidEditKeepsOldEntry() {
    }

    @Disabled("TODO Member 4")
    @Test
    void confirmedDeleteRemovesEntry() {
    }

    @Disabled("TODO Member 4")
    @Test
    void cancelledDeleteKeepsEntry() {
    }

    @Disabled("TODO Member 4")
    @Test
    void entryBelongsToItsChapter() {
    }
}
