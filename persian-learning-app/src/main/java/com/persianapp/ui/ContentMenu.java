package com.persianapp.ui;

import com.persianapp.facade.LearningSystemFacade;
import java.util.Scanner;

/** UC-03 Chapter content menu. OWNER: Member 3. Only call the facade from here. */
public class ContentMenu {
    private final LearningSystemFacade facade;
    private final Scanner scanner;

    public ContentMenu(LearningSystemFacade facade, Scanner scanner) {
        this.facade = facade;
        this.scanner = scanner;
    }

    public void show() {
        // TODO Member 3
    }
}
