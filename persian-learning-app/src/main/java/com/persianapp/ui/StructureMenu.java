package com.persianapp.ui;

import com.persianapp.facade.LearningSystemFacade;
import java.util.Scanner;

/** UC-02 Chapter structure menu. OWNER: Member 2. Only call the facade from here. */
public class StructureMenu {
    private final LearningSystemFacade facade;
    private final Scanner scanner;

    public StructureMenu(LearningSystemFacade facade, Scanner scanner) {
        this.facade = facade;
        this.scanner = scanner;
    }

    public void show() {
        // TODO Member 2
    }
}
