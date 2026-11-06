/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeservadores;

import janelas.TelaJogo;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author caique
 */
public class ComponenteCenario extends JLabel{
    private TelaJogo telaJogo;
    private Timer timerAndar;
    private Timer timerSaiuDaJanela;
    private String caminho;
    private int x;
    private int y;
    private int largura;
    private int altura;
    
    
    public ComponenteCenario(TelaJogo telaJogo, String caminho, int x, int y, int largura, int altura){
        this.telaJogo = telaJogo;
        this.caminho = caminho;
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        
        setIcon(new ImageIcon(caminho));
        setBounds(x,y,largura,altura);
        setVisible(true);
    }
    
  
    

    public TelaJogo getTelaJogo() {
        return telaJogo;
    }

    public String getCaminho() {
        return caminho;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }
    
    
}
