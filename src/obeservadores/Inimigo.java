/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeservadores;

import janelas.TelaJogo;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class Inimigo extends Personagem{
    private Timer timer;
    private Timer timer2;
    private Timer timer3;
    private TelaJogo telaJogo;
    
    public Inimigo(String caminho, TelaJogo telaJogo) {
        super(caminho);
        this.telaJogo = telaJogo;
        
    }
    
    public void andar(){
        timer = new Timer(5, e ->{
            setLocation(getX()-5, getY());});
            timer.start();
        }
    
    
        

    public void verSeBateuNoPeba(){
        timer2 = new Timer(1 , e -> {
            if(getBounds().intersects(telaJogo.getPebaViado().getBounds())){
                pararDeVerSeBateuNoPeba();
                
                if(!telaJogo.isEscudo()){
                    telaJogo.getPebaViado().setIcon(new ImageIcon("src/img/peba/pebaBase.gif"));
                    telaJogo.setEscudo(true);
                }else if(telaJogo.getVida() == 3){
                   telaJogo.setVida(telaJogo.getVida()-1);
                   telaJogo.getCoracoes().setIcon(new ImageIcon("src/img/coracoes/vidaMedia.gif"));
                }
                else if(telaJogo.getVida() == 2){
                   telaJogo.setVida(telaJogo.getVida()-1);
                   telaJogo.getCoracoes().setIcon(new ImageIcon("src/img/coracoes/vidaUmCoracao.gif"));
                }
            else if(telaJogo.getVida() == 1){
                   telaJogo.pararJogo();
                }}});
            timer2.start();
    }
    
    public void pararDeVerSeBateuNoPeba(){
        timer2.stop();
    }
    public void verSeSaiuDaJanela(){
        timer3 = new Timer(1000, (e) -> {
            if(getX() + getWidth() < 0){
            timer.stop();
            timer2.stop();
            timer3.stop();
            }});timer3.start();
    }
    
    }

