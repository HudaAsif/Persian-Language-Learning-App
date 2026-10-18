package com.persianapp.ui;

import com.persianapp.facade.LearningSystemFacade;
import java.util.Scanner;

/** UC-04 Glossary menu. OWNER: Member 4. Only call the facade from here. */
public class GlossaryMenu {
    private final LearningSystemFacade facade;
    private final Scanner scanner;

    public GlossaryMenu(LearningSystemFacade facade, Scanner scanner) {
        this.facade = facade;
        this.scanner = scanner;
    }

    public void show() {
        // TODO Member 4
    }
}
