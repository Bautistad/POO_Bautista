/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistaLab2;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario
 */
public class MenuLab2Eva2 {
    
    public static JMenuBar crearMenu() {
        
      JMenuBar menuBar = new JMenuBar();

        // Menú File
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(e -> System.exit(0));

        // Menú Estudiante
        JMenu estuMenu = new JMenu("Estudiante");
        menuBar.add(estuMenu);
        estuMenu.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {
                lab2_estudiante registro = new lab2_estudiante();
                registro.setVisible(true);
            });
        });
        // Menú Profesor
        JMenu profeMenu = new JMenu("Profesor");
        menuBar.add(profeMenu);

        // Menú Help
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        return menuBar;
    }
   
    }
