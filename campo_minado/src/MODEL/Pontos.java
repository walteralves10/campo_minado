/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import CONTROLLER.SalvaCampoMinadoGeral;
import javax.swing.JOptionPane;

/**
 *
 * @author walte
 */
public class Pontos extends SalvaCampoMinadoGeral {

    private float acertos;
    //private float erros;
    //private double mediaPontos;
    private String user;

    public Pontos() {
        setAcertos(0);
        setUser("");
    }

    public Pontos(float acertos, String user) {
        this.acertos = acertos;
        this.user = user;
    }

    public void registraPontos(float acertos, String user) {
        pontosList.add(new Pontos(acertos,  user));
    }
    
    public void exibeProduto(){
        String exibeProduto = "";

        if (pontosList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vazio!");
        } else {
            for (Pontos umPonto : pontosList) {
                exibeProduto += umPonto.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, exibeProduto);
        }
    }

//    public void removePontos(String user) {
//        for (int cont = 0; cont < pontosList.size(); cont++) {
//            if (pontosList.get(cont).getUser().contentEquals(user)) {
//                pontosList.remove(cont);
//                break;
//            }
//        }
//    }

    public float getAcertos() {
        return acertos;
    }

    public void setAcertos(float acertos) {
        this.acertos = acertos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Pontos{" + "acertos=" + acertos + ", user=" + user + '}';
    }

}
