package org.example.model;

import javax.swing.*;
import java.awt.*;

/**
 * Manage Graphical User Interface (GUI) of the program
 * */
public class Gui extends JFrame {

    /**
     * Constructor - Creates an instance of Gui class
     * Creates and shows the window
     * */
    public Gui(){
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Method that permits to change the panel shows on the current JFrame Object
     * It removes all children then add new JPanel child
     * @param panel The panel to add to JFrame
     * */
    public void SetContentPanel(JPanel panel){
        this.removeAll();
        this.revalidate();
        this.repaint();
        this.add(panel);
    }

    /**
     * Method to get the panel show on the current JFrame Object
     * @return Component Content Pane
     * */
    public Component GetContentPanel(){
        return this.getContentPane();
    }

    /**
     * Method for removing all children components
     * */
    public void ClearAll(){
        this.removeAll();
    }


}
