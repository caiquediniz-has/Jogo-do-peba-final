/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janelas;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import motor.GerarInimigo;
import motor.GerarChao;
import motor.GerarEscudo;
import obeservadores.Escudo;

import obeservadores.Inimigo;
import obeservadores.ObservadorTelaJogo;
import obeservadores.Personagem;


public class TelaJogo extends JFrame{
    private JLabel chao;
    private Personagem pebaViado;
    private GerarChao mexerChao;
    private ArrayList<Inimigo> inimigos = new ArrayList<>();
    private GerarInimigo gerarInimigo;
    private Cenario cenario;
    private JLayeredPane camada;
    private GerarChao mexerSolo;
    private int vida = 1;
    private JLabel coracoes;
    private boolean escudo = true;
    
    private GerarEscudo gerarEscudo;
    
             
    public TelaJogo(){
        setTitle("Peba viados'adventures");
        setSize(1024,688);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        camada = new JLayeredPane();
        camada.setBounds(0, 0, 1024, 688);
        camada.setLayout(null);
        add(camada);
        
        coracoes = new JLabel();
        coracoes.setIcon(new ImageIcon("src/img/coracoes/vidaCheia.gif"));
        coracoes.setSize(300, 100);
        coracoes.setLocation(0, 30);
        camada.add(coracoes, Integer.valueOf(7));  
        
        cenario = new Cenario(this);
        
        
        pebaViado = new Personagem("src/img/peba/pebaBase.gif");
        pebaViado.setLocation(0,  465);
        pebaViado.setSize(80, 75);
        
        gerarInimigo = new GerarInimigo(this);
        gerarInimigo.start();
        
        gerarEscudo = new GerarEscudo(this);
        gerarEscudo.start();
        
        
        add(pebaViado);

        
        camada.add(pebaViado, Integer.valueOf(5));
        
        
        
        this.addKeyListener(new ObservadorTelaJogo(this));
        
        setVisible(true);
        
        
    }

    public ArrayList<Inimigo> getInimigos() {
        return inimigos;
    }

    public Personagem getPebaViado() {
        return pebaViado;
    }
    
    public void pararJogo(){
        new MenuInicial();
        this.dispose();
    }

    public JLayeredPane getCamada() {
        return camada;
    }

    public int getVida() {
        return vida;
    }

    public JLabel getCoracoes() {
        return coracoes;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isEscudo() {
        return escudo;
    }

    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }

    
    

    

}
