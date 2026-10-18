package com.persianapp.ui;

import com.persianapp.facade.LearningSystemFacade;
import java.util.Scanner;

/** UC-01 Chapters menu. OWNER: Member 1. Only call the facade from here. */
public class ChapterMenu {
    private final LearningSystemFacade facade;
    private final Scanner scanner;

    public ChapterMenu(LearningSystemFacade facade, Scanner scanner) {
        this.facade = facade;
        this.scanner = scanner;
    }

    public void show() {
        // TODO Member 1
    }
}
