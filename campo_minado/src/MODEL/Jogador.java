/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import CONTROLLER.SalvaCampoMinadoGeral;
import java.util.Date;

/**
 *
 * @author walte
 */
public class Jogador extends SalvaCampoMinadoGeral{
   
    private String nick;
    private Date dataDejogo;

    public Jogador(String nick, Date dataDejogo) {
        this.nick = nick;
        this.dataDejogo = dataDejogo;
    }
    
    public void adicionaJogador(){
        
    }
    
    public void removeJogador(){
        
    }
    
}
