/*
; * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeservadores;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author caique
 */
public class Personagem extends JLabel{
   
    
    public Personagem(String caminho){
        setIcon(new ImageIcon(caminho));
        setLocation(1024,426);
        setSize(68,100);
        setVisible(true);
       
        
        
    }
    
    
    }

