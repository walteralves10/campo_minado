package CONTROLLER;

import CONTROLLER.IO;
//import MODEL.Jogador;
import MODEL.Pontos;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SalvaCampoMinadoGeral implements Serializable {
    
    //public static final String MAPA = "mapa.txt";
    //public static final String JOGADOR = "jogador.txt";
    public static final String PONTOS = "pontos.txt";

    protected ArrayList<Pontos> pontosList = new ArrayList<Pontos>();
    
    //protected ArrayList<Jogador> usuarioList = new ArrayList<Jogador>();
}