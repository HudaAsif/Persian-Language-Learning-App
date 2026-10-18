package com.persianapp.service;

import com.persianapp.stubs.StubChapterDao;
import com.persianapp.stubs.StubComponentDao;
import com.persianapp.stubs.StubGlossaryDao;
import com.persianapp.validation.ChapterValidator;
import com.persianapp.validation.GlossaryValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** UC-03 tests. OWNER: Member 3. Remove @Disabled from a test when you write it. */
class ChapterContentServiceTest {
    @BeforeEach
    void setUp() {
        // TODO create fresh stubs and the service: new ChapterContentService(chapterDao, componentDao, validator)
    }

    @Disabled("TODO Member 3")
    @Test
    void savesContentForConfiguredComponent() {
    }

    @Disabled("TODO Member 3")
    @Test
    void preservesPersianAndUrduText() {
    }

    @Disabled("TODO Member 3")
    @Test
    void rejectsEmptyContent() {
    }

    @Disabled("TODO Member 3")
    @Test
    void editsExistingContent() {
    }

    @Disabled("TODO Member 3")
    @Test
    void rejectsComponentNotInStructure() {
    }

    @Disabled("TODO Member 3")
    @Test
    void removesContent() {
    }

    @Disabled("TODO Member 3")
    @Test
    void reportsChapterCompleteOnlyWhenAllFilled() {
    }
}
