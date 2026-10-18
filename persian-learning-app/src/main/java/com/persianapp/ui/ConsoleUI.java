package com.persianapp.ui;

import com.persianapp.facade.LearningSystemFacade;
import java.util.Scanner;

/** Presentation layer: main menu. OWNER: Member 1 */
public class ConsoleUI {
    private final LearningSystemFacade facade;
    private final Scanner scanner = new Scanner(System.in, "UTF-8");

    public ConsoleUI(LearningSystemFacade facade) {
        this.facade = facade;
    }

    /** TODO: show main menu and open ChapterMenu / StructureMenu / ContentMenu / GlossaryMenu. */
    public void start() {
    }
}
