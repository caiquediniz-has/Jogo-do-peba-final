/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeservadores;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author caique
 */
public class Escudo extends JLabel{
    private Timer timerAndar;
    
    public Escudo(){
        setIcon(new ImageIcon("src/img/peba/escudinho.gif"));
        setLocation(1024, 400);
        setSize(256,256);
        setVisible(true);
    }
    
    
    }

