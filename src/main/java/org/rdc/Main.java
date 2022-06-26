package org.rdc;

import org.rdc.model.Gui;
import org.rdc.model.pages.Landing;

/**
 * Main class of the program
 * Starts the program
 * */
public class Main {
    public static void main(String[] args) {
        // create and show the window
        Gui gui = new Gui();
        gui.SetContentPanel(new Landing());
    }
}