package org.rdc.model.pages;


import org.rdc.model.ColorPalette;
import org.rdc.model.pages.utils.RoundedBorder;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Landing page of the application
 * */
public class Landing extends JPanel {

    /**
     * Constructor that creates the window with all GUI components
     * */
    public Landing(){
        super();

        // change background color
        this.setBackground(Color.decode(ColorPalette.background));
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        //region Title label
        JLabel lblTitle = new JLabel("Welcome!");
        lblTitle.setForeground(Color.decode(ColorPalette.foreground));
        lblTitle.setBounds(500,100,150,50);
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 50));
        lblTitle.setHorizontalTextPosition(JLabel.RIGHT);
        this.add(lblTitle);
        //endregion

        //region Instructions label
        JLabel lblInstructions = new JLabel("Select your mode");
        lblInstructions.setBounds(500,200,150,50);
        lblInstructions.setFont(new Font("Verdana", Font.PLAIN, 18));
        lblInstructions.setHorizontalTextPosition(JLabel.CENTER);
        lblInstructions.setForeground(Color.decode(ColorPalette.foreground));
        this.add(lblInstructions);
        //endregion

        //region Remote control of another computer button
        JButton btnRemote = new JButton("Remote computer control");
        btnRemote.setBounds(150,250,250,10);
        btnRemote.setBackground(Color.decode(ColorPalette.blueButton));
        btnRemote.setBorder(new RoundedBorder(Color.decode(ColorPalette.blueButton), 0, 18,1, 10));
        btnRemote.setFont(new Font("Verdana", Font.PLAIN, 16));
        btnRemote.setForeground(Color.white);
        btnRemote.setOpaque(true);
        this.add(btnRemote);
        //endregion
    }


}
