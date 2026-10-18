package com.persianapp.service;

import com.persianapp.stubs.StubChapterDao;
import com.persianapp.stubs.StubComponentDao;
import com.persianapp.stubs.StubGlossaryDao;
import com.persianapp.validation.ChapterValidator;
import com.persianapp.validation.GlossaryValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** UC-02 tests. OWNER: Member 2. Remove @Disabled from a test when you write it. */
class ChapterStructureServiceTest {
    @BeforeEach
    void setUp() {
        // TODO create fresh stubs and the service: new ChapterStructureService(chapterDao, componentDao)
    }

    @Disabled("TODO Member 2")
    @Test
    void savesSelectedComponentsInOrder() {
    }

    @Disabled("TODO Member 2")
    @Test
    void removesComponentFromStructure() {
    }

    @Disabled("TODO Member 2")
    @Test
    void reordersComponents() {
    }

    @Disabled("TODO Member 2")
    @Test
    void rejectsDuplicateComponents() {
    }

    @Disabled("TODO Member 2")
    @Test
    void rejectsUnknownChapter() {
    }

    @Disabled("TODO Member 2")
    @Test
    void keepsLastValidStructureOnFailure() {
    }

    @Disabled("TODO Member 2")
    @Test
    void differentChaptersCanHaveDifferentStructures() {
    }
}
