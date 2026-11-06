/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janelas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import obeservadores.ObservadorMenuInicial;

public class MenuInicial extends JFrame{
    private JButton iniciarJogo;
    private JButton diario;
    private JButton troll;
    private JButton sair;
    private JLabel titulo;
    private PlanoDeFundo planoDeFundo;
    
    
    
    public MenuInicial(){
        setTitle("Menu Inicial");
        setSize(1024, 688);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        
        
        PlanoDeFundo planoDeFundo = new PlanoDeFundo("/img/planosDeFundo/fundoMenuInicial.png");
        setContentPane(planoDeFundo);
        planoDeFundo.setLayout(null);
        
        titulo = new JLabel();
        titulo.setIcon(new ImageIcon("src/img/titulo.png"));
        titulo.setLocation(0,0);
        titulo.setSize(300, 178);
        titulo.setVisible(true);
        add(titulo);
        
        iniciarJogo = new JButton();
        iniciarJogo.setIcon(new ImageIcon("src/img/botoes/Botao_play(1).png"));
        iniciarJogo.setSize(192,80);
        iniciarJogo.setLocation(275,200);
        iniciarJogo.setContentAreaFilled(false);
        iniciarJogo.setBorderPainted(false);
        iniciarJogo.setFocusPainted(false);
        iniciarJogo.setVisible(true);
        iniciarJogo.addActionListener(new ObservadorMenuInicial(this));
        add(iniciarJogo);
       
        
        diario = new JButton();
        diario.setIcon(new ImageIcon("src/img/botoes/diario.png"));
        diario.setLocation(870,500);
        diario.setSize(128,128);
        diario.setContentAreaFilled(false);
        diario.setBorderPainted(false);
        diario.setFocusPainted(false);
        diario.setVisible(true);
        add(diario);
        
        troll = new JButton();
        troll.setLocation(400,200);
        troll.setSize(400,50);
        troll.setContentAreaFilled(false);
        troll.setBorderPainted(false);
        troll.setFocusPainted(false);
        troll.setVisible(true);
        add(troll);
        troll.addActionListener(new ObservadorMenuInicial(this));
        
        sair = new JButton();
        sair.setIcon(new ImageIcon("src/img/botoes/Botao_sair4x.png"));
        sair.setLocation(275, 400);
        sair.setSize(192,98);
        sair.setContentAreaFilled(false);
        sair.setBorderPainted(false);
        sair.setFocusPainted(false);
        sair.setVisible(true);
        add(sair);
        sair.addActionListener(new ObservadorMenuInicial(this));
        
        
        setVisible(true);
        
        
    }

    public JButton getIniciarJogo() {
        return iniciarJogo;
    }

    public JButton getDiario() {
        return diario;
    }

    public JButton getTroll() {
        return troll;
    }

    public JButton getSair() {
        return sair;
    }
    
   
    
}
