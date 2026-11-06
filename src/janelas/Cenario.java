/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janelas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import motor.GerarCenario;
import motor.GerarChao;
import motor.MoverCenario;
import motor.MoverComponenteCenario;
import obeservadores.Chao;
import obeservadores.ComponenteCenario;

/**
 *
 * @author caique
 */
public class Cenario extends JLabel{
    private JLabel ceu = new JLabel();
    private ComponenteCenario montanhas;
    private TelaJogo telaJogo;
    private ComponenteCenario morros;
    private GerarCenario gerarMontanhas;
    private GerarCenario gerarMorros;
    private ComponenteCenario morrinhiosComCactos;
    private GerarCenario gerarMorrinhosComCactos;
    private ComponenteCenario chao;
    private MoverComponenteCenario moverMontanhas;
    private MoverComponenteCenario moverMorros;
    private MoverComponenteCenario moverMorrinhosComCactos;
    private MoverComponenteCenario moverChao;
    private GerarCenario gerarChao;
   
    
        
        public Cenario(TelaJogo telaJogo){
            this.telaJogo = telaJogo;
            ceu.setIcon(new ImageIcon("src/img/cenario/ceu.png"));
            ceu.setSize(1024, 530);
            ceu.setLocation(0, 0);
            ceu.setVisible(true);
            telaJogo.getCamada().add(ceu, Integer.valueOf(0));
            
            
            montanhas = new ComponenteCenario(telaJogo, "src/img/cenario/montanhas.png", 0, 10, 1024, 688);
            telaJogo.getCamada().add(montanhas, Integer.valueOf(1));
            moverMontanhas = new MoverComponenteCenario(montanhas, 30);
            gerarMontanhas = new GerarCenario(telaJogo, montanhas, 30, 1020,0,1);
            moverMontanhas.start();
            gerarMontanhas.start();
            
            morros = new ComponenteCenario(telaJogo, "src/img/cenario/morros.png", 0, 300, 1024, 254);
            telaJogo.getCamada().add(morros, Integer.valueOf(2));
            gerarMorros = new GerarCenario(telaJogo, morros, 20, 1004,300, 2);
            moverMorros = new MoverComponenteCenario(morros, 20);
            gerarMorros.start();
            moverMorros.start();
            
            morrinhiosComCactos = new ComponenteCenario(telaJogo, "src/img/cenario/morrinhosComCactos.png", 0, 350, 1024, 200);
            telaJogo.getCamada().add(morrinhiosComCactos, Integer.valueOf(3));
            gerarMorrinhosComCactos = new GerarCenario(telaJogo, morrinhiosComCactos, 5, 1020, 350, 3);
            moverMorrinhosComCactos = new MoverComponenteCenario(morrinhiosComCactos, 5);
            gerarMorrinhosComCactos.start();
            moverMorrinhosComCactos.start();
            
            
           chao = new ComponenteCenario(telaJogo, "src/img/chao/chao1.png", 0, 526, 1024, 128);
           telaJogo.getCamada().add(chao, Integer.valueOf(4));
           moverChao = new MoverComponenteCenario(chao, 1);
           gerarChao = new GerarCenario(telaJogo, chao, 1, 990, 526, 4);
           moverChao.start();
           gerarChao.start();
            
           

        }
}
