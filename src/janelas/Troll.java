/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janelas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author caique
 */
public class Troll extends JFrame{
    private JLabel troll;
    
    public Troll(){
        setTitle("troll");
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        troll = new JLabel();
        troll.setIcon(new ImageIcon("src/img/heitor/heitorTroll.png"));
        troll.setLocation(0,0);
        troll.setSize(500,500);
        troll.setVisible(true);
        add(troll);
    }
}
